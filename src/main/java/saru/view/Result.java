package saru.view;

import saru.domain.CoordinateCalc;

public class Result {
    private CoordinateCalc.SHAPE_TYPE pointNum;
    private double resultValue;

    public Result(CoordinateCalc.SHAPE_TYPE pointNum, double resultValue) {
        this.pointNum = pointNum;
        this.resultValue = resultValue;
    }

    public CoordinateCalc.SHAPE_TYPE getPointNum() {
        return pointNum;
    }

    public void setPointNum(CoordinateCalc.SHAPE_TYPE pointNum) {
        this.pointNum = pointNum;
    }

    public double getResultValue() {
        return resultValue;
    }

    public void setResultValue(double resultValue) {
        this.resultValue = resultValue;
    }
}
