package zadania.ex8;

public class ParcelValidator implements Validator {

    @Override
    public boolean validate(Parcel parcel) {
        return validateSize(parcel) && validateExpressMode(parcel);
    }

    private boolean validateSize(Parcel parcel){
        return totalSizeLess300(parcel) && eachSizeGreaterThan30(parcel);
    }

    private boolean eachSizeGreaterThan30(Parcel parcel) {
        return parcel.getxLength() >= 30 && parcel.getyLength() >= 30 && parcel.getzLength() >= 30;
    }

    private boolean totalSizeLess300(Parcel parcel) {
        return parcel.getxLength() + parcel.getyLength() + parcel.getzLength() <= 300;
    }

    private boolean validateExpressMode(Parcel parcel) {
        if(parcel.isExpress()){
            return parcel.getWeight() <= 15;
        } else {
            return parcel.getWeight() <= 30;
        }
    }


}
