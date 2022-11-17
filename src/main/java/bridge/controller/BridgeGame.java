package bridge.controller;

import java.util.ArrayList;
import java.util.List;
import bridge.view.InputView;
import bridge.view.OutputView;

/**
 * 다리 건너기 게임을 관리하는 클래스
 * 필드를 추가 가능
 * 패키지 변경 가능
 * 메서드 이름 변경 불가
 * 인자, 반환 타입 추가, 변경 가능
 * 메서드 추가, 변경 가능
 */
public class BridgeGame {

    private final List<String> userAnswer = new ArrayList<>();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private int tryCount = 0;
    private boolean complete = false;

    public void start() {
        outputView.printStart();
    }

    public void length() {
        outputView.printLengthInput();
        inputView.readBridgeSize();
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
        outputView.printMoveInput();
        inputView.readMoving();
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        outputView.printRetry();
        inputView.readGameCommand();
    }

    public void end() {
        outputView.printComplete();
        outputView.printTryCount();
    }
}