import domain.coordinate.Coordinate;
import domain.point.Points;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        Main.start();
    }

    private static void start() {
        //포인트를 입력받는 코드가 먼저와야함 : 기준을 묻는건 Point에 묻도록 하는게 좋을거같기도하고...
        Coordinate coordinate = Coordinate.of();
        // 좌표들을 꺼내와서 표시
        Viewer.viewCoordinate(coordinate);
    }


    // TODO : 좌표 메세지 받아와서 처리를 하고 어떻게 리턴을 할지 고민
    private static Points getCoordinates(Coordinate coordinate) {
        //Input.getCoordinate("좌표를 입력하세요.");
        //여기서 유효성 체크하지않고 여기는 받아오는 역할만 하고, 포인트에 넣으면서

        return null;
    }
}
