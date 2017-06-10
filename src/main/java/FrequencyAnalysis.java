import java.util.HashMap;

public class FrequencyAnalysis {
    public HashMap charDist;
    public char[] charRank;

    public FrequencyAnalysis() {
        charDist = new HashMap(26);

        charDist.put('A',8.55);
        charDist.put('B',1.60);
        charDist.put('C',3.16);
        charDist.put('D',3.87);
        charDist.put('E',12.10);
        charDist.put('F',2.18);
        charDist.put('G',2.09);
        charDist.put('H',4.96);
        charDist.put('I',7.33);
        charDist.put('J',0.22);
        charDist.put('K',0.81);
        charDist.put('L',4.21);
        charDist.put('M',2.53);
        charDist.put('N',7.17);
        charDist.put('O',7.47);
        charDist.put('P',2.07);
        charDist.put('Q',0.10);
        charDist.put('R',6.33);
        charDist.put('S',6.73);
        charDist.put('T',8.94);
        charDist.put('U',2.68);
        charDist.put('V',1.06);
        charDist.put('W',1.83);
        charDist.put('X',0.19);
        charDist.put('Y',1.72);
        charDist.put('Z',0.11);

        charRank = new char[] {'e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','g','y','p','b','v','k','j','x','q','z'};
    }
}