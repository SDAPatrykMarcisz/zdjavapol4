package zadania.ex27;

public class Joiner<NASZ_TYP> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(NASZ_TYP ... elements){
        StringBuilder stringBuilder = new StringBuilder();
        if(elements.length > 0){
            stringBuilder.append(elements[0].toString());
        }
        int index = 1;
        while(index < elements.length - 1){
            stringBuilder.append(separator);
            stringBuilder.append(elements[index].toString());
            index++;
        }
        if(elements.length > 1){
            stringBuilder.append(separator);
            stringBuilder.append(elements[elements.length-1].toString());
        }
        return stringBuilder.toString();
    }
}
