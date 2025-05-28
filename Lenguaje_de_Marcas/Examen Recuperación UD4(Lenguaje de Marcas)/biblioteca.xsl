<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Biblioteca</title>
            </head>
            <body>
                <h1>Biblioteca con Descuentos (Filtrado)</h1>
                <xsl:for-each select="biblioteca/autores/autor">
                    <h3>
                        <xsl:value-of select="nombre"></xsl:value-of>
                    </h3>
                <table border="1">
                        <tr>
                            <th>Titulo</th>
                            <th>Género</th>
                            <th>Precio Original</th>
                            <th>Dto.género</th>
                            <th>Dto.precio</th>
                        </tr>
                    <xsl:for-each select="libros/libro[genero = 'Fantasía' or genero = 'Realismo mágico' or genero = 'Aventuras']">
                        <tr>
                            <td>
                                <xsl:value-of select="titulo"></xsl:value-of>
                            </td>
                            <td>
                                <xsl:value-of select="genero"></xsl:value-of>
                            </td>
                            <td>
                                <xsl:value-of select="precio"></xsl:value-of>
                            </td>
                        <td>
                            <xsl:choose>
                                <xsl:when test ="genero = 'Fantasía'">10%</xsl:when>
                                <xsl:when test ="genero = 'Realismo mágico'">15%</xsl:when>
                                <xsl:otherwise>0%</xsl:otherwise>
                            </xsl:choose>
                        </td>
                        <td>
                            <xsl:if test="precio > 15">5%</xsl:if>
                            <xsl:if test="precio &lt; 15">0%</xsl:if>
                        </td>
                        </tr>
                    </xsl:for-each>
                </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
