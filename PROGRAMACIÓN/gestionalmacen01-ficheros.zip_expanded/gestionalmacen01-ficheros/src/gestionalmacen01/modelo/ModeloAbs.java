package gestionalmacen01.modelo;

import java.util.Collection;
import java.util.List;

/**
 * Abstract class ModeloAbs - Clase de acceso a Modelo de DATOS
 * 
 * @author: Emmanuel Ramos Date: 18/05/2022
 */
public interface ModeloAbs {
	static final String fichero = "productos.objetos";

	boolean cargarProductos();

	boolean salvarProducto();

	public boolean insertarProducto(Producto p);

	boolean borrarProducto(int codigo);

	public Producto buscarProducto(int codigo);

	void listarProductosTodos();

	Collection <Producto> getProductos();

	List<Producto> listarProductosStockMin();

	boolean modificarProducto(Producto nuevo);

}
