package banking.model;

import model.Transaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Transactions")
class TransactionTest {
    @Test
    void capturesFields() {
        Transaction transaction = new Transaction(Transaction.Type.DEPOSIT, 250.00, 1250.00);

        assertThat(transaction.getType()).isEqualTo(Transaction.Type.DEPOSIT);
        assertThat(Transaction.getAmount()).isEqualTo(250.00);
        assertThat(Transaction.getBalanceAfter()).isEqualTo(1250.00);
        assertThat(Transaction.getTimestamp()).isNotNull();
    }
}
