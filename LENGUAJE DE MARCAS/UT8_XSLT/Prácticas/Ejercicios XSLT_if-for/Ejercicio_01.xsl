<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <h1>
        Cesta
      </h1>
      <table border="1">
        <th style="background-color:pink;">ID Producto</th>
        <th style="background-color:pink;">Nombre</th>
        <th style="background-color:pink;">Origen</th>
        <th style="background-color:pink;">Cantidad</th>
        <th style="background-color:pink;">Precio</th>
        <xsl:for-each select="cesta/producto">
          <tr>
            <td>
              <xsl:value-of select="@idProducto"/>
            </td>
            <td>
              <xsl:value-of select="nombre"/>
            </td>
            <td>
              <xsl:value-of select="origen"/>
            </td>
            <td>
              <xsl:value-of select="cantidad"/>
            </td>
            <td>
              <xsl:value-of select="precio"/>
            </td>
          </tr>
        </xsl:for-each>
      </table>
    </html>
  </xsl:template>
</xsl:stylesheet>
