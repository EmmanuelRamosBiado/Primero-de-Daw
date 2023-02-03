<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <h1>
        <xsl:value-of select="aeropuerto/@nombre"/>
      </h1>
      <p>
        <xsl:value-of select="aeropuerto/@ciudad"/>
      </p>
      <ul>
        <xsl:apply-templates/>
      </ul>
    </html>
  </xsl:template>
  <xsl:template match="vuelo">
    <li>
      <xsl:value-of select="origen"/>
    </li>
  </xsl:template>
</xsl:stylesheet>
