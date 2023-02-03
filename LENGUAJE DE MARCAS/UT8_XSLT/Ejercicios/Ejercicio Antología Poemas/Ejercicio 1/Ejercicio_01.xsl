<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output encoding="UTF-8"/>
  
  <xsl:template match="antologia">
    <html>
      <head>
        <title>Antología</title>
      </head>
      <body>
        <h1>Antología</h1>
        <xsl:apply-templates/>
      </body>
    </html>
  </xsl:template>
  
  <xsl:template match="poema">
    <xsl:apply-templates/>
  </xsl:template>
  
  <xsl:template match="autor">
    <h4>
      Emmanuel Ramos Biado
    </h4>
  </xsl:template>
  
  <xsl:template match="nombre">
    <xsl:value-of select="."/>
  </xsl:template>
  
  <xsl:template match="apellido">
    <xsl:value-of select="."/>
  </xsl:template>
  
  <xsl:template match="titulo">
    <h2>
      Poema de 1º DAW
    </h2>
  </xsl:template>
  
  <xsl:template match="subtitulo">
    <h5>
      <xsl:value-of select="."/>
    </h5>
  </xsl:template>
  
  <xsl:template match="estrofa">
    <p>
      <xsl:apply-templates/>
    </p>
  </xsl:template>
  
  <xsl:template match="verso">
    <p>
      <xsl:value-of select="."/>
      <br/>
    </p>
  </xsl:template>
  
</xsl:stylesheet>