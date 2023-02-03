<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <body>
    <xsl:for-each select="cesta/producto">
    He comprado
    <br/>
    <xsl:choose>
      <xsl:when test="cantidad &lt; 12"> menos de una docena de <xsl:value-of select="nombre"/> </xsl:when>
      <xsl:when test="cantidad &gt; 12"> más de una docena de <xsl:value-of select="nombre"/> </xsl:when>
      <xsl:otherwise> una docena de <xsl:value-of select="nombre"/></xsl:otherwise>
    </xsl:choose>
    <br/>
    <br/>
    </xsl:for-each>
    </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
