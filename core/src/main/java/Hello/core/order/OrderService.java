package Hello.core.order;

public interface OrderService {
    Order createOder(Long memberId, String itemName, int itemPrice);
}
