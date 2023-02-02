/** Implementa la parte de Modelo de Datos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModeloArrayList implements ModeloAbs {
	protected ArrayList<Producto> lista;

	public ModeloArrayList() {
		lista = new ArrayList<Producto>();
		cargarProductos();
	}

	public boolean insertarProducto(Producto p) {
		assert (p != null); // No permito productos nulos
		lista.add(p);
		salvarProducto();
		return true;
	}

	public boolean borrarProducto(int codigo) {
		Producto p = buscarProducto(codigo);
		if (p != null) {
			// Remove null
			lista.remove(p);
			salvarProducto();
			return true;
		}
		return false;
	}

	public Producto buscarProducto(int codigo) {
		for (Producto p : lista) {
			if (p.getCodigo() == codigo) {
				return p;
			}
		}
		return null;
	}
	
	public List <Producto> getProductos(){
		return lista;
	}

	// Funciona pero no es una solución independiente del la mécanismo de salida.
	// El acceso a datos debe ser independiente de la visualización de los mismos.
	public void listarProductosTodos() {
		int i = 1;
		for (Producto p : lista) {
			System.out.println(" Nº " + i + " " + p);
			i++;
		}
	}

	// Solo chequea si el producto ya existia en el almacen.
	// No tiene que hacer nada pues se ha cambiado la referencia
	public boolean modificarProducto(Producto nuevo) {
		Producto p;
		int i = lista.indexOf(nuevo);
		// Si no esta devuelvo false
		salvarProducto();
		return (i != -1);
	}

	// Devuelvo una lista con los productos con stock mínimo
	// Será el programa principal quien se encargue de mostrarlos
	public List<Producto> listarProductosStockMin() {

		List<Producto> resu1 = new ArrayList<Producto>();

		for (Producto p : lista) {
			if (p.getStock() <= p.getStock_min()) {
				resu1.add(p);
			}
		}
		// Otra forma: Crea una nueva lista a partir de la original y borro los que
		// supera el stock mínimo
		List<Producto> resu2 = new ArrayList<Producto>(lista);
		// Elimino los que superan el mínimo
		resu2.removeIf(p -> (p.getStock() > p.getStock_min()));

		// Otra forma: Expresiones lambda sobre stream
		List<Producto> resu3 = lista.stream().filter(p -> (p.getStock() <= p.getStock_min()))
				.collect(Collectors.toList());

		return resu1;
	}

	@Override
	public boolean cargarProductos() {

		FileInputStream fp = null;
		ObjectInputStream fpo = null;

		try {
			fp = new FileInputStream(ModeloAbs.fichero);
			try {
				fpo = new ObjectInputStream(fp);
			} catch (IOException e) {

			}
		} catch (FileNotFoundException e) {
			return false;
		}

		try {
			while (true) {
				Producto pro = (Producto) fpo.readObject();
				lista.add(pro);
			}
		} catch (ClassNotFoundException e) {
			return false;
		} catch (IOException e) {

		}

		try {
			fpo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean salvarProducto() {

		try {
			// Creo Flujo de tipo fichero de byte
			FileOutputStream fos = new FileOutputStream(ModeloAbs.fichero);
			;
			// Creo un Flujo de objetos sobre el fichero
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (Producto pro : lista) {
				oos.writeObject(pro);
			}
			oos.close();

		} catch (IOException ex) {
			return false;
		}
		return true;
	}
}
