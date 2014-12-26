package test.ethereum.net;

import org.ethereum.core.Block;
import org.ethereum.net.eth.NewBlockMessage;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongycastle.util.encoders.Hex;

public class NewBlockMessageTest {

    private static final Logger logger = LoggerFactory.getLogger("test");


    /* NEW_BLOCK */

    @Test
    public void test_1() {

        String newBlockRaw = "f9014517f9013Bf90136a0d8faffbc4c4213d35db9007de41cece45d95db7fd6c0f129e158baa888c48eefa01dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d4934794baedba0480e1b882b606cd302d8c4f5701cabac7a0c7d4565fb7b3d98e54a0dec8b76f8c001a784a5689954ce0aedcc1bbe8d13095a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421b8400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000083063477825fc88609184e72a0008301e8488084543ffee680a00de0b9d4a0f0c23546d31f1f70db00d25cf6a7af79365b4e058e4a6a3b69527bc0c0850177ddbebe";

        byte[] payload = Hex.decode(newBlockRaw);

        NewBlockMessage newBlockMessage = new NewBlockMessage(payload);
        logger.info( newBlockMessage.toString() );
    }

    @Test
    public void test_2(){

        Block block = new Block(
                Hex.decode("f90277f8cfa0887ef3904d3c464cbb3ce2a7e2ce02c57b1a38caaa5013ad1202ead0fc1077baa0a962ba850109a5112e7bd3109db477014057b478772825173cc3da54cfc3264e94407d73d8a49eeb85d32cf465507dd71d507100c180a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b42180830200000380830f42408086014997893f1080a000000000000000000000000000000000000000000000000000000000000018e9c0f901a2f8cfa0955f36d073ccb026b78ab3424c15cf966a7563aa270413859f78702b9e8e22cba01dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347942bd26d8f796719923ff13d295644f9b45db1f73080a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b42180830200000180830f4240808601499789326680a00000000000000000000000000000000000000000000000000000000000010da5f8cfa0717e058643634a0f80b9cf33da423d304dabaa826c586f50a783ba6c70cfd60da01dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d4934794f92c0f3e4825f09490ca264dc0cdacffeb566f0680a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421a056e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b42180830200000280830f424080860149978936fe80a0000000000000000000000000000000000000000000000000000000000001d01f"));
        byte[] diff = new byte[] {0};

        NewBlockMessage nbm = new NewBlockMessage(block, diff);

        System.out.println(nbm.toString());

    }

}
