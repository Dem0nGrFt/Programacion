<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Bookstore</title>
            </head>
            <body>
                <h2>Bookstore</h2>
                <table border="1">
                    <tr style="background-color: lightgreen">
                        <th>Title</th>
                        <th>Author</th>
                        <th>Year</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="bookstore/book">
                    <tr>
                        <td>
                            <xsl:value-of select="title"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="author"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="year"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="price"></xsl:value-of>
                        </td>
                    </tr>
                </xsl:for-each>
                </table>


                <h2>Bookstore - Books in English</h2>
                <table border="1">
                    <tr style="background-color: lightgreen">
                        <th>Title</th>
                        <th>Author</th>
                        <th>Year</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="bookstore/book">
                    <tr>
                        <td>
                            <xsl:value-of select="title"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="author"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="year"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="price"></xsl:value-of>
                        </td>
                    </tr>
                </xsl:for-each>
                </table>

                <h2>Bookstore - Books in English</h2>
                <table border="1">
                    <tr style="background-color: lightgreen">
                        <th>Title</th>
                        <th>Author</th>
                        <th>Year</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="bookstore/book">
                    <xsl:sort select="year" order="descending"/>
                    <tr>
                        <td>
                            <xsl:value-of select="title"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="author"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="year"></xsl:value-of>
                        </td>
                        <td>
                            <xsl:value-of select="price"></xsl:value-of>
                        </td>
                    </tr>
                </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>