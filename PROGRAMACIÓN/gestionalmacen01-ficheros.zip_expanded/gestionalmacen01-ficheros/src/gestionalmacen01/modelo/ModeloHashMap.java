
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author Emmanuel Ramos 
 * @version 18-5-2022
 */
package gestionalmacen01.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ModeloHashMap implements ModeloAbs {
	private HashMap<Integer, Producto> mapa;

	public ModeloHashMap() {
		mapa = new HashMap<Integer, Producto>();
		cargarProductos();
	}

	public boolean insertarProducto(Producto p) {
		assert (p != null); // No permito productos nulos
		mapa.put(p.getCodigo(), p);
		salvarProducto();
		return true;
	}

	public boolean borrarProducto(int codigo) {
		// Si es null es que no estaba
		if (mapa.remove(codigo) != null) {
			salvarProducto();
			return true;
		} else {
			return false;
		}
	}

	public Producto buscarProducto(int codigo) {
		return mapa.get(codigo);
	}

	// Funciona pero no es una solución independiente del la mécanismo de salida.
	// El acceso a datos debe ser independiente de la visualización de los mismos.
	public void listarProductosTodos() {
		int i = 1;
		for (Producto p : mapa.values()) {
			System.out.println(" Nº " + i + " " + p);
			i++;
		}

		// mapa.values().forEach(p-> System.out.println(p));
	}

	// Devuelvo una lista con los productos con stock mínimo
	// Será el programa principal quien se encargue de mostrarlos
	public List<Producto> listarProductosStockMin() {
		List<Producto> resu1 = new ArrayList<Producto>();
		for (Producto p : mapa.values()) {
			if (p.getStock() <= p.getStock_min()) {
				resu1.add(p);
			}
		}
		// Otra forma: Crea una nueva lista a partir de los valores y borro los que
		// supera el stock mínimo
		List<Producto> resu2 = new ArrayList<Producto>(mapa.values());
		// Elimino los que superan el mínimo
		resu2.removeIf(p -> (p.getStock() > p.getStock_min()));

		return resu1;
	}

	// Solo chequea si el producto ya existia en el almacen.
	// No tiene que hacer nada pues se ha cambiado la referencia
	public boolean modificarProducto(Producto pro) {
		salvarProducto();
		return mapa.containsValue(pro);
	}

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
				mapa.put(pro.codigo, pro);
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

	public boolean salvarProducto() {

		try {
			// Creo Flujo de tipo fichero de byte
			FileOutputStream fos = new FileOutputStream(ModeloAbs.fichero);
			;
			// Creo un Flujo de objetos sobre el fichero
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (Producto pro : mapa.values()) {
				oos.writeObject(pro);
			}
			oos.close();

		} catch (IOException ex) {
			return false;
		}
		return true;
	}

	@Override
	public Collection<Producto> getProductos() {
		// TODO Auto-generated method stub
		return mapa.values();
	}

}
