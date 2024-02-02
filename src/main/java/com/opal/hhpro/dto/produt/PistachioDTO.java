package com.opal.hhpro.dto.produt;


public class PistachioDTO extends ProductDTO {
    private String type;
    private String origin;
    private double purity;
    private String fullDescription;

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPurity() {
        return purity;
    }

    public void setPurity(double purity) {
        this.purity = purity;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
}
