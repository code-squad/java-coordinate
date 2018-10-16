package rentcar.dto;

public class ResultDto {
    private String name;
    private double chargeQuantity;

    public ResultDto(String name, double chargeQuantity) {
        this.name = name;
        this.chargeQuantity = chargeQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChargeQuantity() {
        return chargeQuantity;
    }

    public void setChargeQuantity(double chargeQuantity) {
        this.chargeQuantity = chargeQuantity;
    }
}
