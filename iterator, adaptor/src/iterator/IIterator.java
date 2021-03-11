package iterator;

public interface IIterator {
    void First(); // position을 처음으로 돌림 (0)
    String Next(); // 다음 요소로 이동 (position++)
    Boolean IsDone(); // 확인이 모두 끝난 경우 true
    String CurrentItem(); // 현재 아이템을 가져옴
}
