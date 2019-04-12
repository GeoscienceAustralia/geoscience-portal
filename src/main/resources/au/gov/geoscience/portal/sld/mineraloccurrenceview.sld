<StyledLayerDescriptor xmlns="http://www.opengis.net/sld" version="1.0.0"
    xsi:schemaLocation="http://www.opengis.net/sld http://schemas.opengis.net/sld/1.0.0/StyledLayerDescriptor.xsd"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ogc="http://www.opengis.net/ogc"
    xmlns:gml="http://www.opengis.net/gml">
    <NamedLayer>
        <Name>erl:MineralOccurrenceView</Name>
        <UserStyle>
            <Name>mineral-occurrence-view-style</Name>
            <IsDefault>true</IsDefault>
            <FeatureTypeStyle>
                <Rule>
                    <MinScaleDenominator>3000000</MinScaleDenominator>
                    <PointSymbolizer>
                        <Graphic>
                            <Mark>
                                <WellKnownName>circle</WellKnownName>
                                <Fill>
                                    <CssParameter name="fill">#00aa00</CssParameter>
                                </Fill>
                                <Stroke>
                                    <CssParameter name="stroke-width">0.4</CssParameter>
                                </Stroke>
                            </Mark>
                            <Size>8</Size>
                        </Graphic>
                    </PointSymbolizer>
                </Rule>
                <Rule>
                    <MaxScaleDenominator>3000000</MaxScaleDenominator>
                    <PointSymbolizer>
                        <Graphic>
                            <Mark>
                                <WellKnownName>circle</WellKnownName>
                                <Fill>
                                    <CssParameter name="fill">#00aa00</CssParameter>
                                </Fill>
                                <Stroke>
                                    <CssParameter name="stroke-width">0.4</CssParameter>
                                </Stroke>
                            </Mark>
                            <Size>8</Size>
                        </Graphic>
                    </PointSymbolizer>
                    <TextSymbolizer>
                        <Label>
                            <!-- This horrific hack is required to get appschema labels to display correctly -->
                            <ogc:Function name="strSubstringStart">
                                <ogc:PropertyName>erl:name</ogc:PropertyName>
                                <ogc:Function name="parseInt">
                                    <ogc:Literal>27</ogc:Literal>
                                </ogc:Function>
                            </ogc:Function>
                        </Label>                     
                        <Font>
                            <CssParameter name="font-family">SansSerif</CssParameter>
                            <CssParameter name="font-size">12</CssParameter>
                        </Font>
                        <LabelPlacement>
                            <PointPlacement>
                                <AnchorPoint>
                                    <AnchorPointX>0.0</AnchorPointX>
                                    <AnchorPointY>0.5</AnchorPointY>
                                </AnchorPoint>
                                <Displacement>
                                    <DisplacementX>7</DisplacementX>
                                    <DisplacementY>0</DisplacementY>
                                </Displacement>
                            </PointPlacement>
                        </LabelPlacement>
                        <Halo>
                            <Radius>2</Radius>
                            <Fill>
                                <CssParameter name="fill">#ffffff</CssParameter>
                                <CssParameter name="fill-opacity">0.5</CssParameter>
                            </Fill>
                        </Halo>
                    </TextSymbolizer>
                </Rule>
            </FeatureTypeStyle>
        </UserStyle>
    </NamedLayer>
</StyledLayerDescriptor>
