<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" version="1.0" />
    <xsl:template match="antologia">
        <html>
            <body>
                <h1>antologia</h1>
                <p>
                    <xsl:call-template name="titulo" />
                    <xsl:call-template name="autor" />
                </p>
            </body>
        </html>
    </xsl:template>
    <xsl:template name="titulo">
        <br />
        titulo:
        <xsl:apply-templates select="poema/titulo" />
    </xsl:template>
    <xsl:template match="titulo">
        <h4>
            <xsl:apply-templates />
        </h4>
    </xsl:template>
    
    <xsl:template name="autor">
        <br />
        autor:
        <xsl:apply-templates select="poema/autor" />
    </xsl:template>
    <xsl:template match="autor">
        <p><xsl:apply-templates /></p>
    </xsl:template>
</xsl:stylesheet>