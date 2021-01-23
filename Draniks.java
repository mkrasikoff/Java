import java.util.*;

public class Draniks {

    public static void main(String[] args) {
        int groupNumber;
        int draniksNumber = 0;
        List<Integer> listPotatoesFromGroups = new ArrayList<>();
        Set<Integer> setPotatoesFromGroups = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        groupNumber = scanner.nextInt();
        for(int i = 0; i <= groupNumber; i++) {
            if(i == groupNumber) {
                draniksNumber = scanner.nextInt();
                break;
            }
            int potatoes = 0;
            int groupSize = scanner.nextInt();
            for(int j = 0; j < groupSize; j++) {
                potatoes += scanner.nextInt();
            }
            listPotatoesFromGroups.add(potatoes);
            setPotatoesFromGroups.add(potatoes);
        }
        System.out.println(listPotatoesFromGroups);
        System.out.println(draniksNumber);

        listPotatoesFromGroups = draniksDivider(listPotatoesFromGroups, draniksNumber, setPotatoesFromGroups.size());
    }

    public static List<Integer> draniksDivider(List<Integer> list, int draniks, int uniqueValues) {
        List<Integer> dividerResult = new ArrayList<>();

        if(draniks % uniqueValues == 0) {
            int reward = draniks / uniqueValues;
            for(int i = 0; i < uniqueValues; i++) {
                dividerResult.add(reward);
            }
        }
        else {

        }
    }
}