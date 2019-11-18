package day12_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoUtil {
    
    public static Lotto getLotto() {
        HashSet<Integer> hs = new HashSet<>();
        while(hs.size() < 5) {
            hs.add(new Random().nextInt(39) + 1);
        }
        // 尋訪器
        Iterator<Integer> iter = hs.iterator();
        
        Lotto lotto = new Lotto();
        lotto.setNo1(iter.next());
        lotto.setNo2(iter.next());
        lotto.setNo3(iter.next());
        lotto.setNo4(iter.next());
        lotto.setNo5(iter.next());
        
        return lotto;
    }
    
    public static HashSet<Lotto> getLottos(int count) {
        HashSet<Lotto> lottos = new HashSet<>();
        while (lottos.size() < count) {
            lottos.add(LottoUtil.getLotto());
        }
        return lottos;
    }
    
}
