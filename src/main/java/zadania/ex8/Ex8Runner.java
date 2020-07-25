package zadania.ex8;

public class Ex8Runner {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();

        Validator parcelValidator = new ParcelValidator();
        boolean validate = parcelValidator.validate(parcel);

        if(validate){
            System.out.println("Wszystko w porzadku!");
        }
    }
}
