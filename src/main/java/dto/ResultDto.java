package dto;

import java.util.List;

public class ResultDto {
    private double resultValue = -1;
    private List<PointDto> pointsDto;

    public ResultDto(double resultValue, List<PointDto> pointsDto) {
        this.resultValue = resultValue;
        this.pointsDto = pointsDto;
    }

    public ResultDto(List<PointDto> pointsDto) {
        this.pointsDto = pointsDto;
    }

    public double getResultValue() {
        return resultValue;
    }

    public List<PointDto> getPointsDto() {
        return pointsDto;
    }

}
