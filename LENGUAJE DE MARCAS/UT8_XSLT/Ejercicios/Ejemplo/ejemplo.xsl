<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <h1>Directores</h1>
      <xsl:apply-templates/>
    </html>
  </xsl:template>
  <xsl:template match="pelicula">
    <p>
      <xsl:value-of select="director"/>
    </p>
  </xsl:template>
</xsl:stylesheet>
