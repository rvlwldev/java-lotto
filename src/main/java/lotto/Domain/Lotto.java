package lotto.Domain;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateLottoLength(numbers);
        validateLottoNumberRange(numbers);
    }

    // TODO: 추가 기능 구현
    private void validateLottoLength(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateLottoNumberRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (1 > number || number > 45) {
                throw new IllegalArgumentException();
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int matchCount(List<Integer> winningNumbers, int bonusNumber) {
        return 0;
    }

}
