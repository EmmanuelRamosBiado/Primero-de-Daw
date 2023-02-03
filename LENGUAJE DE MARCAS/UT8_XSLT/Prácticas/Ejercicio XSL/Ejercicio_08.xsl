<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <h1>
        <xsl:value-of select="aeropuerto/@nombre"/>
      </h1>
      <p><xsl:value-of select="aeropuerto/@ciudad"/>: 
      <a><xsl:attribute name="href"><xsl:value-of select="aeropuerto/@info"/></xsl:attribute>
          Visitar
        </a></p>
      <table border="1">
        <th>Origen</th>
        <th>Destino</th>
        <th>Hora de salida</th>
        <th>Hora de llegada</th>
        <th>Duración del vuelo</th>
        <xsl:apply-templates/>
      </table>
    </html>
  </xsl:template>
  <xsl:template match="vuelo">
    <tr>
      <td>
        <xsl:value-of select="origen"/>
      </td>
      <td>
        <xsl:value-of select="destino"/>
      </td>
      <td>
        <xsl:value-of select="hora-llegada"/>
      </td>
      <td>
        <xsl:value-of select="hora-salida"/>
      </td>
      <td>
        <xsl:value-of select="duracion/@horas"/>
      </td>
    </tr>
  </xsl:template>
</xsl:stylesheet>
