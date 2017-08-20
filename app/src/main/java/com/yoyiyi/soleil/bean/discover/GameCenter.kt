package com.yoyiyi.soleil.bean.discover

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * *
 * @date 创建时间：2017/5/30 21:07
 * * 描述:游戏中心
 */
data class GameCenter(var uid: Int,
                      var glist_display_cnt: Int,
                      var cache_time: Int,
                      var greetings: List<GreetingsBean>,
                      var publicities: List<Any>,
                      var last_play: List<Any>,
                      var book_gift: List<BookGiftBean>,
                      var game_list: List<GameListBean>) {

    /**
     * uid : 117143614
     * greetings : [{"context":"机战萌娘，等你来战！"},{"context":"来和阿宝学功夫吧~"},{"context":"纳尼，我中了二向箔？"},{"context":"不摸鱼的人参，和咸鱼有什么区别？"},{"context":"谁是拥你入怀的王子？"},{"context":"纣王姐姐求嫁！"},{"context":"洛天依要带回家吗？"},{"context":"和香菜还有组长一起来拯救都市吧~"},{"context":"拔出石中剑，成为不列颠的王吧！"},{"context":"一起来玩有节操的游戏"},{"context":"我从未见过如此魔性之消除"},{"context":"带你重回红白机时代"},{"context":"一根手指就能玩转世界~"},{"context":"公主当然还是我家的最可爱了"},{"context":"和我一起进入水墨风东方幻想世界吧~"},{"context":"愿意来读读这本血影世界的暗黑物语吗？"},{"context":"新的风暴已经出现，你可做好准备？"},{"context":"看不见我看不见我看不见我......"},{"context":"诸君，我喜欢战争"},{"context":"其实好多烦恼切掉哔\u2014就都没有了"},{"context":"壮士！请干了这杯安利！"}]
     * publicities : []
     * last_play : []
     * book_gift : [{"id":1546,"name":"碧蓝航线","image":"http://i0.hdslb.com/bfs/game/9e985c4405efe7ae920aabd9b8d418a499566864.jpg","link":"http://blhx.biligame.com/h5/","book_status":0},{"id":1504,"name":"梦间集","image":"http://i0.hdslb.com/bfs/game/89971792dc7e089a783fb888db4d6030a564e98f.jpg","link":"http://mjj.biligame.com/yuyue/h5/","book_status":0},{"id":1700,"name":"魔法禁书目录","image":"http://i0.hdslb.com/bfs/game/8a166ba50006cbd3ce812929d90eb17477f42cad.jpg","link":"http://acg.tv/u1jy","book_status":0},{"id":10086,"name":"罗小黑妖灵簿","image":"http://i0.hdslb.com/bfs/game/27d33b3c91c6c3c4a3ab97fed38327fb7faae6f0.jpg","link":"http://lxhzj.biligame.com/yuyue/h5/","book_status":0},{"id":8897,"name":"一血万杰","image":"http://i0.hdslb.com/bfs/game/74483f0edf606c2b4039bb5318ccaf2f23be1755.jpg","link":"http://yxwj.biligame.com/h5/","book_status":0},{"id":5000,"name":"妃十三学园","image":"http://i0.hdslb.com/bfs/game/4cc73a138adb5cfa1681f77d4600fbe0cd1f9d0f.octet-stream","link":"http://girl.biligame.com/yuyue/h5/","book_status":0},{"id":9821,"name":"叛逆性百万亚瑟王","image":"http://i0.hdslb.com/bfs/game/6594d31cbb10d8e0aa9f03ed63e18605da0b5ac8.jpg","link":"http://ma3.biligame.com/yuyue/h5/","book_status":0},{"id":1254,"name":"战争工厂","image":"http://i0.hdslb.com/bfs/game/ce172f0021a38801119a03e2bed05d4db97341cd.jpg","link":"http://zzgc.biligame.com/yuyue/h5/","book_status":0},{"id":1486,"name":"萌王EX","image":"http://i0.hdslb.com/bfs/game/a9b47c32367ac376279017334a5e153a5f2587cd.jpg","link":"http://moe.biligame.com/yuyue/h5/","book_status":0},{"id":1233,"name":"妖精的衣橱","image":"http://i0.hdslb.com/bfs/game/1d30d0516f4365439fcb009b52c9b54e3ace65ed.jpg","link":"https://yjdyc.biligame.com/h5/","book_status":0},{"id":1445,"name":"神代梦华谭","image":"http://i0.hdslb.com/bfs/game/371733ae28d3f8898832fe1472fe379b1923648d.jpg","link":"http://sdmht.biligame.com/yuyueH5.html","book_status":0}]
     * game_list : [{"id":61,"title":"命运-冠位指定（Fate/GO）","summary":"全平台公测开启！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.bilibili.fatego","android_pkg_size":300515257,"android_pkg_ver":49,"download_link":"https://pkg.biligame.com/fatego/fatego_v1.15.0_bili_app_183545.apk","download_link2":"http://pkgdl.biligame.net/8ee23f/d1799f.apk","icon":"http://i0.hdslb.com/bfs/game/0a114c837d9f8fae8f2489a4bf91bf912c61edae.png","hot":1,"new":0},{"id":55,"title":"阴阳师","summary":"唯美如樱，百鬼物语","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.netease.onmyoji.bili","android_pkg_size":961880258,"android_pkg_ver":20,"download_link":"https://pkg.biligame.com/yys/yys_v1.0.20_bili_app_166723.apk","download_link2":"http://pkgdl.biligame.net/yys/yys_v1.0.20_bili_app_166723.apk","icon":"http://i0.hdslb.com/bfs/game/36ee7db87a0d27aa5bb4672fffc22fb5ff8ec68c.png","hot":1,"new":0},{"id":67,"title":"崩坏3","summary":"点燃ACG动作之魂！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.miHoYo.bh3.bilibili","android_pkg_size":974686164,"android_pkg_ver":50,"download_link":"https://pkg.biligame.com/bh3/bh3_v1.5.0_bili_703764.apk","download_link2":"http://pkgdl.biligame.net/bh3/bh3_v1.5.0_bili_703764.apk","icon":"http://i0.hdslb.com/bfs/game/00ca761705a75f51072931503092e5d0ccd42623.png","hot":1,"new":0},{"id":75,"title":"仙剑奇侠传幻璃镜","summary":"入境成妖，破界重生！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.shangruan.huanlijing.bili","android_pkg_size":404192009,"android_pkg_ver":2,"download_link":"https://pkg.biligame.com/xjqxzhlj/xjqxzhlj_v1.2_bili_741923.apk","download_link2":"http://pkgdl.biligame.net/xjqxzhlj/xjqxzhlj_v1.2_bili_741923.apk","icon":"http://i0.hdslb.com/bfs/game/914f8c00352afe5a2d99a62863634baf1db3d5c7.jpg","hot":0,"new":1},{"id":49,"title":"少女前线","summary":"战地誓约，守护羁绊","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.digitalsky.girlsfrontline.cn.bili","android_pkg_size":156409992,"android_pkg_ver":125,"download_link":"https://pkg.biligame.com/snqx/snqx_v1.122_bili_250437.apk","download_link2":"http://pkgdl.biligame.net/snqx/snqx_v1.122_bili_250437.apk","icon":"http://i0.hdslb.com/bfs/game/5fe1986506abe7a519a47fa5e505b097b3e7178d.png","hot":1,"new":0},{"id":76,"title":"刀剑乱舞","summary":"刀剑男士，即刻出阵！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.youzu.djlw.bili","android_pkg_size":234043222,"android_pkg_ver":13,"download_link":"https://pkg.biligame.com/djlw/djlw_v1.0.43_bili_196537.apk","download_link2":"http://pkgdl.biligame.net/djlw/djlw_v1.0.43_bili_196537.apk","icon":"http://i0.hdslb.com/bfs/game/2950e1d94aa49a740f0d69a6ca64d60f97b68564.png","hot":0,"new":1},{"id":1,"title":"崩坏学园2","summary":"崩坏学园2-银狼之逐","android_sign":"8B4FADF1EDA8B3D382873DECEBDAECC2","android_pkg_name":"com.miHoYo.HSoDv2BiliBiliRelease","android_pkg_size":276075913,"android_pkg_ver":1,"download_link":"http://pkg.biligame.com/bhxy/bhxy_v4.1.7_bili_754921.apk","download_link2":"http://pkgdl.biligame.net/bhxy/bhxy_v4.1.7_bili_754921.apk","icon":"http://i0.hdslb.com/bfs/game/622bc1d70006d595c11f1f30802fcd578096cb76.png","hot":1,"new":0},{"id":4,"title":"梦王国与沉睡的100王子","summary":"谁才是能够拥你入怀的王子？","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.gcrest.yume100prince.android.bili","android_pkg_size":172685183,"android_pkg_ver":133,"download_link":"https://pkg.biligame.com/100p/bili/100p_v1.16.0_bili_app_321456.apk","download_link2":"http://pkgdl.biligame.net/100p/bili/100p_v1.16.0_bili_app_321456.apk","icon":"http://i0.hdslb.com/bfs/game/f9ceae3c2f1655170391fe975fc1988d1a222bff.png","hot":1,"new":0},{"id":69,"title":"造物法则","summary":"一部可以玩的漫画！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.baitian.pjm.zwfz.bili","android_pkg_size":238971576,"android_pkg_ver":7,"download_link":"https://pkg.biligame.com/zwfz/zwfz_v1.0.6_bili_582014.apk","download_link2":"http://pkgdl.biligame.net/zwfz/zwfz_v1.0.6_bili_582014.apk","icon":"http://i0.hdslb.com/bfs/game/2018fb15ec09429459528cf8242105ffdae928a9.png","hot":0,"new":1},{"id":41,"title":"偶像梦幻祭","summary":"响彻世界吧！青春×偶像×高校生！","android_sign":"EFBE39FB97E1A843AD33BEFFD333502B","android_pkg_name":"com.tencent.tmgp.starscn","android_pkg_size":276450470,"android_pkg_ver":563725,"download_link":"https://pkg.biligame.com/oxmhj/oxmhj_v2.1.1_bili_846732.apk","download_link2":"http://pkgdl.biligame.net/oxmhj/oxmhj_v2.1.1_bili_846732.apk","icon":"http://i0.hdslb.com/bfs/game/1775ec5694d85d0e2e40d4c8b47fd4d1fccdc0b0.png","hot":1,"new":0},{"id":23,"title":"消灭都市","summary":"拯救都市，寻找真相","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.opd2c.athena.bili","android_pkg_size":636258143,"android_pkg_ver":42,"download_link":"https://pkg.biligame.com/xmds/xmds_v4.0.0_bili_app_351146.apk","download_link2":"ttp://pkgdl.biligame.net/xmds/xmds_v4.0.0_bili_app_351146.apk","icon":"http://i0.hdslb.com/bfs/game/2ab2c01bc1fc7502bfed472d7da6b5cfd9fafbf4.png","hot":1,"new":0},{"id":34,"title":"ICHU偶像进行曲","summary":"把我变成真正的偶像吧！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.bilibili.ichu","android_pkg_size":274833590,"android_pkg_ver":10,"download_link":"https://pkg.biligame.com/ichu/ichu_v1.2.0.7_bili_app.apk","download_link2":"http://pkgdl.biligame.net/ichu/ichu_v1.2.0.7_bili_app.apk","icon":"http://i0.hdslb.com/u_user/7baceb341073fe823faad36d2e1c805e.png","hot":1,"new":0},{"id":56,"title":"少女咖啡枪","summary":"咖啡馆x少女x枪战","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.xsj.girlcafegun.bili","android_pkg_size":571557005,"android_pkg_ver":101200003,"download_link":"https://pkg.biligame.com/snkfq/snkfq_v1.12.3_bili_586472.apk","download_link2":"http://pkgdl.biligame.net/snkfq/snkfq_v1.12.3_bili_586472.apk","icon":"http://i0.hdslb.com/bfs/game/330cd44350eff6e080a3859517485cb89e372429.png","hot":0,"new":1},{"id":73,"title":"EVA:破晓","summary":"使徒来袭 指尖激战","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.qzgame.eva.bili","android_pkg_size":525278216,"android_pkg_ver":28212,"download_link":"https://pkg.biligame.com/eva/eva_v2.1.8_bili_385631.apk","download_link2":"http://pkgdl.biligame.net/eva/eva_v2.1.8_bili_385631.apk","icon":"http://i0.hdslb.com/bfs/game/20a7cb3e539906cb6d0e328dd24a0be3dd39d69b.png","hot":0,"new":1},{"id":78,"title":"光明大陆","summary":"再一次 并肩作战","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.netease.gmdl.bili","android_pkg_size":436441747,"android_pkg_ver":333423,"download_link":"https://pkg.biligame.com/gmdl/gmdl_v1.165917.167505_bili_app_268533.apk","download_link2":"http://pkgdl.biligame.net/gmdl/gmdl_v1.165917.167505_bili_app_268533.apk","icon":"http://i0.hdslb.com/bfs/game/0ef9e591ce4867f85c3fd05365faa745d21a75c4.png","hot":0,"new":0},{"id":44,"title":"魔法少女小圆","summary":"全平台公测正式开启！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.zhuoyan.mfsn.bili","android_pkg_size":539692557,"android_pkg_ver":237,"download_link":"http://pkgdl.biligame.net/mfsnxy/mfsnxy_v1.0.1.237_bili_app_636852.apk","download_link2":"https://pkg.biligame.com/mfsnxy/mfsnxy_v1.0.1.237_bili_app_636852.apk","icon":"http://i0.hdslb.com/bfs/game/1536b32e82ea4fb44a8037f4604f2e80269cbb67.png","hot":0,"new":1},{"id":22,"title":"Zion载音","summary":"呐，一起来打歌吧！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.zion.aquatrax","android_pkg_size":228110068,"android_pkg_ver":4,"download_link":"https://pkg.biligame.com/zy/zy_v20.0.1_bili_568920.apk","download_link2":"http://pkgdl.biligame.net/zy/zy_v20.0.1_bili_568920.apk","icon":"http://i0.hdslb.com/bfs/game/32abcd8ae83f337623d13728f063e81eed5a07df.png","hot":0,"new":1},{"id":47,"title":"幻游猎人","summary":"全平台公测！妹系战争爆发","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.sywl.hylr.bili","android_pkg_size":214895716,"android_pkg_ver":1,"download_link":"https://pkg.biligame.com/hylr/hylr_v1.4.0_bili_app_363226.apk","download_link2":"http://pkgdl.biligame.net/hylr/hylr_v1.4.0_bili_app_363226.apk","icon":"http://i0.hdslb.com/bfs/game/5deda073214a544e4571c097fd98de92e00aa8b3.png","hot":0,"new":1},{"id":68,"title":"幻影纹章","summary":"重燃纹章之火！","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.denachina.g10000002.bili","android_pkg_size":50187939,"android_pkg_ver":25,"download_link":"https://pkg.biligame.com/hywz/hywz_v2.0.0_bili_892350.apk","download_link2":"http://pkgdl.biligame.net/hywz/hywz_v2.0.0_bili_892350.apk","icon":"http://i0.hdslb.com/bfs/game/277759569f1593fd29b836a19b4f9f76ba33ab27.png","hot":0,"new":1},{"id":70,"title":"影之刃2","summary":"东方武侠竞技扛鼎之作","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.zy.yzr2.bz","android_pkg_size":400465450,"android_pkg_ver":77,"download_link":"https://pkg.biligame.com/yzr2/yzr2_v1.0.20_bili_842512.apk","download_link2":"http://pkgdl.biligame.net/yzr2/yzr2_v1.0.20_bili_842512.apk","icon":"http://i0.hdslb.com/bfs/game/497c062d9c39facf02e175569207af403f8fdc04.png","hot":0,"new":1},{"id":74,"title":"诺诺来自异世界","summary":"异世界 x 少女 x 羁绊","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.StudioGM.Nico.bili","android_pkg_size":434717113,"android_pkg_ver":59,"download_link":"https://pkg.biligame.com/nnlzysj/nnlzysj_v0.7.3_bili_734807.apk","download_link2":"http://pkgdl.biligame.net/nnlzysj/nnlzysj_v0.7.3_bili_734807.apk","icon":"http://i0.hdslb.com/bfs/game/30651b513ab0f5533c4dd79fc6e7aa4322b76420.png","hot":0,"new":1},{"id":60,"title":"装甲联盟","summary":"萌娘X坦克 大作战","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.tank.yx.bili","android_pkg_size":266983654,"android_pkg_ver":645,"download_link":"https://pkg.biligame.com/zjlm/zjlm_v1.328.2_bili_app_834742.apk","download_link2":"http://pkgdl.biligame.net/zjlm/zjlm_v1.328.2_bili_app_834742.apk","icon":"http://i0.hdslb.com/bfs/game/96d87c7dfdc6a24e9adf7866dc14af12e2a0a5bd.png","hot":0,"new":1},{"id":50,"title":"三国罗曼史","summary":"意料之外却又情理之中的三国","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.xd.sglms.bilibili","android_pkg_size":506188325,"android_pkg_ver":9044,"download_link":"https://pkg.biligame.com/sglms/sglms_v1.0.9044_bili_app_864243.apk","download_link2":"http://pkgdl.biligame.net/sglms/sglms_v1.0.9044_bili_app_864243.apk","icon":"http://i0.hdslb.com/bfs/game/d95f6c858126086762976d60eec2c2e395f69e04.jpg","hot":0,"new":1},{"id":66,"title":"那兔之大国梦","summary":"每只兔子都有一个大国梦","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.xianyugame.natuwy.bili","android_pkg_size":141172906,"android_pkg_ver":7,"download_link":"https://pkg.biligame.com/ntzdgm/ntzdgm_v1.0.7_bili_389653.apk","download_link2":"http://pkgdl.biligame.net/ntzdgm/ntzdgm_v1.0.7_bili_389653.apk","icon":"http://i0.hdslb.com/bfs/game/9c9848b308e41b902b16dac77d290b4702c2e031.png","hot":0,"new":0},{"id":58,"title":"螺旋境界线","summary":"幻想之境，触手可及","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.longtugame.lxjjx.bili","android_pkg_size":526337987,"android_pkg_ver":776,"download_link":"https://pkg.biligame.com/lxjjx/lxjjx_v1.8.0_bili_app_118024.apk","download_link2":"http://pkgdl.biligame.net/lxjjx/lxjjx_v1.8.0_bili_app_118024.apk","icon":"http://i0.hdslb.com/bfs/game/5e61cba9d062f2d333b883c044660bfe85f088bd.png","hot":0,"new":0},{"id":59,"title":"如果的世界","summary":"动漫回合，协力冒险","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.ledo.areal.bili","android_pkg_size":214714919,"android_pkg_ver":10400,"download_link":"https://pkg.biligame.com/rgdsj/rgdsj_v1.4.0_bili_245991.apk","download_link2":"http://pkgdl.biligame.net/rgdsj/rgdsj_v1.4.0_bili_245991.apk","icon":"http://i0.hdslb.com/bfs/game/2db63de24a6eea18bfad2938ce3d216b0c6f2641.png","hot":0,"new":0},{"id":62,"title":"剑侠世界","summary":"一生不容错过的浪漫武侠","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.wali.jianxiashijie3D.bili","android_pkg_size":757442067,"android_pkg_ver":3881,"download_link":"https://pkg.biligame.com/jxsj/jxsj_v1.2.3881_bili_app.apk","download_link2":"http://pkgdl.biligame.net/jxsj/jxsj_v1.2.3881_bili_app.apk","icon":"http://i0.hdslb.com/bfs/game/4b161990beecaa61e1effb1f2865d6c04bd49118.png","hot":0,"new":1},{"id":64,"title":"暴风战舰","summary":"次世代3D战争策略手游","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.chyo.fleet.bili","android_pkg_size":128312007,"android_pkg_ver":25,"download_link":"https://pkg.biligame.com/bfzj/bfzj_v1.10.0_bili_app_754264.apk","download_link2":"http://pkgdl.biligame.net/bfzj/bfzj_v1.10.0_bili_app_754264.apk","icon":"http://i0.hdslb.com/bfs/game/63fef8556c3465dea12e3c0849bd12761cdf664b.png","hot":0,"new":0},{"id":42,"title":"刀剑神域黑衣剑士","summary":"虽然是游戏，但可不是闹着玩的","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.yunchang.djsy.bili","android_pkg_size":451454434,"android_pkg_ver":2100,"download_link":"https://pkg.biligame.com/djsy/djsy_v2.0.0_bili_app_562245.apk","download_link2":"http://pkgdl.biligame.net/djsy/djsy_v2.0.0_bili_app_562245.apk","icon":"http://i0.hdslb.com/bfs/game/764f761e9fd67a4e9d07155e7a621e39c2987cc0.png","hot":1,"new":0},{"id":53,"title":"妖刀少女异闻录","summary":"花泽香菜陪你一同黑化！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.netease.ma56.bili","android_pkg_size":284813313,"android_pkg_ver":4,"download_link":"https://pkg.biligame.com/ydsnywl/ydsnywl_v4.0_bili_488294.apk","download_link2":"http://pkgdl.biligame.net/ydsnywl/ydsnywl_v4.0_bili_488294.apk","icon":"http://i0.hdslb.com/bfs/game/2298be435121301d750025fbd1d6f4856ba06ec8.png","hot":0,"new":1},{"id":63,"title":"大航海之路","summary":"全3D真实航海冒险MMO手游","android_sign":"4502A02A00395DEC05A4134AD593224D","android_pkg_name":"com.netease.dhhzl.bili","android_pkg_size":496783735,"android_pkg_ver":17,"download_link":"https://pkg.biligame.com/dhhzl/dhhzl_v1.1.7_bili_app_312258.apk","download_link2":"http://pkgdl.biligame.net/dhhzl/dhhzl_v1.1.7_bili_app_312258.apk","icon":"http://i0.hdslb.com/bfs/game/034ee658a62595cfce63dc89c59e9db4434b743e.png","hot":0,"new":1},{"id":3,"title":"乖离性百万亚瑟王","summary":"新老玩家登录 领特别礼包哟","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.netease.ma.bili","android_pkg_size":76142153,"android_pkg_ver":51000,"download_link":"https://pkg.biligame.com/ma/bili/ma2_v5.1.0_bili_app_843974.apk","download_link2":"http://pkgdl.biligame.net/ma/bili/ma2_v5.1.0_bili_app_843974.apk","icon":"http://i0.hdslb.com/bfs/game/138e5dfdb5059d94e6e6b23b0bcb8ca43f6cf111.png","hot":1,"new":0},{"id":57,"title":"皇牌机娘","summary":"二次元战机娘化游戏","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.netease.av.bili","android_pkg_size":498438674,"android_pkg_ver":16,"download_link":"https://pkg.biligame.com/hpjn/hpjn_v1.6.5_bili_app_946756.apk","download_link2":"http://pkgdl.biligame.net/hpjn/hpjn_v1.6.5_bili_app_946756.apk","icon":"http://i0.hdslb.com/bfs/game/14db819c78ab79c3f18e7fa5e9acf0c191594d02.png","hot":0,"new":0},{"id":45,"title":"战场双马尾","summary":"萌即正义！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.kurogame.oppai.bili","android_pkg_size":548252109,"android_pkg_ver":45,"download_link":"https://pkg.biligame.com/zcsmw/zcsmw_v2.1.0_bili_app_478446.apk","download_link2":"http://pkgdl.biligame.net/zcsmw/zcsmw_v2.1.0_bili_app_478446.apk","icon":"http://i0.hdslb.com/bfs/game/633e5dc3e361ac868aa14f38978bd227869677b3.png","hot":0,"new":0},{"id":26,"title":"克鲁赛德战记","summary":"日式萌系像素风RPG","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.nhnst.SKCQCN.bili","android_pkg_size":295042802,"android_pkg_ver":93,"download_link":"https://pkg.biligame.com/klsdzj/klsdzj_v3.5.13_bili_app_452114.apk","download_link2":"http://pkgdl.biligame.net/klsdzj/klsdzj_v3.5.13_bili_app_452114.apk","icon":"http://i2.hdslb.com/u_user/503113dc29417f5c53abfeb9b520dbeb.png","hot":0,"new":0},{"id":43,"title":"天天打波利","summary":"吃饭、睡觉、打波利！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.xd.ttdbl.bili","android_pkg_size":153064355,"android_pkg_ver":10123,"download_link":"https://pkg.biligame.com/ttdbl/ttdbl_v2.4.0_bili_app_257548.apk","download_link2":"http://pkgdl.biligame.net/ttdbl/ttdbl_v2.4.0_bili_app_257548.apk","icon":"http://i0.hdslb.com/bfs/game/048a359bdb40cfb521130396a6b4b4d3912a4e76.png","hot":0,"new":0},{"id":31,"title":"战舞幻想曲","summary":"出发，大小姐探宝团！","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.zxlf.zwhx.bili","android_pkg_size":381836314,"android_pkg_ver":5,"download_link":"https://pkg.biligame.com/zwhx/zwhxq_v1.12.001_bili_291592.apk","download_link2":"http://pkgdl.biligame.net/zwhx/zwhxq_v1.12.001_bili_291592.apk","icon":"http://i2.hdslb.com/u_user/5ea559c4f8d18294617cec080e1b43b9.png","hot":1,"new":0},{"id":28,"title":"艾尔战记","summary":"原汁原味二次元萌格斗","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.koramgame.els.kl.bili","android_pkg_size":436721681,"android_pkg_ver":415,"download_link":"https://pkg.biligame.com/aezj/aezj_v0.20712.20_bili_app_353064.apk","download_link2":"http://pkgdl.biligame.net/aezj/aezj_v0.20712.20_bili_app_353064.apk","icon":"http://i2.hdslb.com/u_user/7d4187201faf0669a45c77ccfb665b38.png","hot":0,"new":0},{"id":40,"title":"银时之魂","summary":"银魂万事屋今日开业!","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"cn.mobage.g12000145.bili","android_pkg_size":304714100,"android_pkg_ver":420,"download_link":"https://pkg.biligame.com/yszh/yszh_v4.2.0_bili_app_510925.apk","download_link2":"http://pkgdl.biligame.net/yszh/yszh_v4.2.0_bili_app_510925.apk","icon":"http://i0.hdslb.com/bfs/game/24e41b1d981a461fd6779d72239185b9f702b12a.png","hot":0,"new":0},{"id":27,"title":"山海战记","summary":"吾从未见过如此高颜值之塔防","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.smiletech.shzj.bili","android_pkg_size":528955815,"android_pkg_ver":8,"download_link":"https://pkg.biligame.com/shzj/shzj_v4.17.1_bili_app_373816.apk","download_link2":"http://pkgdl.biligame.net/shzj/shzj_v4.17.1_bili_app_373816.apk","icon":"http://i0.hdslb.com/u_user/1126584600b7332152f5cd2bc56960e6.png","hot":0,"new":0},{"id":20,"title":"苍翼之刃","summary":"无冷却手势连招格斗","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.act91.bbrr.bili","android_pkg_size":334878345,"android_pkg_ver":26332,"download_link":"https://pkg.biligame.com/cyzr/cyzr_v1.14.0_bili_app.apk","download_link2":"http://pkgdl.biligame.net/cyzr/cyzr_v1.14.0_bili_app.apk","icon":"http://i2.hdslb.com/u_user/751e3223d97bad57bbb8b14a747d0724.png","hot":0,"new":0},{"id":8,"title":"梅露可物语","summary":"伦家是最萌的游戏，快来玩","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.happyelements.miraclecn.bilibili","android_pkg_size":171388291,"android_pkg_ver":1322,"download_link":"https://pkg.biligame.com/mlkwy/mlkwy_v3.5.0_bili_app_1487729027.apk","download_link2":"http://pkgdl.biligame.net/mlkwy/mlkwy_v3.5.0_bili_app_1487729027.apk","icon":"http://i0.hdslb.com/bfs/game/80c7c8202a52a484d18b2ac1cc7523fffbf4a70a.png","hot":0,"new":0},{"id":9,"title":"风暴帝国-世界2","summary":"新的风暴，已经出现","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.good.world2fbcn","android_pkg_size":63167960,"android_pkg_ver":20,"download_link":"https://pkg.biligame.com/sj2/bili/sj2_v2.6_bili_app.apk","download_link2":"http://pkgdl.biligame.net/sj2/bili/sj2_v2.6_bili_app.apk","icon":"http://i0.hdslb.com/u_user/9008d9b26e263285824979e21c0c18bd.png","hot":0,"new":0},{"id":10,"title":"影之刃","summary":"雨，何时能停？敌之血，流干之时","android_sign":"5F6A75569A2D96109405E969C4F57AAA","android_pkg_name":"com.yzr.bili","android_pkg_size":215393621,"android_pkg_ver":31,"download_link":"https://pkg.biligame.com/yzr/yzr_v1.16.0_bili_app_144782.apk","download_link2":"http://pkgdl.biligame.net/yzr/yzr_v1.16.0_bili_app_144782.apk","icon":"http://i0.hdslb.com/bfs/game/4c12a1516243b08cbdef2877459c48dffcb2fb52.png","hot":0,"new":0}]
     * glist_display_cnt : 10
     * cache_time : 30
     */


    data class GreetingsBean(var context: String) {
        /**
         * context : 机战萌娘，等你来战！
         */

    }

    data class BookGiftBean(var id: Int,
                            var name: String,
                            var image: String,
                            var link: String,
                            var book_status: Int) {
        /**
         * id : 1546
         * name : 碧蓝航线
         * image : http://i0.hdslb.com/bfs/game/9e985c4405efe7ae920aabd9b8d418a499566864.jpg
         * link : http://blhx.biligame.com/h5/
         * book_status : 0
         */


    }

    data class GameListBean(var id: Int,
                            var title: String,
                            var summary: String,
                            var android_sign: String,
                            var android_pkg_name: String,
                            var android_pkg_size: Int,
                            var android_pkg_ver: Int,
                            var download_link: String,
                            var download_link2: String,
                            var icon: String,
                            var hot: Int,
                            var new: Int) {
        /**
         * id : 61
         * title : 命运-冠位指定（Fate/GO）
         * summary : 全平台公测开启！
         * android_sign : 4502A02A00395DEC05A4134AD593224D
         * android_pkg_name : com.bilibili.fatego
         * android_pkg_size : 300515257
         * android_pkg_ver : 49
         * download_link : https://pkg.biligame.com/fatego/fatego_v1.15.0_bili_app_183545.apk
         * download_link2 : http://pkgdl.biligame.net/8ee23f/d1799f.apk
         * icon : http://i0.hdslb.com/bfs/game/0a114c837d9f8fae8f2489a4bf91bf912c61edae.png
         * hot : 1
         * new : 0
         */


    }
}