package project5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {
	
	JamesBond jb;
	@Before
	public void setUp() throws Exception {
		jb = new JamesBond();
	}

	@After
	public void tearDown() throws Exception {
		jb = null;
	}


	@Test
	public void testcase0() { 
	
	 assertFalse(jb.bondRegex("("));
	}
	
	@Test
	public void testcase1() { 
	
	 assertFalse(jb.bondRegex("(("));
	}
	
	@Test
	public void testcase2() { 
	
	 assertFalse(jb.bondRegex("((("));
	}
	
	@Test
	public void testcase3() { 
	
	 assertFalse(jb.bondRegex("(()"));
	}
	
	@Test
	public void testcase4() { 
	
	 assertTrue(jb.bondRegex("((007)"));
	}
	
	@Test
	public void testcase5() { 
	
	 assertFalse(jb.bondRegex("((07)"));
	}
	
	@Test
	public void testcase6() { 
	
	 assertFalse(jb.bondRegex("((7)"));
	}
	
	@Test
	public void testcase7() { 
	
	 assertFalse(jb.bondRegex("()"));
	}
	
	@Test
	public void testcase8() { 
	
	 assertFalse(jb.bondRegex("()("));
	}
	
	@Test
	public void testcase9() { 
	
	 assertFalse(jb.bondRegex("())"));
	}
	
	@Test
	public void testcase10() { 
	
	 assertTrue(jb.bondRegex("()007)"));
	}
	
	@Test
	public void testcase11() { 
	
	 assertFalse(jb.bondRegex("()07)"));
	}
	
	@Test
	public void testcase12() { 
	
	 assertFalse(jb.bondRegex("()7)"));
	}
	
	@Test
	public void testcase13() { 
	
	 assertFalse(jb.bondRegex("(0("));
	}
	
	@Test
	public void testcase14() { 
	
	 assertFalse(jb.bondRegex("(0(("));
	}
	
	@Test
	public void testcase15() { 
	
	 assertFalse(jb.bondRegex("(0()"));
	}
	
	@Test
	public void testcase16() { 
	
	 assertTrue(jb.bondRegex("(0(007)"));
	}
	
	@Test
	public void testcase17() { 
	
	 assertFalse(jb.bondRegex("(0(07)"));
	}
	
	@Test
	public void testcase18() { 
	
	 assertFalse(jb.bondRegex("(0(7)"));
	}
	
	@Test
	public void testcase19() { 
	
	 assertFalse(jb.bondRegex("(0)"));
	}
	
	@Test
	public void testcase20() { 
	
	 assertFalse(jb.bondRegex("(0)("));
	}
	
	@Test
	public void testcase21() { 
	
	 assertFalse(jb.bondRegex("(0))"));
	}
	
	@Test
	public void testcase22() { 
	
	 assertTrue(jb.bondRegex("(0)007)"));
	}
	
	@Test
	public void testcase23() { 
	
	 assertFalse(jb.bondRegex("(0)07)"));
	}
	
	@Test
	public void testcase24() { 
	
	 assertFalse(jb.bondRegex("(0)7)"));
	}
	
	@Test
	public void testcase25() { 
	
	 assertFalse(jb.bondRegex("(00("));
	}
	
	@Test
	public void testcase26() { 
	
	 assertFalse(jb.bondRegex("(00(("));
	}
	
	@Test
	public void testcase27() { 
	
	 assertFalse(jb.bondRegex("(00()"));
	}
	
	@Test
	public void testcase28() { 
	
	 assertTrue(jb.bondRegex("(00(007)"));
	}
	
	@Test
	public void testcase29() { 
	
	 assertFalse(jb.bondRegex("(00(07)"));
	}
	
	@Test
	public void testcase30() { 
	
	 assertFalse(jb.bondRegex("(00(7)"));
	}
	
	@Test
	public void testcase31() { 
	
	 assertFalse(jb.bondRegex("(00)"));
	}
	
	@Test
	public void testcase32() { 
	
	 assertFalse(jb.bondRegex("(00)("));
	}
	
	@Test
	public void testcase33() { 
	
	 assertFalse(jb.bondRegex("(00))"));
	}
	
	@Test
	public void testcase34() { 
	
	 assertTrue(jb.bondRegex("(00)007)"));
	}
	
	@Test
	public void testcase35() { 
	
	 assertFalse(jb.bondRegex("(00)07)"));
	}
	
	@Test
	public void testcase36() { 
	
	 assertFalse(jb.bondRegex("(00)7)"));
	}
	
	@Test
	public void testcase37() { 
	
	 assertFalse(jb.bondRegex("(000("));
	}
	
	@Test
	public void testcase38() { 
	
	 assertFalse(jb.bondRegex("(000)"));
	}
	
	@Test
	public void testcase39() { 
	
	 assertTrue(jb.bondRegex("(000007)"));
	}
	
	@Test
	public void testcase40() { 
	
	 assertTrue(jb.bondRegex("(00007)"));
	}
	
	@Test
	public void testcase41() { 
	
	 assertTrue(jb.bondRegex("(0007)"));
	}
	
	@Test
	public void testcase42() { 
	
	 assertFalse(jb.bondRegex("(001("));
	}
	
	@Test
	public void testcase43() { 
	
	 assertFalse(jb.bondRegex("(001)"));
	}
	
	@Test
	public void testcase44() { 
	
	 assertTrue(jb.bondRegex("(001007)"));
	}
	
	@Test
	public void testcase45() { 
	
	 assertFalse(jb.bondRegex("(00107)"));
	}
	
	@Test
	public void testcase46() { 
	
	 assertFalse(jb.bondRegex("(0017)"));
	}
	
	@Test
	public void testcase47() { 
	
	 assertFalse(jb.bondRegex("(002("));
	}
	
	@Test
	public void testcase48() { 
	
	 assertFalse(jb.bondRegex("(002)"));
	}
	
	@Test
	public void testcase49() { 
	
	 assertTrue(jb.bondRegex("(002007)"));
	}
	
	@Test
	public void testcase50() { 
	
	 assertFalse(jb.bondRegex("(00207)"));
	}
	
	@Test
	public void testcase51() { 
	
	 assertFalse(jb.bondRegex("(0027)"));
	}
	
	@Test
	public void testcase52() { 
	
	 assertFalse(jb.bondRegex("(003("));
	}
	
	@Test
	public void testcase53() { 
	
	 assertFalse(jb.bondRegex("(003)"));
	}
	
	@Test
	public void testcase54() { 
	
	 assertTrue(jb.bondRegex("(003007)"));
	}
	
	@Test
	public void testcase55() { 
	
	 assertFalse(jb.bondRegex("(00307)"));
	}
	
	@Test
	public void testcase56() { 
	
	 assertFalse(jb.bondRegex("(0037)"));
	}
	
	@Test
	public void testcase57() { 
	
	 assertFalse(jb.bondRegex("(004("));
	}
	
	@Test
	public void testcase58() { 
	
	 assertFalse(jb.bondRegex("(004)"));
	}
	
	@Test
	public void testcase59() { 
	
	 assertTrue(jb.bondRegex("(004007)"));
	}
	
	@Test
	public void testcase60() { 
	
	 assertFalse(jb.bondRegex("(00407)"));
	}
	
	@Test
	public void testcase61() { 
	
	 assertFalse(jb.bondRegex("(0047)"));
	}
	
	@Test
	public void testcase62() { 
	
	 assertFalse(jb.bondRegex("(005("));
	}
	
	@Test
	public void testcase63() { 
	
	 assertFalse(jb.bondRegex("(005)"));
	}
	
	@Test
	public void testcase64() { 
	
	 assertTrue(jb.bondRegex("(005007)"));
	}
	
	@Test
	public void testcase65() { 
	
	 assertFalse(jb.bondRegex("(00507)"));
	}
	
	@Test
	public void testcase66() { 
	
	 assertFalse(jb.bondRegex("(0057)"));
	}
	
	@Test
	public void testcase67() { 
	
	 assertFalse(jb.bondRegex("(006("));
	}
	
	@Test
	public void testcase68() { 
	
	 assertFalse(jb.bondRegex("(006)"));
	}
	
	@Test
	public void testcase69() { 
	
	 assertTrue(jb.bondRegex("(006007)"));
	}
	
	@Test
	public void testcase70() { 
	
	 assertFalse(jb.bondRegex("(00607)"));
	}
	
	@Test
	public void testcase71() { 
	
	 assertFalse(jb.bondRegex("(0067)"));
	}
	
	@Test
	public void testcase72() { 
	
	 assertFalse(jb.bondRegex("(007("));
	}
	
	@Test
	public void testcase73() { 
	
	 assertFalse(jb.bondRegex("(007(("));
	}
	
	@Test
	public void testcase74() { 
	
	 assertTrue(jb.bondRegex("(007()"));
	}
	
	@Test
	public void testcase75() { 
	
	 assertTrue(jb.bondRegex("(007(007)"));
	}
	
	@Test
	public void testcase76() { 
	
	 assertTrue(jb.bondRegex("(007(07)"));
	}
	
	@Test
	public void testcase77() { 
	
	 assertTrue(jb.bondRegex("(007(7)"));
	}
	
	@Test
	public void testcase78() { 
	
	 assertTrue(jb.bondRegex("(007)"));
	}
	
	@Test
	public void testcase79() { 
	
	 assertTrue(jb.bondRegex("(007)("));
	}
	
	@Test
	public void testcase80() { 
	
	 assertTrue(jb.bondRegex("(007)(("));
	}
	
	@Test
	public void testcase81() { 
	
	 assertTrue(jb.bondRegex("(007)()"));
	}
	
	@Test
	public void testcase82() { 
	
	 assertTrue(jb.bondRegex("(007)(007)"));
	}
	
	@Test
	public void testcase83() { 
	
	 assertTrue(jb.bondRegex("(007)(07)"));
	}
	
	@Test
	public void testcase84() { 
	
	 assertTrue(jb.bondRegex("(007)(7)"));
	}
	
	@Test
	public void testcase85() { 
	
	 assertTrue(jb.bondRegex("(007))"));
	}
	
	@Test
	public void testcase86() { 
	
	 assertTrue(jb.bondRegex("(007))("));
	}
	
	@Test
	public void testcase87() { 
	
	 assertTrue(jb.bondRegex("(007)))"));
	}
	
	@Test
	public void testcase88() { 
	
	 assertTrue(jb.bondRegex("(007))007)"));
	}
	
	@Test
	public void testcase89() { 
	
	 assertTrue(jb.bondRegex("(007))07)"));
	}
	
	@Test
	public void testcase90() { 
	
	 assertTrue(jb.bondRegex("(007))7)"));
	}
	
	@Test
	public void testcase91() { 
	
	 assertTrue(jb.bondRegex("(007)0("));
	}
	
	@Test
	public void testcase92() { 
	
	 assertTrue(jb.bondRegex("(007)0)"));
	}
	
	@Test
	public void testcase93() { 
	
	 assertTrue(jb.bondRegex("(007)0007)"));
	}
	
	@Test
	public void testcase94() { 
	
	 assertTrue(jb.bondRegex("(007)007)"));
	}
	
	@Test
	public void testcase95() { 
	
	 assertTrue(jb.bondRegex("(007)07)"));
	}
	
	@Test
	public void testcase96() { 
	
	 assertTrue(jb.bondRegex("(007)1("));
	}
	
	@Test
	public void testcase97() { 
	
	 assertTrue(jb.bondRegex("(007)1)"));
	}
	
	@Test
	public void testcase98() { 
	
	 assertTrue(jb.bondRegex("(007)1007)"));
	}
	
	@Test
	public void testcase99() { 
	
	 assertTrue(jb.bondRegex("(007)107)"));
	}
	
	@Test
	public void testcase100() { 
	
	 assertTrue(jb.bondRegex("(007)17)"));
	}
	
	@Test
	public void testcase101() { 
	
	 assertTrue(jb.bondRegex("(007)2("));
	}
	
	@Test
	public void testcase102() { 
	
	 assertTrue(jb.bondRegex("(007)2)"));
	}
	
	@Test
	public void testcase103() { 
	
	 assertTrue(jb.bondRegex("(007)2007)"));
	}
	
	@Test
	public void testcase104() { 
	
	 assertTrue(jb.bondRegex("(007)207)"));
	}
	
	@Test
	public void testcase105() { 
	
	 assertTrue(jb.bondRegex("(007)27)"));
	}
	
	@Test
	public void testcase106() { 
	
	 assertTrue(jb.bondRegex("(007)3("));
	}
	
	@Test
	public void testcase107() { 
	
	 assertTrue(jb.bondRegex("(007)3)"));
	}
	
	@Test
	public void testcase108() { 
	
	 assertTrue(jb.bondRegex("(007)3007)"));
	}
	
	@Test
	public void testcase109() { 
	
	 assertTrue(jb.bondRegex("(007)307)"));
	}
	
	@Test
	public void testcase110() { 
	
	 assertTrue(jb.bondRegex("(007)37)"));
	}
	
	@Test
	public void testcase111() { 
	
	 assertTrue(jb.bondRegex("(007)4("));
	}
	
	@Test
	public void testcase112() { 
	
	 assertTrue(jb.bondRegex("(007)4)"));
	}
	
	@Test
	public void testcase113() { 
	
	 assertTrue(jb.bondRegex("(007)4007)"));
	}
	
	@Test
	public void testcase114() { 
	
	 assertTrue(jb.bondRegex("(007)407)"));
	}
	
	@Test
	public void testcase115() { 
	
	 assertTrue(jb.bondRegex("(007)47)"));
	}
	
	@Test
	public void testcase116() { 
	
	 assertTrue(jb.bondRegex("(007)5("));
	}
	
	@Test
	public void testcase117() { 
	
	 assertTrue(jb.bondRegex("(007)5)"));
	}
	
	@Test
	public void testcase118() { 
	
	 assertTrue(jb.bondRegex("(007)5007)"));
	}
	
	@Test
	public void testcase119() { 
	
	 assertTrue(jb.bondRegex("(007)507)"));
	}
	
	@Test
	public void testcase120() { 
	
	 assertTrue(jb.bondRegex("(007)57)"));
	}
	
	@Test
	public void testcase121() { 
	
	 assertTrue(jb.bondRegex("(007)6("));
	}
	
	@Test
	public void testcase122() { 
	
	 assertTrue(jb.bondRegex("(007)6)"));
	}
	
	@Test
	public void testcase123() { 
	
	 assertTrue(jb.bondRegex("(007)6007)"));
	}
	
	@Test
	public void testcase124() { 
	
	 assertTrue(jb.bondRegex("(007)607)"));
	}
	
	@Test
	public void testcase125() { 
	
	 assertTrue(jb.bondRegex("(007)67)"));
	}
	
	@Test
	public void testcase126() { 
	
	 assertTrue(jb.bondRegex("(007)7("));
	}
	
	@Test
	public void testcase127() { 
	
	 assertTrue(jb.bondRegex("(007)7)"));
	}
	
	@Test
	public void testcase128() { 
	
	 assertTrue(jb.bondRegex("(007)7007)"));
	}
	
	@Test
	public void testcase129() { 
	
	 assertTrue(jb.bondRegex("(007)707)"));
	}
	
	@Test
	public void testcase130() { 
	
	 assertTrue(jb.bondRegex("(007)77)"));
	}
	
	@Test
	public void testcase131() { 
	
	 assertTrue(jb.bondRegex("(007)8("));
	}
	
	@Test
	public void testcase132() { 
	
	 assertTrue(jb.bondRegex("(007)8)"));
	}
	
	@Test
	public void testcase133() { 
	
	 assertTrue(jb.bondRegex("(007)8007)"));
	}
	
	@Test
	public void testcase134() { 
	
	 assertTrue(jb.bondRegex("(007)807)"));
	}
	
	@Test
	public void testcase135() { 
	
	 assertTrue(jb.bondRegex("(007)87)"));
	}
	
	@Test
	public void testcase136() { 
	
	 assertTrue(jb.bondRegex("(007)9("));
	}
	
	@Test
	public void testcase137() { 
	
	 assertTrue(jb.bondRegex("(007)9)"));
	}
	
	@Test
	public void testcase138() { 
	
	 assertTrue(jb.bondRegex("(007)9007)"));
	}
	
	@Test
	public void testcase139() { 
	
	 assertTrue(jb.bondRegex("(007)907)"));
	}
	
	@Test
	public void testcase140() { 
	
	 assertTrue(jb.bondRegex("(007)97)"));
	}
	
	@Test
	public void testcase141() { 
	
	 assertFalse(jb.bondRegex("(0070("));
	}
	
	@Test
	public void testcase142() { 
	
	 assertTrue(jb.bondRegex("(0070)"));
	}
	
	@Test
	public void testcase143() { 
	
	 assertTrue(jb.bondRegex("(0070007)"));
	}
	
	@Test
	public void testcase144() { 
	
	 assertTrue(jb.bondRegex("(007007)"));
	}
	
	@Test
	public void testcase145() { 
	
	 assertTrue(jb.bondRegex("(00707)"));
	}
	
	@Test
	public void testcase146() { 
	
	 assertFalse(jb.bondRegex("(0071("));
	}
	
	@Test
	public void testcase147() { 
	
	 assertTrue(jb.bondRegex("(0071)"));
	}
	
	@Test
	public void testcase148() { 
	
	 assertTrue(jb.bondRegex("(0071007)"));
	}
	
	@Test
	public void testcase149() { 
	
	 assertTrue(jb.bondRegex("(007107)"));
	}
	
	@Test
	public void testcase150() { 
	
	 assertTrue(jb.bondRegex("(00717)"));
	}
	
	@Test
	public void testcase151() { 
	
	 assertFalse(jb.bondRegex("(0072("));
	}
	
	@Test
	public void testcase152() { 
	
	 assertTrue(jb.bondRegex("(0072)"));
	}
	
	@Test
	public void testcase153() { 
	
	 assertTrue(jb.bondRegex("(0072007)"));
	}
	
	@Test
	public void testcase154() { 
	
	 assertTrue(jb.bondRegex("(007207)"));
	}
	
	@Test
	public void testcase155() { 
	
	 assertTrue(jb.bondRegex("(00727)"));
	}
	
	@Test
	public void testcase156() { 
	
	 assertFalse(jb.bondRegex("(0073("));
	}
	
	@Test
	public void testcase157() { 
	
	 assertTrue(jb.bondRegex("(0073)"));
	}
	
	@Test
	public void testcase158() { 
	
	 assertTrue(jb.bondRegex("(0073007)"));
	}
	
	@Test
	public void testcase159() { 
	
	 assertTrue(jb.bondRegex("(007307)"));
	}
	
	@Test
	public void testcase160() { 
	
	 assertTrue(jb.bondRegex("(00737)"));
	}
	
	@Test
	public void testcase161() { 
	
	 assertFalse(jb.bondRegex("(0074("));
	}
	
	@Test
	public void testcase162() { 
	
	 assertTrue(jb.bondRegex("(0074)"));
	}
	
	@Test
	public void testcase163() { 
	
	 assertTrue(jb.bondRegex("(0074007)"));
	}
	
	@Test
	public void testcase164() { 
	
	 assertTrue(jb.bondRegex("(007407)"));
	}
	
	@Test
	public void testcase165() { 
	
	 assertTrue(jb.bondRegex("(00747)"));
	}
	
	@Test
	public void testcase166() { 
	
	 assertFalse(jb.bondRegex("(0075("));
	}
	
	@Test
	public void testcase167() { 
	
	 assertTrue(jb.bondRegex("(0075)"));
	}
	
	@Test
	public void testcase168() { 
	
	 assertTrue(jb.bondRegex("(0075007)"));
	}
	
	@Test
	public void testcase169() { 
	
	 assertTrue(jb.bondRegex("(007507)"));
	}
	
	@Test
	public void testcase170() { 
	
	 assertTrue(jb.bondRegex("(00757)"));
	}
	
	@Test
	public void testcase171() { 
	
	 assertFalse(jb.bondRegex("(0076("));
	}
	
	@Test
	public void testcase172() { 
	
	 assertTrue(jb.bondRegex("(0076)"));
	}
	
	@Test
	public void testcase173() { 
	
	 assertTrue(jb.bondRegex("(0076007)"));
	}
	
	@Test
	public void testcase174() { 
	
	 assertTrue(jb.bondRegex("(007607)"));
	}
	
	@Test
	public void testcase175() { 
	
	 assertTrue(jb.bondRegex("(00767)"));
	}
	
	@Test
	public void testcase176() { 
	
	 assertFalse(jb.bondRegex("(0077("));
	}
	
	@Test
	public void testcase177() { 
	
	 assertTrue(jb.bondRegex("(0077)"));
	}
	
	@Test
	public void testcase178() { 
	
	 assertTrue(jb.bondRegex("(0077007)"));
	}
	
	@Test
	public void testcase179() { 
	
	 assertTrue(jb.bondRegex("(007707)"));
	}
	
	@Test
	public void testcase180() { 
	
	 assertTrue(jb.bondRegex("(00777)"));
	}
	
	@Test
	public void testcase181() { 
	
	 assertFalse(jb.bondRegex("(0078("));
	}
	
	@Test
	public void testcase182() { 
	
	 assertTrue(jb.bondRegex("(0078)"));
	}
	
	@Test
	public void testcase183() { 
	
	 assertTrue(jb.bondRegex("(0078007)"));
	}
	
	@Test
	public void testcase184() { 
	
	 assertTrue(jb.bondRegex("(007807)"));
	}
	
	@Test
	public void testcase185() { 
	
	 assertTrue(jb.bondRegex("(00787)"));
	}
	
	@Test
	public void testcase186() { 
	
	 assertFalse(jb.bondRegex("(0079("));
	}
	
	@Test
	public void testcase187() { 
	
	 assertTrue(jb.bondRegex("(0079)"));
	}
	
	@Test
	public void testcase188() { 
	
	 assertTrue(jb.bondRegex("(0079007)"));
	}
	
	@Test
	public void testcase189() { 
	
	 assertTrue(jb.bondRegex("(007907)"));
	}
	
	@Test
	public void testcase190() { 
	
	 assertTrue(jb.bondRegex("(00797)"));
	}
	
	@Test
	public void testcase191() { 
	
	 assertFalse(jb.bondRegex("(008("));
	}
	
	@Test
	public void testcase192() { 
	
	 assertFalse(jb.bondRegex("(008)"));
	}
	
	@Test
	public void testcase193() { 
	
	 assertTrue(jb.bondRegex("(008007)"));
	}
	
	@Test
	public void testcase194() { 
	
	 assertFalse(jb.bondRegex("(00807)"));
	}
	
	@Test
	public void testcase195() { 
	
	 assertFalse(jb.bondRegex("(0087)"));
	}
	
	@Test
	public void testcase196() { 
	
	 assertFalse(jb.bondRegex("(009("));
	}
	
	@Test
	public void testcase197() { 
	
	 assertFalse(jb.bondRegex("(009)"));
	}
	
	@Test
	public void testcase198() { 
	
	 assertTrue(jb.bondRegex("(009007)"));
	}
	
	@Test
	public void testcase199() { 
	
	 assertFalse(jb.bondRegex("(00907)"));
	}
	
	@Test
	public void testcase200() { 
	
	 assertFalse(jb.bondRegex("(0097)"));
	}
	
	@Test
	public void testcase201() { 
	
	 assertFalse(jb.bondRegex("(01("));
	}
	
	@Test
	public void testcase202() { 
	
	 assertFalse(jb.bondRegex("(01)"));
	}
	
	@Test
	public void testcase203() { 
	
	 assertTrue(jb.bondRegex("(01007)"));
	}
	
	@Test
	public void testcase204() { 
	
	 assertFalse(jb.bondRegex("(0107)"));
	}
	
	@Test
	public void testcase205() { 
	
	 assertFalse(jb.bondRegex("(017)"));
	}
	
	@Test
	public void testcase206() { 
	
	 assertFalse(jb.bondRegex("(02("));
	}
	
	@Test
	public void testcase207() { 
	
	 assertFalse(jb.bondRegex("(02)"));
	}
	
	@Test
	public void testcase208() { 
	
	 assertTrue(jb.bondRegex("(02007)"));
	}
	
	@Test
	public void testcase209() { 
	
	 assertFalse(jb.bondRegex("(0207)"));
	}
	
	@Test
	public void testcase210() { 
	
	 assertFalse(jb.bondRegex("(027)"));
	}
	
	@Test
	public void testcase211() { 
	
	 assertFalse(jb.bondRegex("(03("));
	}
	
	@Test
	public void testcase212() { 
	
	 assertFalse(jb.bondRegex("(03)"));
	}
	
	@Test
	public void testcase213() { 
	
	 assertTrue(jb.bondRegex("(03007)"));
	}
	
	@Test
	public void testcase214() { 
	
	 assertFalse(jb.bondRegex("(0307)"));
	}
	
	@Test
	public void testcase215() { 
	
	 assertFalse(jb.bondRegex("(037)"));
	}
	
	@Test
	public void testcase216() { 
	
	 assertFalse(jb.bondRegex("(04("));
	}
	
	@Test
	public void testcase217() { 
	
	 assertFalse(jb.bondRegex("(04)"));
	}
	
	@Test
	public void testcase218() { 
	
	 assertTrue(jb.bondRegex("(04007)"));
	}
	
	@Test
	public void testcase219() { 
	
	 assertFalse(jb.bondRegex("(0407)"));
	}
	
	@Test
	public void testcase220() { 
	
	 assertFalse(jb.bondRegex("(047)"));
	}
	
	@Test
	public void testcase221() { 
	
	 assertFalse(jb.bondRegex("(05("));
	}
	
	@Test
	public void testcase222() { 
	
	 assertFalse(jb.bondRegex("(05)"));
	}
	
	@Test
	public void testcase223() { 
	
	 assertTrue(jb.bondRegex("(05007)"));
	}
	
	@Test
	public void testcase224() { 
	
	 assertFalse(jb.bondRegex("(0507)"));
	}
	
	@Test
	public void testcase225() { 
	
	 assertFalse(jb.bondRegex("(057)"));
	}
	
	@Test
	public void testcase226() { 
	
	 assertFalse(jb.bondRegex("(06("));
	}
	
	@Test
	public void testcase227() { 
	
	 assertFalse(jb.bondRegex("(06)"));
	}
	
	@Test
	public void testcase228() { 
	
	 assertTrue(jb.bondRegex("(06007)"));
	}
	
	@Test
	public void testcase229() { 
	
	 assertFalse(jb.bondRegex("(0607)"));
	}
	
	@Test
	public void testcase230() { 
	
	 assertFalse(jb.bondRegex("(067)"));
	}
	
	@Test
	public void testcase231() { 
	
	 assertFalse(jb.bondRegex("(07("));
	}
	
	@Test
	public void testcase232() { 
	
	 assertFalse(jb.bondRegex("(07)"));
	}
	
	@Test
	public void testcase233() { 
	
	 assertTrue(jb.bondRegex("(07007)"));
	}
	
	@Test
	public void testcase234() { 
	
	 assertFalse(jb.bondRegex("(0707)"));
	}
	
	@Test
	public void testcase235() { 
	
	 assertFalse(jb.bondRegex("(077)"));
	}
	
	@Test
	public void testcase236() { 
	
	 assertFalse(jb.bondRegex("(08("));
	}
	
	@Test
	public void testcase237() { 
	
	 assertFalse(jb.bondRegex("(08)"));
	}
	
	@Test
	public void testcase238() { 
	
	 assertTrue(jb.bondRegex("(08007)"));
	}
	
	@Test
	public void testcase239() { 
	
	 assertFalse(jb.bondRegex("(0807)"));
	}
	
	@Test
	public void testcase240() { 
	
	 assertFalse(jb.bondRegex("(087)"));
	}
	
	@Test
	public void testcase241() { 
	
	 assertFalse(jb.bondRegex("(09("));
	}
	
	@Test
	public void testcase242() { 
	
	 assertFalse(jb.bondRegex("(09)"));
	}
	
	@Test
	public void testcase243() { 
	
	 assertTrue(jb.bondRegex("(09007)"));
	}
	
	@Test
	public void testcase244() { 
	
	 assertFalse(jb.bondRegex("(0907)"));
	}
	
	@Test
	public void testcase245() { 
	
	 assertFalse(jb.bondRegex("(097)"));
	}
	
	@Test
	public void testcase246() { 
	
	 assertFalse(jb.bondRegex("(1("));
	}
	
	@Test
	public void testcase247() { 
	
	 assertFalse(jb.bondRegex("(1)"));
	}
	
	@Test
	public void testcase248() { 
	
	 assertTrue(jb.bondRegex("(1007)"));
	}
	
	@Test
	public void testcase249() { 
	
	 assertFalse(jb.bondRegex("(107)"));
	}
	
	@Test
	public void testcase250() { 
	
	 assertFalse(jb.bondRegex("(17)"));
	}
	
	@Test
	public void testcase251() { 
	
	 assertFalse(jb.bondRegex("(2("));
	}
	
	@Test
	public void testcase252() { 
	
	 assertFalse(jb.bondRegex("(2)"));
	}
	
	@Test
	public void testcase253() { 
	
	 assertTrue(jb.bondRegex("(2007)"));
	}
	
	@Test
	public void testcase254() { 
	
	 assertFalse(jb.bondRegex("(207)"));
	}
	
	@Test
	public void testcase255() { 
	
	 assertFalse(jb.bondRegex("(27)"));
	}
	
	@Test
	public void testcase256() { 
	
	 assertFalse(jb.bondRegex("(3("));
	}
	
	@Test
	public void testcase257() { 
	
	 assertFalse(jb.bondRegex("(3)"));
	}
	
	@Test
	public void testcase258() { 
	
	 assertTrue(jb.bondRegex("(3007)"));
	}
	
	@Test
	public void testcase259() { 
	
	 assertFalse(jb.bondRegex("(307)"));
	}
	
	@Test
	public void testcase260() { 
	
	 assertFalse(jb.bondRegex("(37)"));
	}
	
	@Test
	public void testcase261() { 
	
	 assertFalse(jb.bondRegex("(4("));
	}
	
	@Test
	public void testcase262() { 
	
	 assertFalse(jb.bondRegex("(4)"));
	}
	
	@Test
	public void testcase263() { 
	
	 assertTrue(jb.bondRegex("(4007)"));
	}
	
	@Test
	public void testcase264() { 
	
	 assertFalse(jb.bondRegex("(407)"));
	}
	
	@Test
	public void testcase265() { 
	
	 assertFalse(jb.bondRegex("(47)"));
	}
	
	@Test
	public void testcase266() { 
	
	 assertFalse(jb.bondRegex("(5("));
	}
	
	@Test
	public void testcase267() { 
	
	 assertFalse(jb.bondRegex("(5)"));
	}
	
	@Test
	public void testcase268() { 
	
	 assertTrue(jb.bondRegex("(5007)"));
	}
	
	@Test
	public void testcase269() { 
	
	 assertFalse(jb.bondRegex("(507)"));
	}
	
	@Test
	public void testcase270() { 
	
	 assertFalse(jb.bondRegex("(57)"));
	}
	
	@Test
	public void testcase271() { 
	
	 assertFalse(jb.bondRegex("(6("));
	}
	
	@Test
	public void testcase272() { 
	
	 assertFalse(jb.bondRegex("(6)"));
	}
	
	@Test
	public void testcase273() { 
	
	 assertTrue(jb.bondRegex("(6007)"));
	}
	
	@Test
	public void testcase274() { 
	
	 assertFalse(jb.bondRegex("(607)"));
	}
	
	@Test
	public void testcase275() { 
	
	 assertFalse(jb.bondRegex("(67)"));
	}
	
	@Test
	public void testcase276() { 
	
	 assertFalse(jb.bondRegex("(7("));
	}
	
	@Test
	public void testcase277() { 
	
	 assertFalse(jb.bondRegex("(7)"));
	}
	
	@Test
	public void testcase278() { 
	
	 assertTrue(jb.bondRegex("(7007)"));
	}
	
	@Test
	public void testcase279() { 
	
	 assertFalse(jb.bondRegex("(707)"));
	}
	
	@Test
	public void testcase280() { 
	
	 assertFalse(jb.bondRegex("(77)"));
	}
	
	@Test
	public void testcase281() { 
	
	 assertFalse(jb.bondRegex("(8("));
	}
	
	@Test
	public void testcase282() { 
	
	 assertFalse(jb.bondRegex("(8)"));
	}
	
	@Test
	public void testcase283() { 
	
	 assertTrue(jb.bondRegex("(8007)"));
	}
	
	@Test
	public void testcase284() { 
	
	 assertFalse(jb.bondRegex("(807)"));
	}
	
	@Test
	public void testcase285() { 
	
	 assertFalse(jb.bondRegex("(87)"));
	}
	
	@Test
	public void testcase286() { 
	
	 assertFalse(jb.bondRegex("(9("));
	}
	
	@Test
	public void testcase287() { 
	
	 assertFalse(jb.bondRegex("(9)"));
	}
	
	@Test
	public void testcase288() { 
	
	 assertTrue(jb.bondRegex("(9007)"));
	}
	
	@Test
	public void testcase289() { 
	
	 assertFalse(jb.bondRegex("(907)"));
	}
	
	@Test
	public void testcase290() { 
	
	 assertFalse(jb.bondRegex("(97)"));
	}
	
	@Test
	public void testcase291() { 
	
	 assertFalse(jb.bondRegex(")"));
	}
	
	@Test
	public void testcase292() { 
	
	 assertFalse(jb.bondRegex(")("));
	}
	
	@Test
	public void testcase293() { 
	
	 assertFalse(jb.bondRegex("))"));
	}
	
	@Test
	public void testcase294() { 
	
	 assertFalse(jb.bondRegex(")007)"));
	}
	
	@Test
	public void testcase295() { 
	
	 assertFalse(jb.bondRegex(")07)"));
	}
	
	@Test
	public void testcase296() { 
	
	 assertFalse(jb.bondRegex(")7)"));
	}
	
	@Test
	public void testcase297() { 
	
	 assertFalse(jb.bondRegex("0("));
	}
	
	@Test
	public void testcase298() { 
	
	 assertFalse(jb.bondRegex("0)"));
	}
	
	@Test
	public void testcase299() { 
	
	 assertFalse(jb.bondRegex("0007)"));
	}
	
	@Test
	public void testcase300() { 
	
	 assertFalse(jb.bondRegex("007)"));
	}
	
	@Test
	public void testcase301() { 
	
	 assertFalse(jb.bondRegex("07)"));
	}
	
	@Test
	public void testcase302() { 
	
	 assertFalse(jb.bondRegex("1("));
	}
	
	@Test
	public void testcase303() { 
	
	 assertFalse(jb.bondRegex("1)"));
	}
	
	@Test
	public void testcase304() { 
	
	 assertFalse(jb.bondRegex("1007)"));
	}
	
	@Test
	public void testcase305() { 
	
	 assertFalse(jb.bondRegex("107)"));
	}
	
	@Test
	public void testcase306() { 
	
	 assertFalse(jb.bondRegex("17)"));
	}
	
	@Test
	public void testcase307() { 
	
	 assertFalse(jb.bondRegex("2("));
	}
	
	@Test
	public void testcase308() { 
	
	 assertFalse(jb.bondRegex("2)"));
	}
	
	@Test
	public void testcase309() { 
	
	 assertFalse(jb.bondRegex("2007)"));
	}
	
	@Test
	public void testcase310() { 
	
	 assertFalse(jb.bondRegex("207)"));
	}
	
	@Test
	public void testcase311() { 
	
	 assertFalse(jb.bondRegex("27)"));
	}
	
	@Test
	public void testcase312() { 
	
	 assertFalse(jb.bondRegex("3("));
	}
	
	@Test
	public void testcase313() { 
	
	 assertFalse(jb.bondRegex("3)"));
	}
	
	@Test
	public void testcase314() { 
	
	 assertFalse(jb.bondRegex("3007)"));
	}
	
	@Test
	public void testcase315() { 
	
	 assertFalse(jb.bondRegex("307)"));
	}
	
	@Test
	public void testcase316() { 
	
	 assertFalse(jb.bondRegex("37)"));
	}
	
	@Test
	public void testcase317() { 
	
	 assertFalse(jb.bondRegex("4("));
	}
	
	@Test
	public void testcase318() { 
	
	 assertFalse(jb.bondRegex("4)"));
	}
	
	@Test
	public void testcase319() { 
	
	 assertFalse(jb.bondRegex("4007)"));
	}
	
	@Test
	public void testcase320() { 
	
	 assertFalse(jb.bondRegex("407)"));
	}
	
	@Test
	public void testcase321() { 
	
	 assertFalse(jb.bondRegex("47)"));
	}
	
	@Test
	public void testcase322() { 
	
	 assertFalse(jb.bondRegex("5("));
	}
	
	@Test
	public void testcase323() { 
	
	 assertFalse(jb.bondRegex("5)"));
	}
	
	@Test
	public void testcase324() { 
	
	 assertFalse(jb.bondRegex("5007)"));
	}
	
	@Test
	public void testcase325() { 
	
	 assertFalse(jb.bondRegex("507)"));
	}
	
	@Test
	public void testcase326() { 
	
	 assertFalse(jb.bondRegex("57)"));
	}
	
	@Test
	public void testcase327() { 
	
	 assertFalse(jb.bondRegex("6("));
	}
	
	@Test
	public void testcase328() { 
	
	 assertFalse(jb.bondRegex("6)"));
	}
	
	@Test
	public void testcase329() { 
	
	 assertFalse(jb.bondRegex("6007)"));
	}
	
	@Test
	public void testcase330() { 
	
	 assertFalse(jb.bondRegex("607)"));
	}
	
	@Test
	public void testcase331() { 
	
	 assertFalse(jb.bondRegex("67)"));
	}
	
	@Test
	public void testcase332() { 
	
	 assertFalse(jb.bondRegex("7("));
	}
	
	@Test
	public void testcase333() { 
	
	 assertFalse(jb.bondRegex("7)"));
	}
	
	@Test
	public void testcase334() { 
	
	 assertFalse(jb.bondRegex("7007)"));
	}
	
	@Test
	public void testcase335() { 
	
	 assertFalse(jb.bondRegex("707)"));
	}
	
	@Test
	public void testcase336() { 
	
	 assertFalse(jb.bondRegex("77)"));
	}
	
	@Test
	public void testcase337() { 
	
	 assertFalse(jb.bondRegex("8("));
	}
	
	@Test
	public void testcase338() { 
	
	 assertFalse(jb.bondRegex("8)"));
	}
	
	@Test
	public void testcase339() { 
	
	 assertFalse(jb.bondRegex("8007)"));
	}
	
	@Test
	public void testcase340() { 
	
	 assertFalse(jb.bondRegex("807)"));
	}
	
	@Test
	public void testcase341() { 
	
	 assertFalse(jb.bondRegex("87)"));
	}
	
	@Test
	public void testcase342() { 
	
	 assertFalse(jb.bondRegex("9("));
	}
	
	@Test
	public void testcase343() { 
	
	 assertFalse(jb.bondRegex("9)"));
	}
	
	@Test
	public void testcase344() { 
	
	 assertFalse(jb.bondRegex("9007)"));
	}
	
	@Test
	public void testcase345() { 
	
	 assertFalse(jb.bondRegex("907)"));
	}
	
	@Test
	public void testcase346() { 
	
	 assertFalse(jb.bondRegex("97)"));
	}

}
