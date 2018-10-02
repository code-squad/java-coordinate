package dto;

import java.util.List;

public class GraphDto {

    private List<LineDto> graphDto;

    public GraphDto(List<LineDto> graphDto){
        this.graphDto = graphDto;
    }

    public List<LineDto> getGraphDto() {
        return this.graphDto;
    }

}
