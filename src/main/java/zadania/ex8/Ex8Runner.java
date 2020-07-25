package zadania.ex8;

public class Ex8Runner {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(10, 10, 10, 10, true);

        Validator parcelValidator = new ParcelValidator();
        boolean validate = parcelValidator.validate(parcel);

        if(validate){
            System.out.println("Wszystko w porzadku!");
        }
    }
}
