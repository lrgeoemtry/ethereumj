     package test.ethereum.net;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.ethereum.net.eth.BlockHashesMessage;
import org.ethereum.net.eth.EthMessageCodes;
import org.junit.Test;
import org.spongycastle.util.encoders.Hex;

import java.util.Arrays;

public class BlockHashesMessageTest {

    /* BLOCK_HASHES_MESSAGE */
    
    @Test /* BlockHashesMessage 1 from network */
    public void test_1() {
        
        String blockHashesMessageRaw = "f9108114a04ee6424d776b3f59affc20bc2de59e67f36e22cc07897ff8df152242c921716ba07d2fe4df0dbbc9011da2b3bf177f0c6b7e71a11c509035c5d751efa5cf9b4817a0e32d9ac70a95a5084447143cba713ceae2cae614e79817bf76fc081480509912a07167d51e20b6bdd1457101b81300519f9eeb741008ba45ff9682912b96cc3231a05dc40186092d08fdb83e938774b318ce598ed3b44f2b0382cd8991d912135a08a08b7036a775a190094c4eb994a0e7a2f89ffa59d1f3461bd1de104f37aa0098eca0b0301705ba576e32d9e47fc5983fa49ba5e8f00e3e2d0a7e1b281a9625445ff5a033124a8da5113edff6afe4fb5efece3741895a7fba3d1c167586f4c3374f1d78a03c1aa5542d3fdafbd7b03c2085bcc940343f26b9711f8a215c4ea3f84364472fa0c959599f529ac1f085c4f9aadc0a17aad1c61311b0ad6b4e3f4a12eb3f93ad76a0eb26c71de8706185a717e21753b6e47e2d4b34e00e034f64b6c76f2de3af7f75a0e679e8b274cca37c2e449b993eb2228d062a78b4406f9323fa48fa182de640f3a0df26cd027609ad25739a041b3d9d81705b4fa73c86f6df04b836984e8b4c8489a0cfaad0dba4a266e9ccbf7474079647a4ac659d93f071091c90d454c1af48ae25a06f5232f5058b5b70fcd28070dfe716a6327b899d639cff2106b9907978c6dc7ca0ba3266b0a3877b4a81e8f6dd6c36aeb587a1a14acd10976d3ed6f686a35d8c13a08014d1ff07221b83a1996e6b80546310d430589f7cd6a9137e16f14c3a49e855a0dfce9bc6e8947b440f03a86f37ae639a4446ed27d8f56f9c7c1b00e9fc120aa2a03cfd099c3e1c974284477f6366b242372833ff6f618b4fd94d9cefb9912eaee4a085c4ac37b8a8d466dc66870838ccdec34a5df6f6548bf6c06cbb645f6980491ea0f3085b2449501113981af5274706a9dfea891fb28a6228375ba2cd28970d37fda0a63e45fcc5050d52a0eaee0a0c118e1b94c8ee6f2312e01f143f27fd360aee67a0c51c71816bf7c79475a7ebc1f1dcd6137e0950c4db57d7b947372751c114b6bea05e66b8849b5a2e90d98663c0428ca7c7483fbe8bcd1ae77f9dfd91fccb7a66ffa008a1e472e019b8f5b3b899ad1185c0fe953ee336ae3fe807cceca5e47728bcdda04700e66f3a96965ab08a7760f0ac9f15f4a282cfc09a50dce09e573e27054a3aa0c820e85e4b5bbf8f19f44e00b9ac43bbc2148f599b48c1257088616cf1909d50a0201bd78f79fded601eaa4b7484b079bf5e6214ee25b633988008ffbc2ff6fe86a033cb48d0197a0dfddd1ad4623df688784bbba4ada03a80ac560cf4f92d3eaf7fa053f100fa3088a48c17dba35efcf96a4c02a15a136d16c9b32bafff5771e969f2a0ab3db92acb1f5552c90d65efb93ba505d7390db6cfe2ddd7768282931b9d0e64a0e6cec0ca20da89288461e69d6e5eaaf466cc15feab145206a0f9e19783aab0b5a0c6bff7771c8d4d59dfe39abbc980b0e21fc68295961a0804139f10ce827e7f2da02bb1ce267a1fb3757daeebfc8ecac8ad417b66fa6a5211d3fc1cf2f6f401a048a06393a130996fce7024030531869d66ad4ed0264bc6efc34ebc246e9b739baf14a013ca792bb72a8f6f641af3d9c7ba4739181b6fbffecea9319fa3afe9185fe996a03330c6e385b275391ed715867746c8fb9eb7b6b939e9a2ca561593e54148618ba00accdcad654f4a9fdefd7a69cabc47e02a60840b93890a70b4e378189933264aa0a0e507ee34150a0cb777254a6fb5fc658d19f03fe00be84d6c2fb92eff1bf008a0319e9bc452c23f7dae6368729a6f6ce7c557a3f4c8c031902a84d07a0ad7279aa0b46e49cbe43a01deef74bb03727987822678f840f665251c4fe060c4d43cef99a0c6c820d402c873b50adc53582195f97ba4dcea02c4aac1f37680c1c5b786d3a1a070740ab0275db1cb4f06d1e7320984b3ad708dfbd999879e5bde12cda5641583a0b537199eabbf6aaa120ab4c3cbeed02311f2e2e7158b5f3a239147522d1c001aa0bdeaf137c59ee9985dcbae18410a223bd0cc061659ae76c85bff34c3831f4181a079a4d2a87b47f848524378abc99dd6b205ee19af316c8f3769f6ad870745845fa037dc76bdad66f0fb907b3244eb64c4193e3d84b4c81c0c2e006ad57866db0d48a071aaa649a631f724f95e71dd78dd97b69ab93d75082042944b76333c51bc6e85a0a22b3c6eb1b43fc1ffa79a6ff78255074cff4db7d3bbafae7ae13c3b493eeb5aa06426f3bc465d89db7fee576b1f97c97f13744dfa33561ece7e0d38bbcd34e9f0a0ff62c6aa7567b262f31fbcc794ac46bd96504ccb8f98451ea034b8aa434c6bcca06b942d48699b609829f1ecc89db076d59faec6664af3dc2b13da46d40daa9763a05f325608455045794b77a5fd8f2ed12e7cda40df2d8aeeec7e5a517b455a8157a0c054b8bd53545d78206de7fa0c8e206997d9c68f435fe06c3057f9545ba196f0a08ad94a4c53c397f3c63bffdcd790486c3f7588d155d6d86e0ff08907c7f7f682a0c3d9f991dac6c0e3ba032b6da7bc0cdc38c8c76e95a12c4f86326d09a2d69754a01b1cba8bdcbbbf02b9b876194713dfaf941f3f03bfc4a91746187e001edbb20ea0ec32df0dc1ce371c866d817f90497e620efb59b1baabe1e90f00e28fb57e1823a0d3a29747ed5cfed3467687eb63adc28bc646a5c66f610f55bb840c8e59f8b360a010bcf47b3c6c09b919db63b8e054458fad45f1dd8ca8cfda9759e5c53d90b0eba0075a78486d263b530834e88572a5e750658e263c1e3a3dc5801039101ece5ae9a0119b8487dc9ba0a2e95cb0dde90c26a70b48611baed1c9cca5ec73c161e8c98fa032c248078737a2f8542e70edf44854f87544b540a47c55292a0c718c57fa4578a0f38d4b93d2edc95ed526dc7f65d01bddbfb1e3e14f9a870bc3b23b164db62b24a030649acc70269c05316bfa3c20452ea21cff552c1e4da38e3fdde05371027660a000db5540f1ffd4d21aa351c511806e675cc3348604322c34e28970f9060e8d9fa06be5873726f8a76871141255c1332f4b1fb11906a5ab352ac1c8f262f2a0a817a0ae40366642d2f4d6b19e61978e84a27170648315bf93772bd9771f55abd61bbba0b8e6e8cb6008ae9a73a8d6b6d04e25d24e87b2f6f20a6714e59032550e37e213a0db0272777c2a5b49a89852bc5858bb531a7b37d08f72a4a5a9d109a40788d8c6a0d6fef3c812213467205f47f3edece2d74908e8cab599a5e42425520ad6b002e3a084856e32b9e8a0a4db75b4586ae492528f427fc814c2086340d942d24a1eb3bda0121bf2d712eb87605253775a4f93cd125e3c714388c74a4a5a321a43b8fe912aa0e13b4ddd63b6bd4abfff393463c62f298238d118c134328eee255b7fc191227ea01e278eab5967765720e5b791684a9dbe3d8d46e39c5dd615de92f02419a70fcda0a26ad0b4c36c77e619fe3100b9a44447c9d16a7db1780014cf6f409ee73145d7a0d113188b5bd282b9e9fd8e58df4431725ef85098db0bc845ed3a44132cc597efa0d303b816fbfcabe1c2eb6507ed886f6c35fa423d02ba0c5b38e268dafb38231aa017786974a83c2513e69451ae7a0bfed75f4fe09b194ae979a467e6f615bc08f1a07bde7299bbae3ff0178eae928f465070a88db0df33c4c3de53c681b8eaf17f1aa0d0c0e668f5bd6bd36b727688ba6212128390400ae3f00b42be3c2b587db24b75a0ee437f296d523f07de580979e598e522a05c0025ea8f79c7fbdbee0b679c3382a01cb65eaf5a15bd573d26fb4100208dd9389f87c1151bf46f77e6df8e3a113638a05c707c3a379ef1e2587dd0c60b252e8eb62992f0e6f3c2d7a964f0c6e9fbc3cda05ba3646ffacb6cf0cd648b4d471105291a217b23e118581f02ecd0b73fdb4691a0c102b0807c0f495eea1fa1000b9eedb2f692ab7e71c9dd47e83792e4153d3145a0ee15b8a5ef01c5fcfa73f29028b5310268302bcdf1a1a58a30d3027f375e08fda0d44965bf82d2c77e3e92d1c0e1091f87858c5e1b11b61db46feb57ebd7c046c5a04f34602a1e223e5e1325d3f55e0d8c10c0cacfdf490eb909c105876d62cb6912a0fbdc0438cd3cb503bff3f206cea3a02728ca7abd1b3316c5c1ed5cd59a79cc1ba00f628b7c8c50137b0c78ef962f6e6ee299b6600caa1dcd492c162041e2cfa893a0d9bb3e9b92d2246f00d2f28b544c9cd8c187d31d8a9f3d96a4368df575156d0ea0fa7159b9b87ea9943d12f4003e49c90b436a0654bb6ce6bcc979a7decc45ee1ca095052c3e80bedc1cb11aa0944fef5bcdc0e270fac53f8a416e7bad469e8cbbf6a0b83edf3de91030ee463552f8297d190b11068f5419d77c34e7e461f09443be35a0e4f4c4a3041e89f801e366aa6816e951d90d95ac87764fe1fe9bca9b224fb34da0796a235e7afb0160ed5a13a59649ac3ca5fda480a416741f8e9f6d6bf047d59aa041171c6698700a5f8519250d560053e4cc0696d9c878f3bc2aae47bd80918baea0c2918de602864702d9cb82ec306ff3167c687847caa0cabf707bb7691d9cd35da092c31980bd54614ce7b942d22c99200c2348b78d830ecc07775f4d72994df6b7a095f5cdbc3780f2214fc646c00cba5207c57c710ec01d3ab1c99b57d2985ae110a0b3cb73c4db8f9804456053c56ca19b0c7192a01e0b9df8d2438511fc36392be5a005e6f2ff464bbbac673aa2265b2e539e1de710cb5fa478ceda3f86572d4f22c2a0142bbc3c5165103b52b03d3ac7649d27f28f8d23244203f2dad6ac0f86c23288a06ee55fe32ec8b5832c099e83d802e24bc7b2d8255c9e4cdbcb28b190f06643eda0d119d6a03a7f77fd5af0804e1d0a1cd7e4b22b39b8554811fa014949db2791fca00fcd650300dc9383c6a3c4530e63cc29e28c8a773950faf2b886d805a1075ba3a0d4d65579b429665f8eece57164610cddde236e67d4a3a8e9ab518d19b4a5d6f4a07f3db2b8df96ff63907ac11dcca8f499bbb9a1e1ed021d13c6c29d1ef3337439a0ed254029ceb98dea0a11967a0dbf50b84d262f0397a7bcaac7c95fd52090af9fa0a879c624e761b93047c76db45ef4f2408075d5cd6190bd281b4efe1f034726a5a0a07e9452ebb9ef9f56e9e05d434ae452ee9972bc7f7ff9c729117608953b146fa0ee672fc517fb4c9a957ec3a8ded2a2fd89b80c398f393e29b1e98102e8f61053a0b61db41a25bbaa6acbb468b20a0085a74edcafefd8b0d78d8ee095387d0198efa0d612101516e4cdedbd21345b4caf48f96e82233f4f361bb3f96d77925fa667ada077dc1f4a8b062581425106878839c7e210abe2b38735bb9d7db8011204327d0ca0e152b9b0ab7499bee9bdfb14c3c3dc84072669506765959b3da1f6169e4ed458a0455408387e6c5b029b0d51f7d617a4d1dc4895fa6eda09455cc2ee62c08d907ea01fb1a00145067c01d2ac77f32edede63eb8b70a4308126dd505ce7b131dff013a064254a100bc90a6976fe0c41a91f1dc4a989a849b27299a88c3c327ed2b0bf96a08b13c687cb586af34da7b53329dd884fb6f903b2dd783cf6e72643ffb0331d6da011566138aa5f1ae4634bb3157557b57ac05d0c6eaa7f3f5e7cfaadfc77f34743a09aa82ceca9faba8fd1f3d00c4da529320e90dc141d70995cb52bfafdb92873d1a0ad3ec8c67e9a836420a3de77ade645f064ae1b642272014879e18ea6c56bbcfaa077f6a32b87b81d0ff453906c5098c0146190413cb0d3d4a505af2db3402df19ba0c99fb3ba58b9d24a7e07bcfe1a4de27e0563fbbf6d1c85b77f9f70c61e302f5ca03b5380620a07d1b4f0050a832a8865e58a8625df072c10bb6963a73fbc3fb649a05a29c29b6d492235af1d7978813502bea84bd1c79209374c50cd634e1fd501f7";
        
        byte[] payload = Hex.decode(blockHashesMessageRaw);
        BlockHashesMessage blockHashesMessage = new BlockHashesMessage(payload);
        System.out.println(blockHashesMessage);
        
        assertEquals(EthMessageCodes.BLOCK_HASHES, blockHashesMessage.getCommand());
        assertEquals(128, blockHashesMessage.getBlockHashes().size());
        // TODO maybe also assert values for individual hashes
        assertEquals(null, blockHashesMessage.getAnswerMessage());
    }
    
    @Test /* BlockHashesMessage 2 from new */
    public void test_2() {
        List<byte[]> blockHashes = Arrays.asList(
            Hex.decode("4ee6424d776b3f59affc20bc2de59e67f36e22cc07897ff8df152242c921716b"),
            Hex.decode("7d2fe4df0dbbc9011da2b3bf177f0c6b7e71a11c509035c5d751efa5cf9b4817")
        );
        BlockHashesMessage blockHashesMessage = new BlockHashesMessage(blockHashes);
        System.out.println(blockHashesMessage);
        
        String expected = "f84304a04ee6424d776b3f59affc20bc2de59e67f36e22cc07897ff8df152242c921716ba07d2fe4df0dbbc9011da2b3bf177f0c6b7e71a11c509035c5d751efa5cf9b4817";
        assertEquals(expected, Hex.toHexString(blockHashesMessage.getEncoded()));
        
        assertEquals(EthMessageCodes.BLOCK_HASHES, blockHashesMessage.getCommand());
        assertEquals(2, blockHashesMessage.getBlockHashes().size());
        // TODO maybe also assert values for individual hashes
        assertEquals(null, blockHashesMessage.getAnswerMessage());
    }
}
