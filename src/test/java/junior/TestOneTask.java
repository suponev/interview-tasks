package junior;

import com.google.common.collect.Lists;
import it.suponev.jit.junior.one.model.Client;
import it.suponev.jit.junior.one.model.Status;
import it.suponev.jit.junior.one.TaskOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestOneTask {

    private final TaskOne task;
    private final String firstLit = "п";

    public TestOneTask() {
        task = new TaskOne();
    }

    @Test
    public void testOne() {
        List<Client> clients = Lists.newArrayList(
                new Client("Антон", Status.GOLD),
                new Client("Анна", Status.GOLD),
                new Client("Пётр", Status.STANDARD),
                new Client("Николай", Status.STANDARD),
                new Client("Павел", Status.STANDARD),
                new Client("Игорь", Status.GOLD),
                new Client("Иван", Status.STANDARD),
                new Client("Павел", Status.GOLD)
        );
        Client foundClient = task.findAnyGoldClient(clients);
        Assert.assertNotNull(foundClient);
        Assert.assertNotNull(foundClient.getName());
        Assert.assertNotNull(foundClient.getStatus());
        Assert.assertTrue(foundClient.getName().toLowerCase().startsWith(firstLit));
    }
}
