package dto;

import java.util.List;

public class LineDto {

    private List<PointDto> lineDto;
    private int lineNum;

    public LineDto(List<PointDto> lineDto, int lineNum) {
        this.lineDto = lineDto;
        this.lineNum = lineNum;
    }

    public List<PointDto> getLineDto() {
        return this.lineDto;
    }

    public int getLineNum() {
        return this.lineNum;
    }

}
