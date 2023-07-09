(ns framed.messages)

(def messages 
[{:type :framed,
  :nr 408,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1682253515181}
 {:type :framed,
  :nr 408,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682251711432}
 {:type :framed,
  :nr 408,
  :score 5,
  :user "Even",
  :timestamp_ms 1682230397588}
 {:type :framed,
  :nr 408,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1682205748492}
 {:type :framed,
  :nr 408,
  :score 3,
  :user "Einar",
  :timestamp_ms 1682202426433}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 407,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1682186798077}
 {:type :framed,
  :nr 407,
  :score 2,
  :user "Lars",
  :timestamp_ms 1682163896090}
 {:type :framed,
  :nr 407,
  :score 1,
  :user "Even",
  :timestamp_ms 1682162327695}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 407,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682117739181}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 407,
  :score 1,
  :user "Einar",
  :timestamp_ms 1682115761686}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 406,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1682067394002}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 406,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682065274353}
 {:type :framed,
  :nr 406,
  :score 0,
  :user "Even",
  :timestamp_ms 1682061668631}
 {:type :framed,
  :nr 406,
  :score 5,
  :user "Lars",
  :timestamp_ms 1682060879606}
 {:type :framed,
  :nr 406,
  :score 3,
  :user "Einar",
  :timestamp_ms 1682049140868}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 405,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1681987103234}
 {:type :framed,
  :nr 405,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1681986468794}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 405,
  :score 6,
  :user "Lars",
  :timestamp_ms 1681973530501}
 {:type :framed,
  :nr 405,
  :score 2,
  :user "Even",
  :timestamp_ms 1681969457522}
 {:type :framed,
  :nr 405,
  :score 2,
  :user "Einar",
  :timestamp_ms 1681965958722}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 404,
  :score 5,
  :user "Lars",
  :timestamp_ms 1681891532879}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 404,
  :score 2,
  :user "Even",
  :timestamp_ms 1681889942374}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 404,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1681889182221}
 {:type :framed,
  :nr 404,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1681888452650}
 {:type :framed,
  :nr 404,
  :score 2,
  :user "Einar",
  :timestamp_ms 1681879411699}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 403,
  :score 1,
  :user "Lars",
  :timestamp_ms 1681842736098}
 {:type :framed,
  :nr 403,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1681807790676}
 {:type :framed,
  :nr 403,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1681796687702}
 {:type :framed,
  :nr 403,
  :score 0,
  :user "Even",
  :timestamp_ms 1681794527686}
 {:type :framed,
  :nr 403,
  :score 0,
  :user "Einar",
  :timestamp_ms 1681789964862}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 33,
  :score 2,
  :user "Even",
  :timestamp_ms 1681736927883}
 {:type :framed,
  :nr 402,
  :score 1,
  :user "Even",
  :timestamp_ms 1681736907280}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 33,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1681733176218}
 {:type :framed,
  :nr 402,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1681733169185}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 33,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1681731823827}
 {:type :framed,
  :nr 402,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1681731819268}
 {:type :episode,
  :nr 33,
  :score 4,
  :user "Lars",
  :timestamp_ms 1681717620097}
 {:type :framed,
  :nr 402,
  :score 2,
  :user "Lars",
  :timestamp_ms 1681717303147}
 {:type :episode,
  :nr 33,
  :score 3,
  :user "Einar",
  :timestamp_ms 1681705345844}
 {:type :framed,
  :nr 402,
  :score 6,
  :user "Einar",
  :timestamp_ms 1681705260014}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 401,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1681647309463}
 {:type :framed,
  :nr 401,
  :score 3,
  :user "Lars",
  :timestamp_ms 1681644977289}
 {:type :framed,
  :nr 401,
  :score 2,
  :user "Einar",
  :timestamp_ms 1681620891873}
 {:type :framed,
  :nr 401,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1681598403641}
 {:type :framed,
  :nr 401,
  :score 3,
  :user "Even",
  :timestamp_ms 1681598056700}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 400,
  :score 1,
  :user "Lars",
  :timestamp_ms 1681554895030}
 {:type :framed,
  :nr 400,
  :score 1,
  :user "Einar",
  :timestamp_ms 1681535295058}
 {:type :framed,
  :nr 400,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1681512156279}
 {:type :framed,
  :nr 400,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1681510660151}
 {:type :framed,
  :nr 400,
  :score 4,
  :user "Even",
  :timestamp_ms 1681510425954}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 399,
  :score 3,
  :user "Even",
  :timestamp_ms 1681468015858}
 {:type :framed,
  :nr 399,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1681466920472}
 {:type :framed,
  :nr 399,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1681458022330}
 {:type :framed,
  :nr 399,
  :score 6,
  :user "Lars",
  :timestamp_ms 1681456617747}
 {:type :framed,
  :nr 399,
  :score 6,
  :user "Einar",
  :timestamp_ms 1681449641297}
 {:type :framed,
  :nr 398,
  :score 2,
  :user "Lars",
  :timestamp_ms 1681422086615}
 {:type :framed,
  :nr 398,
  :score 0,
  :user "Even",
  :timestamp_ms 1681376203748}
 {:type :framed,
  :nr 398,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1681366034337}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 398,
  :score 0,
  :user "Einar",
  :timestamp_ms 1681360460030}
 {:type :framed,
  :nr 398,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1681337013960}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 397,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1681288263375}
 {:type :framed,
  :nr 397,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1681283492663}
 {:type :framed,
  :nr 397,
  :score 6,
  :user "Lars",
  :timestamp_ms 1681283355417}
 {:type :framed,
  :nr 397,
  :score 3,
  :user "Even",
  :timestamp_ms 1681279215564}
 {:type :framed,
  :nr 397,
  :score 2,
  :user "Einar",
  :timestamp_ms 1681271838539}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 396,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1681201912407}
 {:type :framed,
  :nr 396,
  :score 1,
  :user "Even",
  :timestamp_ms 1681200240325}
 {:type :framed,
  :nr 396,
  :score 6,
  :user "Lars",
  :timestamp_ms 1681199658978}
 {:type :framed,
  :nr 396,
  :score 3,
  :user "Einar",
  :timestamp_ms 1681187218213}
 {:type :framed,
  :nr 396,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1681165264256}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 32,
  :score 4,
  :user "Lars",
  :timestamp_ms 1681127064842}
 {:type :framed,
  :nr 395,
  :score 2,
  :user "Lars",
  :timestamp_ms 1681126787069}
 {:type :episode,
  :nr 32,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1681119291236}
 {:type :framed,
  :nr 395,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1681119286540}
 {:type :episode,
  :nr 32,
  :score 4,
  :user "Even",
  :timestamp_ms 1681107596722}
 {:type :framed,
  :nr 395,
  :score 0,
  :user "Even",
  :timestamp_ms 1681104791421}
 {:type :episode,
  :nr 32,
  :score 9,
  :user "Einar",
  :timestamp_ms 1681104050087}
 {:type :framed,
  :nr 395,
  :score 0,
  :user "Einar",
  :timestamp_ms 1681103505557}
 {:type :episode,
  :nr 32,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1681081871850}
 {:type :framed,
  :nr 395,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1681081855205}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 394,
  :score 5,
  :user "Even",
  :timestamp_ms 1681020440148}
 {:type :framed,
  :nr 394,
  :score 6,
  :user "Einar",
  :timestamp_ms 1681018091601}
 {:type :framed,
  :nr 394,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1680993163417}
 {:type :framed,
  :nr 394,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1680992917405}
 {:type :framed,
  :nr 394,
  :score 1,
  :user "Lars",
  :timestamp_ms 1680991477844}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 393,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1680971762527}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 393,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1680937918497}
 {:type :framed,
  :nr 393,
  :score 1,
  :user "Even",
  :timestamp_ms 1680935468392}
 {:type :framed,
  :nr 393,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680927954478}
 {:type :framed,
  :nr 393,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680906923087}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 392,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1680882816429}
 {:type :framed,
  :nr 392,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1680881742190}
 {:type :framed,
  :nr 392,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680863178405}
 {:type :framed,
  :nr 392,
  :score 3,
  :user "Even",
  :timestamp_ms 1680848971380}
 {:type :framed,
  :nr 392,
  :score 1,
  :user "Einar",
  :timestamp_ms 1680847509846}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 391,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680783447105}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 391,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1680781015935}
 {:type :framed,
  :nr 391,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680779087185}
 {:type :framed,
  :nr 391,
  :score 1,
  :user "Even",
  :timestamp_ms 1680759965831}
 {:type :framed,
  :nr 391,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680756214352}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 390,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680706026410}
 {:type :framed,
  :nr 390,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1680685603422}
 {:type :framed,
  :nr 390,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680679805905}
 {:type :framed,
  :nr 390,
  :score 0,
  :user "Even",
  :timestamp_ms 1680674818883}
 {:type :framed,
  :nr 390,
  :score 1,
  :user "Einar",
  :timestamp_ms 1680645833464}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 389,
  :score 0,
  :user "Even",
  :timestamp_ms 1680616437095}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 389,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680611568396}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 389,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1680610265305}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 389,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1680610239849}
 {:type :framed,
  :nr 389,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680599172294}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 388,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1680523985764}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 31,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1680521745537}
 {:type :episode,
  :nr 31,
  :score 1,
  :user "Lars",
  :timestamp_ms 1680517718819}
 {:type :framed,
  :nr 388,
  :score 5,
  :user "Lars",
  :timestamp_ms 1680517596373}
 {:type :episode,
  :nr 31,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680511700629}
 {:type :framed,
  :nr 388,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680510610115}
 {:type :framed,
  :nr 388,
  :score 3,
  :user "Even",
  :timestamp_ms 1680506492120}
 {:type :episode,
  :nr 31,
  :score 1,
  :user "Even",
  :timestamp_ms 1680506441827}
 {:type :episode,
  :nr 31,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680473129570}
 {:type :framed,
  :nr 388,
  :score 4,
  :user "Einar",
  :timestamp_ms 1680472983236}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 387,
  :score 2,
  :user "Lars",
  :timestamp_ms 1680437079836}
 {:type :framed,
  :nr 387,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680429612507}
 {:type :framed,
  :nr 387,
  :score 5,
  :user "Even",
  :timestamp_ms 1680397801460}
 {:type :framed,
  :nr 387,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1680387852444}
 {:type :framed,
  :nr 387,
  :score 4,
  :user "Einar",
  :timestamp_ms 1680386849266}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 386,
  :score 2,
  :user "Lars",
  :timestamp_ms 1680303466956}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 386,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1680301291338}
 {:type :framed,
  :nr 386,
  :score 1,
  :user "Even",
  :timestamp_ms 1680301008392}
 {:type :framed,
  :nr 386,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1680300696010}
 {:type :framed,
  :nr 386,
  :score 4,
  :user "Einar",
  :timestamp_ms 1680300632935}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 385,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1680247726851}
 {:type :framed,
  :nr 385,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1680247575344}
 {:type :framed,
  :nr 385,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680245234284}
 {:type :framed,
  :nr 385,
  :score 2,
  :user "Even",
  :timestamp_ms 1680239959777}
 {:type :framed,
  :nr 385,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680237655561}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 384,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1680161102651}
 {:type :framed,
  :nr 384,
  :score 0,
  :user "Lars",
  :timestamp_ms 1680159955626}
 {:type :framed,
  :nr 384,
  :score 0,
  :user "Even",
  :timestamp_ms 1680151221294}
 {:type :framed,
  :nr 384,
  :score 0,
  :user "Einar",
  :timestamp_ms 1680148260407}
 {:type :framed,
  :nr 384,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1680127637580}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 383,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680084861003}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 383,
  :score 1,
  :user "Even",
  :timestamp_ms 1680080210622}
 {:type :framed,
  :nr 383,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1680074937337}
 {:type :framed,
  :nr 383,
  :score 2,
  :user "Einar",
  :timestamp_ms 1680061298732}
 {:type :framed,
  :nr 383,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1680042115422}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 382,
  :score 6,
  :user "Lars",
  :timestamp_ms 1680001397305}
 {:type :framed,
  :nr 382,
  :score 2,
  :user "Even",
  :timestamp_ms 1679998324322}
 {:type :framed,
  :nr 382,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1679998264961}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 382,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1679994394502}
 {:type :framed,
  :nr 382,
  :score 0,
  :user "Einar",
  :timestamp_ms 1679974739127}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 30,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1679914089985}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 30,
  :score 2,
  :user "Lars",
  :timestamp_ms 1679908529203}
 {:type :framed,
  :nr 381,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679908202072}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 30,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1679899990016}
 {:type :episode,
  :nr 30,
  :score 4,
  :user "Einar",
  :timestamp_ms 1679898280470}
 {:type :framed,
  :nr 381,
  :score 3,
  :user "Even",
  :timestamp_ms 1679896236598}
 {:type :framed,
  :nr 381,
  :score 0,
  :user "Einar",
  :timestamp_ms 1679891489954}
 {:type :framed,
  :nr 381,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1679868566869}
 {:type :episode,
  :nr 30,
  :score 0,
  :user "Even",
  :timestamp_ms 1679868474601}
 {:type :framed,
  :nr 381,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1679868037307}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 380,
  :score 4,
  :user "Lars",
  :timestamp_ms 1679817528977}
 {:type :framed,
  :nr 380,
  :score 4,
  :user "Even",
  :timestamp_ms 1679817154474}
 {:type :framed,
  :nr 380,
  :score 6,
  :user "Einar",
  :timestamp_ms 1679809020836}
 {:type :framed,
  :nr 380,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1679787998243}
 {:type :framed,
  :nr 380,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1679786393809}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 379,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1679752423000}
 {:type :framed,
  :nr 379,
  :score 2,
  :user "Lars",
  :timestamp_ms 1679734656151}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 378,
  :score 1,
  :user "Lars",
  :timestamp_ms 1679734333421}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 379,
  :score 3,
  :user "Einar",
  :timestamp_ms 1679720356364}
 {:type :framed,
  :nr 379,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1679701107107}
 {:type :framed,
  :nr 379,
  :score 0,
  :user "Even",
  :timestamp_ms 1679699286981}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 378,
  :score 4,
  :user "Even",
  :timestamp_ms 1679678703740}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 378,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1679664456009}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 378,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1679649121899}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 378,
  :score 0,
  :user "Einar",
  :timestamp_ms 1679632633062}
 {:type :framed,
  :nr 377,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679584608180}
 {:type :framed,
  :nr 377,
  :score 1,
  :user "Even",
  :timestamp_ms 1679582205366}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 377,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1679571748073}
 {:type :framed,
  :nr 377,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1679565556428}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 377,
  :score 3,
  :user "Einar",
  :timestamp_ms 1679547510998}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 376,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679489077881}
 {:type :framed,
  :nr 376,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1679480252301}
 {:type :framed,
  :nr 376,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1679477822452}
 {:type :framed,
  :nr 376,
  :score 1,
  :user "Even",
  :timestamp_ms 1679464592043}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 376,
  :score 6,
  :user "Einar",
  :timestamp_ms 1679460444466}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 375,
  :score 2,
  :user "Even",
  :timestamp_ms 1679404400343}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 375,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1679392138713}
 {:type :framed,
  :nr 375,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1679387270708}
 {:type :framed,
  :nr 375,
  :score 2,
  :user "Lars",
  :timestamp_ms 1679385228263}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 375,
  :score 6,
  :user "Einar",
  :timestamp_ms 1679376696582}
 {:type :framed,
  :nr 374,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679348061878}
 {:type :episode,
  :nr 29,
  :score 10,
  :user "Lars",
  :timestamp_ms 1679348031390}
 {:type :episode,
  :nr 29,
  :score 0,
  :user "Even",
  :timestamp_ms 1679336857217}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 29,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1679331487081}
 {:type :framed,
  :nr 374,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1679331483620}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 29,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1679316394186}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 29,
  :score 10,
  :user "Einar",
  :timestamp_ms 1679309920102}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 374,
  :score 5,
  :user "Even",
  :timestamp_ms 1679309446818}
 {:type :framed,
  :nr 374,
  :score 2,
  :user "Einar",
  :timestamp_ms 1679287214552}
 {:type :framed,
  :nr 374,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1679267063329}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 373,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679253473022}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 373,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1679252708025}
 {:type :framed,
  :nr 373,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1679184612368}
 {:type :framed,
  :nr 373,
  :score 1,
  :user "Einar",
  :timestamp_ms 1679181152201}
 {:type :framed,
  :nr 373,
  :score 2,
  :user "Even",
  :timestamp_ms 1679180864294}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 372,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1679144819060}
 {:type :framed,
  :nr 372,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1679141061265}
 {:type :framed,
  :nr 372,
  :score 3,
  :user "Lars",
  :timestamp_ms 1679134779137}
 {:type :framed,
  :nr 372,
  :score 0,
  :user "Einar",
  :timestamp_ms 1679119248145}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 372,
  :score 1,
  :user "Even",
  :timestamp_ms 1679095581002}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 371,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1679049392645}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 371,
  :score 1,
  :user "Even",
  :timestamp_ms 1679046886744}
 {:type :framed,
  :nr 371,
  :score 6,
  :user "Lars",
  :timestamp_ms 1679044741767}
 {:type :framed,
  :nr 371,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1679037166466}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 371,
  :score 6,
  :user "Einar",
  :timestamp_ms 1679027674019}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 370,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1678956458708}
 {:type :framed,
  :nr 370,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678950569484}
 {:type :framed,
  :nr 370,
  :score 3,
  :user "Even",
  :timestamp_ms 1678947604385}
 {:type :framed,
  :nr 370,
  :score 6,
  :user "Einar",
  :timestamp_ms 1678943228772}
 {:type :framed,
  :nr 370,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1678921731540}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 369,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1678888720594}
 {:type :framed,
  :nr 369,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1678888255723}
 {:type :framed,
  :nr 369,
  :score 2,
  :user "Even",
  :timestamp_ms 1678888045231}
 {:type :framed,
  :nr 369,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678863957288}
 {:type :framed,
  :nr 369,
  :score 2,
  :user "Einar",
  :timestamp_ms 1678856102462}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 368,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1678784000117}
 {:type :framed,
  :nr 368,
  :score 1,
  :user "Even",
  :timestamp_ms 1678776074996}
 {:type :framed,
  :nr 368,
  :score 6,
  :user "Einar",
  :timestamp_ms 1678771789744}
 {:type :framed,
  :nr 368,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678749795056}
 {:type :framed,
  :nr 368,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1678749658617}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 28,
  :score 0,
  :user "Even",
  :timestamp_ms 1678705281632}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 28,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1678705060426}
 {:type :framed,
  :nr 367,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1678705055699}
 {:type :episode,
  :nr 28,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1678698830477}
 {:type :episode,
  :nr 28,
  :score 3,
  :user "Lars",
  :timestamp_ms 1678693286813}
 {:type :framed,
  :nr 367,
  :score 0,
  :user "Even",
  :timestamp_ms 1678688571105}
 {:type :episode,
  :nr 28,
  :score 7,
  :user "Einar",
  :timestamp_ms 1678684089153}
 {:type :framed,
  :nr 367,
  :score 1,
  :user "Einar",
  :timestamp_ms 1678683714920}
 {:type :framed,
  :nr 367,
  :score 1,
  :user "Lars",
  :timestamp_ms 1678662554496}
 {:type :framed,
  :nr 367,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1678662358853}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 366,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1678640249438}
 {:type :framed,
  :nr 366,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1678639911792}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 366,
  :score 5,
  :user "Even",
  :timestamp_ms 1678576659161}
 {:type :framed,
  :nr 366,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678576114728}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 366,
  :score 5,
  :user "Einar",
  :timestamp_ms 1678575734502}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 365,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1678538615285}
 {:type :framed,
  :nr 365,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1678528376474}
 {:type :framed,
  :nr 365,
  :score 3,
  :user "Lars",
  :timestamp_ms 1678525395031}
 {:type :framed,
  :nr 365,
  :score 2,
  :user "Einar",
  :timestamp_ms 1678513995101}
 {:type :framed,
  :nr 365,
  :score 3,
  :user "Even",
  :timestamp_ms 1678490152330}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 364,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1678441157203}
 {:type :framed,
  :nr 364,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1678439925551}
 {:type :framed,
  :nr 364,
  :score 4,
  :user "Lars",
  :timestamp_ms 1678436779461}
 {:type :framed,
  :nr 364,
  :score 2,
  :user "Even",
  :timestamp_ms 1678429543979}
 {:type :framed,
  :nr 364,
  :score 5,
  :user "Einar",
  :timestamp_ms 1678428558329}
 {:type :framed,
  :nr 363,
  :score 2,
  :user "Even",
  :timestamp_ms 1678371697514}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 363,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1678361827299}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 363,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1678357518328}
 {:type :framed,
  :nr 363,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678346429153}
 {:type :framed,
  :nr 363,
  :score 1,
  :user "Einar",
  :timestamp_ms 1678337561170}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 362,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1678269098930}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 362,
  :score 6,
  :user "Lars",
  :timestamp_ms 1678262534281}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 362,
  :score 0,
  :user "Even",
  :timestamp_ms 1678254204973}
 {:type :framed,
  :nr 362,
  :score 3,
  :user "Einar",
  :timestamp_ms 1678250131590}
 {:type :framed,
  :nr 362,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1678232716318}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 361,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1678188155949}
 {:type :framed,
  :nr 361,
  :score 3,
  :user "Lars",
  :timestamp_ms 1678178399128}
 {:type :framed,
  :nr 361,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1678173908621}
 {:type :framed,
  :nr 361,
  :score 0,
  :user "Even",
  :timestamp_ms 1678169825435}
 {:type :framed,
  :nr 361,
  :score 1,
  :user "Einar",
  :timestamp_ms 1678165960150}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 27,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1678097807539}
 {:type :framed,
  :nr 360,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1678097800392}
 {:type :framed,
  :nr 360,
  :score 2,
  :user "Even",
  :timestamp_ms 1678097754074}
 {:type :framed,
  :nr 360,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1678097409173}
 {:type :episode,
  :nr 27,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1678097070575}
 {:type :episode,
  :nr 27,
  :score 3,
  :user "Lars",
  :timestamp_ms 1678087843671}
 {:type :framed,
  :nr 360,
  :score 5,
  :user "Lars",
  :timestamp_ms 1678087583797}
 {:type :episode,
  :nr 27,
  :score 2,
  :user "Even",
  :timestamp_ms 1678085012194}
 {:type :episode,
  :nr 27,
  :score 3,
  :user "Einar",
  :timestamp_ms 1678081599276}
 {:type :framed,
  :nr 360,
  :score 5,
  :user "Einar",
  :timestamp_ms 1678081398821}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 359,
  :score 4,
  :user "Lars",
  :timestamp_ms 1678013703786}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 359,
  :score 0,
  :user "Einar",
  :timestamp_ms 1677996329789}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 359,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1677972965504}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 359,
  :score 0,
  :user "Even",
  :timestamp_ms 1677972305523}
 {:type :framed,
  :nr 359,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677972257545}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 358,
  :score 6,
  :user "Lars",
  :timestamp_ms 1677917467976}
 {:type :framed,
  :nr 358,
  :score 5,
  :user "Einar",
  :timestamp_ms 1677890501413}
 {:type :framed,
  :nr 358,
  :score 2,
  :user "Even",
  :timestamp_ms 1677886953956}
 {:type :framed,
  :nr 358,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1677885986262}
 {:type :framed,
  :nr 358,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677885712097}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 357,
  :score 6,
  :user "Einar",
  :timestamp_ms 1677849556918}
 {:type :framed,
  :nr 357,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1677848343968}
 {:type :framed,
  :nr 357,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1677847482507}
 {:type :framed,
  :nr 357,
  :score 2,
  :user "Even",
  :timestamp_ms 1677847453142}
 {:type :framed,
  :nr 357,
  :score 4,
  :user "Lars",
  :timestamp_ms 1677824662034}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 356,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1677751459715}
 {:type :framed,
  :nr 356,
  :score 3,
  :user "Even",
  :timestamp_ms 1677737635658}
 {:type :framed,
  :nr 356,
  :score 2,
  :user "Einar",
  :timestamp_ms 1677734770735}
 {:type :framed,
  :nr 356,
  :score 5,
  :user "Lars",
  :timestamp_ms 1677712236729}
 {:type :framed,
  :nr 356,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1677711929264}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 355,
  :score 4,
  :user "Even",
  :timestamp_ms 1677666380180}
 {:type :framed,
  :nr 355,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1677665024199}
 {:type :framed,
  :nr 355,
  :score 6,
  :user "Einar",
  :timestamp_ms 1677646672578}
 {:type :framed,
  :nr 355,
  :score 5,
  :user "Lars",
  :timestamp_ms 1677630117035}
 {:type :framed,
  :nr 355,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1677626818298}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 354,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1677587954912}
 {:type :framed,
  :nr 354,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677583217406}
 {:type :framed,
  :nr 354,
  :score 6,
  :user "Lars",
  :timestamp_ms 1677570807917}
 {:type :framed,
  :nr 354,
  :score 6,
  :user "Einar",
  :timestamp_ms 1677566302738}
 {:type :framed,
  :nr 354,
  :score 0,
  :user "Even",
  :timestamp_ms 1677566209286}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 26,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1677492507886}
 {:type :framed,
  :nr 353,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1677492500851}
 {:type :episode,
  :nr 26,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1677486109731}
 {:type :framed,
  :nr 353,
  :score 5,
  :user "Even",
  :timestamp_ms 1677485990106}
 {:type :episode,
  :nr 26,
  :score 4,
  :user "Lars",
  :timestamp_ms 1677484787372}
 {:type :framed,
  :nr 353,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1677483891485}
 {:type :framed,
  :nr 353,
  :score 0,
  :user "Lars",
  :timestamp_ms 1677482166524}
 {:type :episode,
  :nr 26,
  :score 2,
  :user "Even",
  :timestamp_ms 1677481853603}
 {:type :episode,
  :nr 26,
  :score 8,
  :user "Einar",
  :timestamp_ms 1677475927496}
 {:type :framed,
  :nr 353,
  :score 5,
  :user "Einar",
  :timestamp_ms 1677475559649}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 352,
  :score 4,
  :user "Lars",
  :timestamp_ms 1677413748959}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 352,
  :score 0,
  :user "Einar",
  :timestamp_ms 1677393864039}
 {:type :framed,
  :nr 352,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1677369768775}
 {:type :framed,
  :nr 352,
  :score 0,
  :user "Even",
  :timestamp_ms 1677366124088}
 {:type :framed,
  :nr 352,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677366063127}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 351,
  :score 2,
  :user "Even",
  :timestamp_ms 1677324873949}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 351,
  :score 6,
  :user "Lars",
  :timestamp_ms 1677324583540}
 {:type :framed,
  :nr 351,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1677323636947}
 {:type :framed,
  :nr 351,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1677281495134}
 {:type :framed,
  :nr 351,
  :score 3,
  :user "Einar",
  :timestamp_ms 1677279760436}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 350,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1677239055945}
 {:type :framed,
  :nr 350,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1677234489607}
 {:type :framed,
  :nr 350,
  :score 6,
  :user "Lars",
  :timestamp_ms 1677222557848}
 {:type :framed,
  :nr 350,
  :score 6,
  :user "Even",
  :timestamp_ms 1677221692106}
 {:type :framed,
  :nr 350,
  :score 6,
  :user "Einar",
  :timestamp_ms 1677194084487}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 349,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677147514450}
 {:type :framed,
  :nr 349,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1677142457400}
 {:type :framed,
  :nr 349,
  :score 1,
  :user "Even",
  :timestamp_ms 1677139329444}
 {:type :framed,
  :nr 349,
  :score 2,
  :user "Lars",
  :timestamp_ms 1677106991008}
 {:type :framed,
  :nr 349,
  :score 1,
  :user "Einar",
  :timestamp_ms 1677106910046}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 348,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1677056999284}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 348,
  :score 6,
  :user "Lars",
  :timestamp_ms 1677055545854}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 348,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1677049700267}
 {:type :framed,
  :nr 348,
  :score 2,
  :user "Even",
  :timestamp_ms 1677049485283}
 {:type :framed,
  :nr 348,
  :score 4,
  :user "Einar",
  :timestamp_ms 1677048905421}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 347,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1676969784725}
 {:type :framed,
  :nr 347,
  :score 2,
  :user "Lars",
  :timestamp_ms 1676934581093}
 {:type :framed,
  :nr 347,
  :score 3,
  :user "Einar",
  :timestamp_ms 1676934278069}
 {:type :framed,
  :nr 347,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1676934156047}
 {:type :framed,
  :nr 347,
  :score 0,
  :user "Even",
  :timestamp_ms 1676934133243}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 346,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1676886576620}
 {:type :episode,
  :nr 25,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676886576332}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 25,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1676877452731}
 {:type :framed,
  :nr 346,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1676876023326}
 {:type :episode,
  :nr 25,
  :score 3,
  :user "Even",
  :timestamp_ms 1676863865258}
 {:type :framed,
  :nr 346,
  :score 1,
  :user "Even",
  :timestamp_ms 1676863616810}
 {:type :episode,
  :nr 25,
  :score 3,
  :user "Lars",
  :timestamp_ms 1676849282484}
 {:type :framed,
  :nr 346,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676848783055}
 {:type :episode,
  :nr 25,
  :score 3,
  :user "Einar",
  :timestamp_ms 1676848588698}
 {:type :framed,
  :nr 346,
  :score 6,
  :user "Einar",
  :timestamp_ms 1676848421626}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 345,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1676800828010}
 {:type :framed,
  :nr 345,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676798581498}
 {:type :framed,
  :nr 345,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1676792607189}
 {:type :framed,
  :nr 345,
  :score 1,
  :user "Even",
  :timestamp_ms 1676789628541}
 {:type :framed,
  :nr 345,
  :score 4,
  :user "Einar",
  :timestamp_ms 1676789081493}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 344,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1676707482587}
 {:type :framed,
  :nr 344,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676680605167}
 {:type :framed,
  :nr 344,
  :score 5,
  :user "Even",
  :timestamp_ms 1676679239991}
 {:type :framed,
  :nr 344,
  :score 3,
  :user "Lars",
  :timestamp_ms 1676676567228}
 {:type :framed,
  :nr 344,
  :score 4,
  :user "Einar",
  :timestamp_ms 1676674934647}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 343,
  :score 4,
  :user "Even",
  :timestamp_ms 1676632351399}
 {:type :framed,
  :nr 343,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676631653115}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 343,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676617747875}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 342,
  :score 4,
  :user "Lars",
  :timestamp_ms 1676617378827}
 {:type :framed,
  :nr 343,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1676614732249}
 {:type :framed,
  :nr 343,
  :score 4,
  :user "Einar",
  :timestamp_ms 1676611680540}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 342,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676535630351}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 342,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1676534925753}
 {:type :framed,
  :nr 342,
  :score 3,
  :user "Einar",
  :timestamp_ms 1676531178742}
 {:type :framed,
  :nr 342,
  :score 3,
  :user "Even",
  :timestamp_ms 1676502968807}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 341,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1676442356208}
 {:type :framed,
  :nr 341,
  :score 2,
  :user "Even",
  :timestamp_ms 1676442187123}
 {:type :framed,
  :nr 341,
  :score 2,
  :user "Einar",
  :timestamp_ms 1676439357654}
 {:type :framed,
  :nr 341,
  :score 0,
  :user "Lars",
  :timestamp_ms 1676415960024}
 {:type :framed,
  :nr 341,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1676415925284}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 340,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1676362647137}
 {:type :framed,
  :nr 340,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1676357186712}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 340,
  :score 0,
  :user "Even",
  :timestamp_ms 1676355624714}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 340,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676355106367}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 340,
  :score 6,
  :user "Einar",
  :timestamp_ms 1676353522967}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 24,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676278045458}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 339,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1676276196812}
 {:type :episode,
  :nr 24,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1676274403218}
 {:type :episode,
  :nr 24,
  :score 2,
  :user "Lars",
  :timestamp_ms 1676274187772}
 {:type :framed,
  :nr 339,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676273785934}
 {:type :framed,
  :nr 339,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1676273551795}
 {:type :episode,
  :nr 24,
  :score 3,
  :user "Even",
  :timestamp_ms 1676271439301}
 {:type :framed,
  :nr 339,
  :score 1,
  :user "Even",
  :timestamp_ms 1676270135552}
 {:type :episode,
  :nr 24,
  :score 5,
  :user "Einar",
  :timestamp_ms 1676265313632}
 {:type :framed,
  :nr 339,
  :score 4,
  :user "Einar",
  :timestamp_ms 1676264915504}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 338,
  :score 1,
  :user "Lars",
  :timestamp_ms 1676235691350}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 338,
  :score 1,
  :user "Even",
  :timestamp_ms 1676191452705}
 {:type :framed,
  :nr 338,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1676187290056}
 {:type :framed,
  :nr 338,
  :score 5,
  :user "Einar",
  :timestamp_ms 1676184325557}
 {:type :framed,
  :nr 338,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1676159166733}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 337,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1676085752528}
 {:type :framed,
  :nr 337,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1676072498684}
 {:type :framed,
  :nr 337,
  :score 5,
  :user "Even",
  :timestamp_ms 1676070986888}
 {:type :framed,
  :nr 337,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676070222228}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 337,
  :score 6,
  :user "Einar",
  :timestamp_ms 1676070120163}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 336,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1676017750879}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 336,
  :score 6,
  :user "Lars",
  :timestamp_ms 1676013858961}
 {:type :framed,
  :nr 336,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1676012161197}
 {:type :framed,
  :nr 336,
  :score 1,
  :user "Even",
  :timestamp_ms 1676010303020}
 {:type :framed,
  :nr 336,
  :score 0,
  :user "Einar",
  :timestamp_ms 1676007295934}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 335,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1675954198173}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 335,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1675939075839}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 335,
  :score 0,
  :user "Even",
  :timestamp_ms 1675935390831}
 {:type :framed,
  :nr 335,
  :score 0,
  :user "Lars",
  :timestamp_ms 1675934220381}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 335,
  :score 0,
  :user "Einar",
  :timestamp_ms 1675921136032}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 334,
  :score 6,
  :user "Lars",
  :timestamp_ms 1675843082034}
 {:type :framed,
  :nr 334,
  :score 6,
  :user "Even",
  :timestamp_ms 1675842446047}
 {:type :framed,
  :nr 334,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1675840932398}
 {:type :framed,
  :nr 334,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1675840581312}
 {:type :framed,
  :nr 334,
  :score 6,
  :user "Einar",
  :timestamp_ms 1675832062548}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 333,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675766399700}
 {:type :framed,
  :nr 333,
  :score 2,
  :user "Lars",
  :timestamp_ms 1675764144694}
 {:type :framed,
  :nr 333,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1675763223393}
 {:type :framed,
  :nr 333,
  :score 2,
  :user "Even",
  :timestamp_ms 1675751442390}
 {:type :framed,
  :nr 333,
  :score 2,
  :user "Einar",
  :timestamp_ms 1675746263405}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 23,
  :score 7,
  :user "Einar",
  :timestamp_ms 1675685401059}
 {:type :episode,
  :nr 23,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1675683604044}
 {:type :episode,
  :nr 23,
  :score 8,
  :user "Lars",
  :timestamp_ms 1675681507106}
 {:type :episode,
  :nr 23,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675676722030}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 23,
  :score 0,
  :user "Even",
  :timestamp_ms 1675674342206}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 332,
  :score 0,
  :user "Even",
  :timestamp_ms 1675674101565}
 {:type :framed,
  :nr 332,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675673870104}
 {:type :framed,
  :nr 332,
  :score 5,
  :user "Einar",
  :timestamp_ms 1675661630137}
 {:type :framed,
  :nr 332,
  :score 4,
  :user "Lars",
  :timestamp_ms 1675641806397}
 {:type :framed,
  :nr 332,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1675640467785}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 331,
  :score 5,
  :user "Lars",
  :timestamp_ms 1675587808636}
 {:type :framed,
  :nr 331,
  :score 1,
  :user "Even",
  :timestamp_ms 1675579264229}
 {:type :framed,
  :nr 331,
  :score 1,
  :user "Einar",
  :timestamp_ms 1675578722172}
 {:type :framed,
  :nr 331,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675556801958}
 {:type :framed,
  :nr 331,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1675556716399}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 330,
  :score 0,
  :user "Even",
  :timestamp_ms 1675499670983}
 {:type :framed,
  :nr 330,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675466682674}
 {:type :framed,
  :nr 330,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1675465991613}
 {:type :framed,
  :nr 330,
  :score 1,
  :user "Lars",
  :timestamp_ms 1675465693144}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 330,
  :score 1,
  :user "Einar",
  :timestamp_ms 1675465484474}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 329,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1675413696556}
 {:type :framed,
  :nr 329,
  :score 2,
  :user "Even",
  :timestamp_ms 1675407365386}
 {:type :framed,
  :nr 329,
  :score 5,
  :user "Lars",
  :timestamp_ms 1675404443016}
 {:type :framed,
  :nr 329,
  :score 4,
  :user "Einar",
  :timestamp_ms 1675402391650}
 {:type :framed,
  :nr 329,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1675381815679}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 328,
  :score 0,
  :user "Even",
  :timestamp_ms 1675339219436}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 328,
  :score 1,
  :user "Lars",
  :timestamp_ms 1675332270213}
 {:type :framed,
  :nr 328,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1675332122237}
 {:type :framed,
  :nr 328,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675331861883}
 {:type :framed,
  :nr 328,
  :score 2,
  :user "Einar",
  :timestamp_ms 1675316425125}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 327,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1675250552298}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 327,
  :score 0,
  :user "Even",
  :timestamp_ms 1675232934455}
 {:type :framed,
  :nr 327,
  :score 6,
  :user "Einar",
  :timestamp_ms 1675227204082}
 {:type :framed,
  :nr 327,
  :score 6,
  :user "Lars",
  :timestamp_ms 1675207300569}
 {:type :framed,
  :nr 327,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1675206989649}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 326,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1675157137368}
 {:type :framed,
  :nr 326,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1675156927474}
 {:type :framed,
  :nr 326,
  :score 2,
  :user "Lars",
  :timestamp_ms 1675154346129}
 {:type :framed,
  :nr 326,
  :score 0,
  :user "Even",
  :timestamp_ms 1675154275700}
 {:type :framed,
  :nr 326,
  :score 2,
  :user "Einar",
  :timestamp_ms 1675143263365}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 22,
  :score 2,
  :user "Even",
  :timestamp_ms 1675060015858}
 {:type :framed,
  :nr 325,
  :score 1,
  :user "Even",
  :timestamp_ms 1675058660230}
 {:type :framed,
  :nr 325,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675055377044}
 {:type :episode,
  :nr 22,
  :score 10,
  :user "Abdi",
  :timestamp_ms 1675055366315}
 {:type :episode,
  :nr 22,
  :score 10,
  :user "Einar",
  :timestamp_ms 1675054796960}
 {:type :framed,
  :nr 325,
  :score 4,
  :user "Einar",
  :timestamp_ms 1675054585684}
 {:type :episode,
  :nr 22,
  :score 10,
  :user "Lars",
  :timestamp_ms 1675036729591}
 {:type :episode,
  :nr 22,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1675035942263}
 {:type :framed,
  :nr 325,
  :score 6,
  :user "Lars",
  :timestamp_ms 1675034484377}
 {:type :framed,
  :nr 325,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1675033703782}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 324,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1675006109711}
 {:type :framed,
  :nr 324,
  :score 3,
  :user "Lars",
  :timestamp_ms 1674987256159}
 {:type :framed,
  :nr 324,
  :score 3,
  :user "Even",
  :timestamp_ms 1674976991502}
 {:type :framed,
  :nr 324,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1674955922047}
 {:type :framed,
  :nr 324,
  :score 3,
  :user "Einar",
  :timestamp_ms 1674952359352}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 323,
  :score 0,
  :user "Even",
  :timestamp_ms 1674889879312}
 {:type :framed,
  :nr 323,
  :score 2,
  :user "Einar",
  :timestamp_ms 1674885625705}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 323,
  :score 0,
  :user "Lars",
  :timestamp_ms 1674864331560}
 {:type :framed,
  :nr 323,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1674862242915}
 {:type :framed,
  :nr 323,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1674861616320}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 322,
  :score 2,
  :user "Even",
  :timestamp_ms 1674813690962}
 {:type :framed,
  :nr 322,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1674803504377}
 {:type :framed,
  :nr 322,
  :score 6,
  :user "Einar",
  :timestamp_ms 1674797356071}
 {:type :framed,
  :nr 322,
  :score 3,
  :user "Lars",
  :timestamp_ms 1674779610307}
 {:type :framed,
  :nr 322,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1674775699918}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 321,
  :score 0,
  :user "Einar",
  :timestamp_ms 1674709020949}
 {:type :framed,
  :nr 321,
  :score 1,
  :user "Lars",
  :timestamp_ms 1674689752032}
 {:type :framed,
  :nr 321,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1674689421067}
 {:type :framed,
  :nr 321,
  :score 2,
  :user "Even",
  :timestamp_ms 1674688891736}
 {:type :framed,
  :nr 321,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1674688462815}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 320,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1674643698141}
 {:type :framed,
  :nr 320,
  :score 0,
  :user "Even",
  :timestamp_ms 1674628238951}
 {:type :framed,
  :nr 320,
  :score 1,
  :user "Einar",
  :timestamp_ms 1674625219629}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 320,
  :score 0,
  :user "Lars",
  :timestamp_ms 1674601379195}
 {:type :framed,
  :nr 320,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1674601287138}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 319,
  :score 0,
  :user "Even",
  :timestamp_ms 1674591482490}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 319,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1674556193119}
 {:type :framed,
  :nr 319,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1674556067278}
 {:type :framed,
  :nr 319,
  :score 6,
  :user "Lars",
  :timestamp_ms 1674546639103}
 {:type :framed,
  :nr 319,
  :score 2,
  :user "Einar",
  :timestamp_ms 1674536189054}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 21,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1674479902156}
 {:type :framed,
  :nr 318,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1674479900478}
 {:type :framed,
  :nr 318,
  :score 5,
  :user "Even",
  :timestamp_ms 1674475120197}
 {:type :episode,
  :nr 21,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1674471972843}
 {:type :framed,
  :nr 318,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1674471971440}
 {:type :episode,
  :nr 21,
  :score 0,
  :user "Lars",
  :timestamp_ms 1674471869770}
 {:type :framed,
  :nr 318,
  :score 6,
  :user "Lars",
  :timestamp_ms 1674471849525}
 {:type :episode,
  :nr 21,
  :score 0,
  :user "Even",
  :timestamp_ms 1674455141773}
 {:type :framed,
  :nr 318,
  :score 6,
  :user "Einar",
  :timestamp_ms 1674450344310}
 {:type :episode,
  :nr 21,
  :score 3,
  :user "Einar",
  :timestamp_ms 1674450319249}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 317,
  :score 3,
  :user "Einar",
  :timestamp_ms 1674347226135}
 {:type :framed,
  :nr 317,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1674344369625}
 {:type :framed,
  :nr 317,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1674342205683}
 {:type :framed,
  :nr 317,
  :score 1,
  :user "Lars",
  :timestamp_ms 1674342081874}
 {:type :framed,
  :nr 317,
  :score 0,
  :user "Even",
  :timestamp_ms 1674342057998}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 316,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1674292969529}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 316,
  :score 6,
  :user "Lars",
  :timestamp_ms 1674285127981}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 316,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1674261040454}
 {:type :framed,
  :nr 316,
  :score 1,
  :user "Even",
  :timestamp_ms 1674256657283}
 {:type :framed,
  :nr 316,
  :score 3,
  :user "Einar",
  :timestamp_ms 1674256117687}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 315,
  :score 0,
  :user "Lars",
  :timestamp_ms 1674198582877}
 {:type :framed,
  :nr 315,
  :score 0,
  :user "Even",
  :timestamp_ms 1674197167962}
 {:type :framed,
  :nr 315,
  :score 1,
  :user "Einar",
  :timestamp_ms 1674191885323}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 315,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1674177663847}
 {:type :framed,
  :nr 315,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1674169835043}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 314,
  :score 1,
  :user "Even",
  :timestamp_ms 1674115207185}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 314,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1674113281703}
 {:type :framed,
  :nr 314,
  :score 1,
  :user "Lars",
  :timestamp_ms 1674106746499}
 {:type :framed,
  :nr 314,
  :score 1,
  :user "Einar",
  :timestamp_ms 1674104000458}
 {:type :framed,
  :nr 314,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1674083148635}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 313,
  :score 4,
  :user "Einar",
  :timestamp_ms 1674023503275}
 {:type :framed,
  :nr 313,
  :score 2,
  :user "Even",
  :timestamp_ms 1674022118275}
 {:type :framed,
  :nr 313,
  :score 6,
  :user "Lars",
  :timestamp_ms 1674018282041}
 {:type :framed,
  :nr 313,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1673998220980}
 {:type :framed,
  :nr 313,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673996543135}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 312,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673961314996}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 312,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1673960221127}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 312,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673947689786}
 {:type :framed,
  :nr 312,
  :score 2,
  :user "Even",
  :timestamp_ms 1673934858400}
 {:type :framed,
  :nr 312,
  :score 5,
  :user "Einar",
  :timestamp_ms 1673931784490}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 311,
  :score 1,
  :user "Even",
  :timestamp_ms 1673864972393}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 20,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1673856743817}
 {:type :framed,
  :nr 311,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1673856739132}
 {:type :episode,
  :nr 20,
  :score 0,
  :user "Even",
  :timestamp_ms 1673852090059}
 {:type :episode,
  :nr 20,
  :score 2,
  :user "Einar",
  :timestamp_ms 1673846188635}
 {:type :framed,
  :nr 311,
  :score 1,
  :user "Einar",
  :timestamp_ms 1673846120796}
 {:type :episode,
  :nr 20,
  :score 1,
  :user "Lars",
  :timestamp_ms 1673824318608}
 {:type :episode,
  :nr 20,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673824244980}
 {:type :framed,
  :nr 311,
  :score 1,
  :user "Lars",
  :timestamp_ms 1673823839141}
 {:type :framed,
  :nr 311,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673823666556}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 310,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1673773161037}
 {:type :framed,
  :nr 310,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673745468547}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 310,
  :score 5,
  :user "Lars",
  :timestamp_ms 1673738055779}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 310,
  :score 5,
  :user "Even",
  :timestamp_ms 1673738016313}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 310,
  :score 4,
  :user "Einar",
  :timestamp_ms 1673737366305}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 309,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673697162691}
 {:type :framed,
  :nr 309,
  :score 2,
  :user "Lars",
  :timestamp_ms 1673688811972}
 {:type :framed,
  :nr 309,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1673684170743}
 {:type :framed,
  :nr 309,
  :score 2,
  :user "Even",
  :timestamp_ms 1673681200871}
 {:type :framed,
  :nr 309,
  :score 0,
  :user "Einar",
  :timestamp_ms 1673678314294}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 308,
  :score 3,
  :user "Even",
  :timestamp_ms 1673632929775}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 308,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1673602964666}
 {:type :framed,
  :nr 308,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673601961658}
 {:type :framed,
  :nr 308,
  :score 3,
  :user "Einar",
  :timestamp_ms 1673588319441}
 {:type :framed,
  :nr 308,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673565452121}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 307,
  :score 1,
  :user "Lars",
  :timestamp_ms 1673520662721}
 {:type :framed,
  :nr 307,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1673520660583}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 307,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673518587242}
 {:type :framed,
  :nr 307,
  :score 3,
  :user "Even",
  :timestamp_ms 1673503505058}
 {:type :framed,
  :nr 307,
  :score 2,
  :user "Einar",
  :timestamp_ms 1673499608350}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 306,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1673433967798}
 {:type :framed,
  :nr 306,
  :score 5,
  :user "Even",
  :timestamp_ms 1673431961057}
 {:type :framed,
  :nr 306,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673426665200}
 {:type :framed,
  :nr 306,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1673424418928}
 {:type :framed,
  :nr 306,
  :score 2,
  :user "Einar",
  :timestamp_ms 1673415003331}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 305,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673333464241}
 {:type :framed,
  :nr 305,
  :score 0,
  :user "Even",
  :timestamp_ms 1673332345171}
 {:type :framed,
  :nr 305,
  :score 0,
  :user "Einar",
  :timestamp_ms 1673326722140}
 {:type :framed,
  :nr 305,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673307155646}
 {:type :framed,
  :nr 305,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1673305781114}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 304,
  :score 2,
  :user "Even",
  :timestamp_ms 1673253711923}
 {:type :episode,
  :nr 19,
  :score 2,
  :user "Even",
  :timestamp_ms 1673253484926}
 {:type :episode,
  :nr 19,
  :score 3,
  :user "Lars",
  :timestamp_ms 1673243066274}
 {:type :framed,
  :nr 304,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673242643853}
 {:type :episode,
  :nr 19,
  :score 2,
  :user "Einar",
  :timestamp_ms 1673240966063}
 {:type :framed,
  :nr 304,
  :score 3,
  :user "Einar",
  :timestamp_ms 1673240783643}
 {:type :episode,
  :nr 19,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1673221928576}
 {:type :episode,
  :nr 19,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673220919261}
 {:type :framed,
  :nr 304,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1673220908427}
 {:type :framed,
  :nr 304,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1673220732093}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 303,
  :score 1,
  :user "Lars",
  :timestamp_ms 1673135229115}
 {:type :framed,
  :nr 303,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1673135065415}
 {:type :framed,
  :nr 303,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1673133314479}
 {:type :framed,
  :nr 303,
  :score 1,
  :user "Even",
  :timestamp_ms 1673132621661}
 {:type :framed,
  :nr 303,
  :score 1,
  :user "Einar",
  :timestamp_ms 1673132538783}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 302,
  :score 6,
  :user "Lars",
  :timestamp_ms 1673080106747}
 {:type :framed,
  :nr 302,
  :score 2,
  :user "Even",
  :timestamp_ms 1673079670005}
 {:type :framed,
  :nr 302,
  :score 2,
  :user "Einar",
  :timestamp_ms 1673075367772}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 302,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1673051226693}
 {:type :framed,
  :nr 302,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1673050036020}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 301,
  :score 6,
  :user "Lars",
  :timestamp_ms 1672996929145}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 301,
  :score 2,
  :user "Even",
  :timestamp_ms 1672987404690}
 {:type :framed,
  :nr 301,
  :score 3,
  :user "Einar",
  :timestamp_ms 1672983053083}
 {:type :framed,
  :nr 301,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1672960168143}
 {:type :framed,
  :nr 301,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1672959728727}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 300,
  :score 0,
  :user "Lars",
  :timestamp_ms 1672908276728}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 300,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1672906654733}
 {:type :framed,
  :nr 300,
  :score 0,
  :user "Even",
  :timestamp_ms 1672899616515}
 {:type :framed,
  :nr 300,
  :score 0,
  :user "Einar",
  :timestamp_ms 1672893577808}
 {:type :framed,
  :nr 300,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672875584226}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 299,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1672831659884}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 299,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1672828673615}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 299,
  :score 0,
  :user "Even",
  :timestamp_ms 1672821676582}
 {:type :framed,
  :nr 299,
  :score 6,
  :user "Lars",
  :timestamp_ms 1672814956904}
 {:type :framed,
  :nr 299,
  :score 6,
  :user "Einar",
  :timestamp_ms 1672809027100}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 298,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672736665432}
 {:type :framed,
  :nr 298,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1672734065172}
 {:type :framed,
  :nr 298,
  :score 4,
  :user "Lars",
  :timestamp_ms 1672733934187}
 {:type :framed,
  :nr 298,
  :score 1,
  :user "Even",
  :timestamp_ms 1672733497637}
 {:type :framed,
  :nr 298,
  :score 2,
  :user "Einar",
  :timestamp_ms 1672721739490}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 18,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672647221757}
 {:type :framed,
  :nr 297,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1672647210289}
 {:type :framed,
  :nr 297,
  :score 0,
  :user "Even",
  :timestamp_ms 1672643585484}
 {:type :episode,
  :nr 18,
  :score 3,
  :user "Even",
  :timestamp_ms 1672643376336}
 {:type :episode,
  :nr 18,
  :score 3,
  :user "Einar",
  :timestamp_ms 1672641508905}
 {:type :framed,
  :nr 297,
  :score 3,
  :user "Einar",
  :timestamp_ms 1672641252692}
 {:type :episode,
  :nr 18,
  :score 3,
  :user "Lars",
  :timestamp_ms 1672628004234}
 {:type :framed,
  :nr 297,
  :score 0,
  :user "Lars",
  :timestamp_ms 1672627898423}
 {:type :episode,
  :nr 18,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1672617841764}
 {:type :framed,
  :nr 297,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1672617469974}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 296,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1672582339665}
 {:type :framed,
  :nr 296,
  :score 1,
  :user "Lars",
  :timestamp_ms 1672532969840}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 296,
  :score 2,
  :user "Einar",
  :timestamp_ms 1672529138962}
 {:type :framed,
  :nr 296,
  :score 1,
  :user "Even",
  :timestamp_ms 1672528701703}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 296,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672527886821}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 295,
  :score 2,
  :user "Lars",
  :timestamp_ms 1672476896616}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 295,
  :score 2,
  :user "Even",
  :timestamp_ms 1672442717467}
 {:type :framed,
  :nr 295,
  :score 2,
  :user "Einar",
  :timestamp_ms 1672441710226}
 {:type :framed,
  :nr 295,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672441564589}
 {:type :framed,
  :nr 295,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1672441421794}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 294,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1672413833888}
 {:type :framed,
  :nr 294,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1672394916114}
 {:type :framed,
  :nr 294,
  :score 1,
  :user "Lars",
  :timestamp_ms 1672389477355}
 {:type :framed,
  :nr 294,
  :score 1,
  :user "Even",
  :timestamp_ms 1672384839582}
 {:type :framed,
  :nr 294,
  :score 3,
  :user "Einar",
  :timestamp_ms 1672384559247}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 293,
  :score 1,
  :user "Einar",
  :timestamp_ms 1672297955964}
 {:type :framed,
  :nr 293,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672270997493}
 {:type :framed,
  :nr 293,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1672269557481}
 {:type :framed,
  :nr 293,
  :score 1,
  :user "Lars",
  :timestamp_ms 1672268914207}
 {:type :framed,
  :nr 293,
  :score 0,
  :user "Even",
  :timestamp_ms 1672268644985}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 292,
  :score 2,
  :user "Even",
  :timestamp_ms 1672215415497}
 {:type :framed,
  :nr 292,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1672184203725}
 {:type :framed,
  :nr 292,
  :score 6,
  :user "Lars",
  :timestamp_ms 1672184052567}
 {:type :framed,
  :nr 292,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1672183089659}
 {:type :framed,
  :nr 292,
  :score 1,
  :user "Einar",
  :timestamp_ms 1672182610503}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 291,
  :score 2,
  :user "Even",
  :timestamp_ms 1672105575343}
 {:type :framed,
  :nr 291,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1672099459513}
 {:type :framed,
  :nr 291,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1672097182294}
 {:type :framed,
  :nr 291,
  :score 2,
  :user "Lars",
  :timestamp_ms 1672096615077}
 {:type :framed,
  :nr 291,
  :score 2,
  :user "Einar",
  :timestamp_ms 1672096422305}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 17,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1672061320572}
 {:type :framed,
  :nr 290,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1672061285325}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 17,
  :score 2,
  :user "Lars",
  :timestamp_ms 1672047527660}
 {:type :framed,
  :nr 290,
  :score 2,
  :user "Lars",
  :timestamp_ms 1672047444599}
 {:type :episode,
  :nr 17,
  :score 3,
  :user "Even",
  :timestamp_ms 1672043040441}
 {:type :framed,
  :nr 290,
  :score 4,
  :user "Einar",
  :timestamp_ms 1672040129168}
 {:type :episode,
  :nr 17,
  :score 7,
  :user "Einar",
  :timestamp_ms 1672040113629}
 {:type :episode,
  :nr 17,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1672011189022}
 {:type :framed,
  :nr 290,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1672010657788}
 {:type :framed,
  :nr 290,
  :score 0,
  :user "Even",
  :timestamp_ms 1672010316372}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 289,
  :score 0,
  :user "Even",
  :timestamp_ms 1671985395504}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 289,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671984130464}
 {:type :framed,
  :nr 289,
  :score 4,
  :user "Lars",
  :timestamp_ms 1671982540658}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 289,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1671925177491}
 {:type :framed,
  :nr 289,
  :score 0,
  :user "Einar",
  :timestamp_ms 1671924797348}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 288,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671871617194}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 288,
  :score 4,
  :user "Einar",
  :timestamp_ms 1671864713775}
 {:type :framed,
  :nr 288,
  :score 0,
  :user "Even",
  :timestamp_ms 1671838210841}
 {:type :framed,
  :nr 288,
  :score 1,
  :user "Lars",
  :timestamp_ms 1671838124596}
 {:type :framed,
  :nr 288,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1671838058445}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 287,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671822210387}
 {:type :framed,
  :nr 287,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1671787019858}
 {:type :framed,
  :nr 287,
  :score 4,
  :user "Even",
  :timestamp_ms 1671782351475}
 {:type :framed,
  :nr 287,
  :score 6,
  :user "Einar",
  :timestamp_ms 1671780476760}
 {:type :framed,
  :nr 287,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1671755587462}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 286,
  :score 0,
  :user "Even",
  :timestamp_ms 1671696695549}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 286,
  :score 0,
  :user "Lars",
  :timestamp_ms 1671664442151}
 {:type :framed,
  :nr 286,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671664388798}
 {:type :framed,
  :nr 286,
  :score 0,
  :user "Einar",
  :timestamp_ms 1671663656680}
 {:type :framed,
  :nr 286,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1671663625481}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 285,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1671629230222}
 {:type :framed,
  :nr 285,
  :score 0,
  :user "Lars",
  :timestamp_ms 1671611929123}
 {:type :framed,
  :nr 285,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671608428287}
 {:type :framed,
  :nr 285,
  :score 2,
  :user "Einar",
  :timestamp_ms 1671601080217}
 {:type :framed,
  :nr 285,
  :score 0,
  :user "Even",
  :timestamp_ms 1671599194473}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 284,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1671529018250}
 {:type :framed,
  :nr 284,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1671528338223}
 {:type :framed,
  :nr 284,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671522783889}
 {:type :framed,
  :nr 284,
  :score 3,
  :user "Even",
  :timestamp_ms 1671522650361}
 {:type :framed,
  :nr 284,
  :score 3,
  :user "Einar",
  :timestamp_ms 1671519158846}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 16,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1671440204111}
 {:type :framed,
  :nr 283,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1671440196010}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 283,
  :score 1,
  :user "Einar",
  :timestamp_ms 1671429270024}
 {:type :episode,
  :nr 16,
  :score 0,
  :user "Einar",
  :timestamp_ms 1671429237796}
 {:type :framed,
  :nr 283,
  :score 0,
  :user "Even",
  :timestamp_ms 1671406910676}
 {:type :episode,
  :nr 16,
  :score 0,
  :user "Even",
  :timestamp_ms 1671406858103}
 {:type :episode,
  :nr 16,
  :score 10,
  :user "Lars",
  :timestamp_ms 1671405287630}
 {:type :framed,
  :nr 283,
  :score 1,
  :user "Lars",
  :timestamp_ms 1671404908206}
 {:type :episode,
  :nr 16,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671404822581}
 {:type :framed,
  :nr 283,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1671404753184}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 282,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671362648053}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 282,
  :score 2,
  :user "Einar",
  :timestamp_ms 1671355474100}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 282,
  :score 4,
  :user "Even",
  :timestamp_ms 1671354130847}
 {:type :framed,
  :nr 282,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1671325743923}
 {:type :framed,
  :nr 282,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1671318155177}
 {:type :framed,
  :nr 281,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671267947120}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 281,
  :score 1,
  :user "Even",
  :timestamp_ms 1671263166082}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 280,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1671235416812}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 281,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1671234599026}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 281,
  :score 0,
  :user "Einar",
  :timestamp_ms 1671233785407}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 281,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1671232387475}
 {:type :framed,
  :nr 280,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1671194468394}
 {:type :framed,
  :nr 280,
  :score 3,
  :user "Even",
  :timestamp_ms 1671181387150}
 {:type :framed,
  :nr 280,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671146536985}
 {:type :framed,
  :nr 280,
  :score 3,
  :user "Einar",
  :timestamp_ms 1671145893296}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 279,
  :score 2,
  :user "Even",
  :timestamp_ms 1671101976302}
 {:type :framed,
  :nr 279,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1671099026808}
 {:type :framed,
  :nr 279,
  :score 6,
  :user "Lars",
  :timestamp_ms 1671094883090}
 {:type :framed,
  :nr 279,
  :score 2,
  :user "Einar",
  :timestamp_ms 1671083934913}
 {:type :framed,
  :nr 279,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1671059210648}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 278,
  :score 0,
  :user "Even",
  :timestamp_ms 1671013610398}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 278,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1671012778824}
 {:type :framed,
  :nr 278,
  :score 2,
  :user "Lars",
  :timestamp_ms 1671005187954}
 {:type :framed,
  :nr 278,
  :score 1,
  :user "Einar",
  :timestamp_ms 1670994674607}
 {:type :framed,
  :nr 278,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670972635137}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 277,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1670927800354}
 {:type :framed,
  :nr 277,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670927094017}
 {:type :framed,
  :nr 277,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1670919043650}
 {:type :framed,
  :nr 277,
  :score 0,
  :user "Even",
  :timestamp_ms 1670912234022}
 {:type :framed,
  :nr 277,
  :score 0,
  :user "Einar",
  :timestamp_ms 1670911189172}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 15,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1670845915705}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 276,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670844014426}
 {:type :episode,
  :nr 15,
  :score 3,
  :user "Even",
  :timestamp_ms 1670840084715}
 {:type :episode,
  :nr 15,
  :score 2,
  :user "Lars",
  :timestamp_ms 1670836179634}
 {:type :framed,
  :nr 276,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670835928858}
 {:type :framed,
  :nr 276,
  :score 3,
  :user "Even",
  :timestamp_ms 1670835149783}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 15,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1670827239771}
 {:type :framed,
  :nr 276,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1670827209061}
 {:type :episode,
  :nr 15,
  :score 3,
  :user "Einar",
  :timestamp_ms 1670826856055}
 {:type :framed,
  :nr 276,
  :score 6,
  :user "Einar",
  :timestamp_ms 1670826679303}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 275,
  :score 6,
  :user "Even",
  :timestamp_ms 1670748431826}
 {:type :framed,
  :nr 275,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1670748122158}
 {:type :framed,
  :nr 275,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670747818817}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 275,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1670721688508}
 {:type :framed,
  :nr 275,
  :score 6,
  :user "Einar",
  :timestamp_ms 1670720811534}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 274,
  :score 5,
  :user "Lars",
  :timestamp_ms 1670706264374}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 274,
  :score 1,
  :user "Even",
  :timestamp_ms 1670661508378}
 {:type :framed,
  :nr 274,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1670628537900}
 {:type :framed,
  :nr 274,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670627275847}
 {:type :framed,
  :nr 274,
  :score 0,
  :user "Einar",
  :timestamp_ms 1670627119920}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 273,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670578197718}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 273,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1670575660248}
 {:type :framed,
  :nr 273,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1670574608404}
 {:type :framed,
  :nr 273,
  :score 3,
  :user "Even",
  :timestamp_ms 1670569241624}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 273,
  :score 4,
  :user "Einar",
  :timestamp_ms 1670562425933}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 272,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1670509953357}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 272,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1670493471252}
 {:type :framed,
  :nr 272,
  :score 2,
  :user "Even",
  :timestamp_ms 1670487494041}
 {:type :framed,
  :nr 272,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670486031405}
 {:type :framed,
  :nr 272,
  :score 3,
  :user "Einar",
  :timestamp_ms 1670477741596}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 271,
  :score 0,
  :user "Even",
  :timestamp_ms 1670394642881}
 {:type :framed,
  :nr 271,
  :score 0,
  :user "Einar",
  :timestamp_ms 1670389111213}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 271,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1670370999322}
 {:type :framed,
  :nr 271,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670368935956}
 {:type :framed,
  :nr 271,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670368751739}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 270,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1670335566993}
 {:type :framed,
  :nr 270,
  :score 4,
  :user "Even",
  :timestamp_ms 1670330413117}
 {:type :framed,
  :nr 270,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1670322309745}
 {:type :framed,
  :nr 270,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670317672034}
 {:type :framed,
  :nr 270,
  :score 4,
  :user "Einar",
  :timestamp_ms 1670305029609}
 {:type :episode,
  :nr 14,
  :score 3,
  :user "Lars",
  :timestamp_ms 1670272751578}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 14,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1670246285725}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 269,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1670242985083}
 {:type :framed,
  :nr 269,
  :score 6,
  :user "Lars",
  :timestamp_ms 1670238120483}
 {:type :episode,
  :nr 14,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1670228517723}
 {:type :framed,
  :nr 269,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1670228433749}
 {:type :episode,
  :nr 14,
  :score 2,
  :user "Even",
  :timestamp_ms 1670226730027}
 {:type :framed,
  :nr 269,
  :score 3,
  :user "Even",
  :timestamp_ms 1670226656835}
 {:type :episode,
  :nr 14,
  :score 5,
  :user "Einar",
  :timestamp_ms 1670216647116}
 {:type :framed,
  :nr 269,
  :score 3,
  :user "Einar",
  :timestamp_ms 1670216259061}
 {:type :framed,
  :nr 268,
  :score 3,
  :user "Even",
  :timestamp_ms 1670142629408}
 {:type :framed,
  :nr 268,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1670114051614}
 {:type :framed,
  :nr 268,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670112330689}
 {:type :framed,
  :nr 268,
  :score 1,
  :user "Einar",
  :timestamp_ms 1670109830095}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 267,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1670072066919}
 {:type :framed,
  :nr 267,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1670071561693}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 267,
  :score 3,
  :user "Lars",
  :timestamp_ms 1670058113512}
 {:type :framed,
  :nr 267,
  :score 5,
  :user "Einar",
  :timestamp_ms 1670049414896}
 {:type :framed,
  :nr 267,
  :score 3,
  :user "Even",
  :timestamp_ms 1670023757397}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 266,
  :score 1,
  :user "Lars",
  :timestamp_ms 1669973213006}
 {:type :framed,
  :nr 266,
  :score 1,
  :user "Even",
  :timestamp_ms 1669967285561}
 {:type :framed,
  :nr 266,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1669966569098}
 {:type :framed,
  :nr 266,
  :score 1,
  :user "Einar",
  :timestamp_ms 1669959392527}
 {:type :framed,
  :nr 266,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1669936519839}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 265,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1669891242447}
 {:type :framed,
  :nr 265,
  :score 0,
  :user "Even",
  :timestamp_ms 1669876136671}
 {:type :framed,
  :nr 265,
  :score 2,
  :user "Einar",
  :timestamp_ms 1669872906581}
 {:type :framed,
  :nr 265,
  :score 0,
  :user "Lars",
  :timestamp_ms 1669854636263}
 {:type :framed,
  :nr 265,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1669849299256}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 264,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1669803366860}
 {:type :framed,
  :nr 264,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1669801961829}
 {:type :framed,
  :nr 264,
  :score 3,
  :user "Lars",
  :timestamp_ms 1669799814835}
 {:type :framed,
  :nr 264,
  :score 3,
  :user "Einar",
  :timestamp_ms 1669784118834}
 {:type :framed,
  :nr 264,
  :score 0,
  :user "Even",
  :timestamp_ms 1669780670470}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 263,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1669715622972}
 {:type :framed,
  :nr 263,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669710746970}
 {:type :framed,
  :nr 263,
  :score 4,
  :user "Even",
  :timestamp_ms 1669704121890}
 {:type :framed,
  :nr 263,
  :score 3,
  :user "Einar",
  :timestamp_ms 1669700602575}
 {:type :framed,
  :nr 263,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1669678605002}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 13,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1669629088762}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 13,
  :score 2,
  :user "Lars",
  :timestamp_ms 1669628733556}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 13,
  :score 2,
  :user "Even",
  :timestamp_ms 1669628707977}
 {:type :framed,
  :nr 262,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669628676199}
 {:type :framed,
  :nr 262,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1669628646988}
 {:type :episode,
  :nr 13,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1669628566098}
 {:type :framed,
  :nr 262,
  :score 6,
  :user "Even",
  :timestamp_ms 1669628333301}
 {:type :framed,
  :nr 262,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1669628243040}
 {:type :episode,
  :nr 13,
  :score 2,
  :user "Einar",
  :timestamp_ms 1669613834606}
 {:type :framed,
  :nr 262,
  :score 5,
  :user "Einar",
  :timestamp_ms 1669613692081}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 261,
  :score 1,
  :user "Even",
  :timestamp_ms 1669504531396}
 {:type :framed,
  :nr 261,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1669504397743}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 261,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669504296792}
 {:type :framed,
  :nr 261,
  :score 0,
  :user "Einar",
  :timestamp_ms 1669504110092}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 261,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1669504071150}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 260,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1669463830377}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 260,
  :score 6,
  :user "Even",
  :timestamp_ms 1669425950586}
 {:type :framed,
  :nr 260,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1669424938848}
 {:type :framed,
  :nr 260,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669420024930}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 260,
  :score 6,
  :user "Einar",
  :timestamp_ms 1669419936943}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 259,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669375887958}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 259,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1669369543037}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 259,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1669368915566}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 259,
  :score 0,
  :user "Even",
  :timestamp_ms 1669363146716}
 {:type :framed,
  :nr 259,
  :score 3,
  :user "Einar",
  :timestamp_ms 1669354959688}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 258,
  :score 3,
  :user "Lars",
  :timestamp_ms 1669278920453}
 {:type :framed,
  :nr 258,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1669278118724}
 {:type :framed,
  :nr 258,
  :score 3,
  :user "Einar",
  :timestamp_ms 1669265677911}
 {:type :framed,
  :nr 258,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1669246920084}
 {:type :framed,
  :nr 258,
  :score 2,
  :user "Even",
  :timestamp_ms 1669245546186}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 257,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1669191565799}
 {:type :framed,
  :nr 257,
  :score 2,
  :user "Even",
  :timestamp_ms 1669186679232}
 {:type :framed,
  :nr 257,
  :score 2,
  :user "Einar",
  :timestamp_ms 1669179412966}
 {:type :framed,
  :nr 257,
  :score 6,
  :user "Lars",
  :timestamp_ms 1669159092703}
 {:type :framed,
  :nr 257,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1669158931948}
 {:type :framed,
  :nr 256,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1669106971953}
 {:type :framed,
  :nr 256,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1669104869453}
 {:type :framed,
  :nr 256,
  :score 4,
  :user "Lars",
  :timestamp_ms 1669104837498}
 {:type :framed,
  :nr 256,
  :score 3,
  :user "Even",
  :timestamp_ms 1669104554165}
 {:type :framed,
  :nr 256,
  :score 5,
  :user "Einar",
  :timestamp_ms 1669092530463}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 12,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1669023850444}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 255,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1669023687727}
 {:type :episode,
  :nr 12,
  :score 0,
  :user "Even",
  :timestamp_ms 1669013826678}
 {:type :framed,
  :nr 255,
  :score 0,
  :user "Even",
  :timestamp_ms 1669012254997}
 {:type :episode,
  :nr 12,
  :score 0,
  :user "Einar",
  :timestamp_ms 1669008539581}
 {:type :framed,
  :nr 255,
  :score 3,
  :user "Einar",
  :timestamp_ms 1669008495616}
 {:type :episode,
  :nr 12,
  :score 10,
  :user "Lars",
  :timestamp_ms 1668987403711}
 {:type :framed,
  :nr 255,
  :score 3,
  :user "Lars",
  :timestamp_ms 1668987126084}
 {:type :episode,
  :nr 12,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1668987024703}
 {:type :framed,
  :nr 255,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1668986833567}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 254,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1668954062175}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 254,
  :score 6,
  :user "Einar",
  :timestamp_ms 1668946405179}
 {:type :framed,
  :nr 254,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1668942160587}
 {:type :framed,
  :nr 254,
  :score 4,
  :user "Lars",
  :timestamp_ms 1668940725964}
 {:type :framed,
  :nr 254,
  :score 1,
  :user "Even",
  :timestamp_ms 1668940305836}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 253,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1668865054879}
 {:type :framed,
  :nr 253,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1668863305720}
 {:type :framed,
  :nr 253,
  :score 2,
  :user "Lars",
  :timestamp_ms 1668851794101}
 {:type :framed,
  :nr 253,
  :score 3,
  :user "Even",
  :timestamp_ms 1668849914106}
 {:type :framed,
  :nr 253,
  :score 0,
  :user "Einar",
  :timestamp_ms 1668813688236}
 {:type :framed,
  :nr 252,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1668811685308}
 {:type :framed,
  :nr 252,
  :score 1,
  :user "Even",
  :timestamp_ms 1668756576587}
 {:type :framed,
  :nr 252,
  :score 6,
  :user "Einar",
  :timestamp_ms 1668747829192}
 {:type :framed,
  :nr 252,
  :score 6,
  :user "Lars",
  :timestamp_ms 1668727403137}
 {:type :framed,
  :nr 252,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1668727175278}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 251,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1668713849699}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 251,
  :score 6,
  :user "Even",
  :timestamp_ms 1668675266479}
 {:type :framed,
  :nr 251,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1668674026523}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 251,
  :score 6,
  :user "Lars",
  :timestamp_ms 1668673443124}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 251,
  :score 6,
  :user "Einar",
  :timestamp_ms 1668661581470}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 250,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1668589449932}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 250,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1668588095682}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 250,
  :score 6,
  :user "Lars",
  :timestamp_ms 1668587847014}
 {:type :framed,
  :nr 250,
  :score 3,
  :user "Even",
  :timestamp_ms 1668585828635}
 {:type :framed,
  :nr 250,
  :score 6,
  :user "Einar",
  :timestamp_ms 1668576334988}
 {:type :framed,
  :nr 249,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1668509397273}
 {:type :framed,
  :nr 249,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1668507574451}
 {:type :framed,
  :nr 249,
  :score 5,
  :user "Lars",
  :timestamp_ms 1668499444930}
 {:type :framed,
  :nr 249,
  :score 4,
  :user "Even",
  :timestamp_ms 1668495348519}
 {:type :framed,
  :nr 249,
  :score 3,
  :user "Einar",
  :timestamp_ms 1668489128866}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 248,
  :score 0,
  :user "Even",
  :timestamp_ms 1668418873115}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 11,
  :score 0,
  :user "Even",
  :timestamp_ms 1668410912418}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :episode,
  :nr 11,
  :score 5,
  :user "Lars",
  :timestamp_ms 1668406727655}
 {:type :framed,
  :nr 248,
  :score 6,
  :user "Lars",
  :timestamp_ms 1668406716418}
 {:type :episode,
  :nr 11,
  :score 4,
  :user "Einar",
  :timestamp_ms 1668401120153}
 {:type :framed,
  :nr 248,
  :score 0,
  :user "Einar",
  :timestamp_ms 1668400877981}
 {:type :episode,
  :nr 11,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1668383269708}
 {:type :framed,
  :nr 248,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1668383232824}
 {:type :episode,
  :nr 11,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1668381573242}
 {:type :framed,
  :nr 248,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1668380839184}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 247,
  :score 6,
  :user "Einar",
  :timestamp_ms 1668342360966}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 247,
  :score 2,
  :user "Lars",
  :timestamp_ms 1668332803491}
 {:type :framed,
  :nr 247,
  :score 2,
  :user "Even",
  :timestamp_ms 1668331649488}
 {:type :framed,
  :nr 247,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1668298232533}
 {:type :framed,
  :nr 247,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1668296065107}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 246,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1668251140778}
 {:type :framed,
  :nr 246,
  :score 0,
  :user "Even",
  :timestamp_ms 1668245550318}
 {:type :framed,
  :nr 246,
  :score 2,
  :user "Lars",
  :timestamp_ms 1668209527387}
 {:type :framed,
  :nr 246,
  :score 4,
  :user "Einar",
  :timestamp_ms 1668208564651}
 {:type :framed,
  :nr 246,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1668208419933}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 245,
  :score 6,
  :user "Lars",
  :timestamp_ms 1668173519346}
 {:type :framed,
  :nr 245,
  :score 3,
  :user "Even",
  :timestamp_ms 1668155114527}
 {:type :framed,
  :nr 245,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1668154196225}
 {:type :framed,
  :nr 245,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1668153647421}
 {:type :framed,
  :nr 245,
  :score 4,
  :user "Einar",
  :timestamp_ms 1668145767004}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 244,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1668087571624}
 {:type :framed,
  :nr 244,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1668086132035}
 {:type :framed,
  :nr 244,
  :score 0,
  :user "Even",
  :timestamp_ms 1668068248482}
 {:type :framed,
  :nr 244,
  :score 4,
  :user "Lars",
  :timestamp_ms 1668067039994}
 {:type :framed,
  :nr 244,
  :score 3,
  :user "Einar",
  :timestamp_ms 1668058055443}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 243,
  :score 2,
  :user "Even",
  :timestamp_ms 1667979619362}
 {:type :framed,
  :nr 243,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1667977939537}
 {:type :framed,
  :nr 243,
  :score 6,
  :user "Einar",
  :timestamp_ms 1667970483989}
 {:type :framed,
  :nr 243,
  :score 6,
  :user "Lars",
  :timestamp_ms 1667950095740}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 243,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1667949042686}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 242,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1667895682036}
 {:type :framed,
  :nr 242,
  :score 1,
  :user "Even",
  :timestamp_ms 1667890415071}
 {:type :framed,
  :nr 242,
  :score 0,
  :user "Einar",
  :timestamp_ms 1667885527652}
 {:type :framed,
  :nr 242,
  :score 1,
  :user "Lars",
  :timestamp_ms 1667865203311}
 {:type :framed,
  :nr 242,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1667862624803}
 {:type :episode,
  :nr 10,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667844022971}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 241,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667808153198}
 {:type :episode,
  :nr 10,
  :score 0,
  :user "Lars",
  :timestamp_ms 1667807174692}
 {:type :framed,
  :nr 241,
  :score 1,
  :user "Lars",
  :timestamp_ms 1667807163536}
 {:type :episode,
  :nr 10,
  :score 0,
  :user "Even",
  :timestamp_ms 1667803406526}
 {:type :framed,
  :nr 241,
  :score 0,
  :user "Even",
  :timestamp_ms 1667803397252}
 {:type :framed,
  :nr 241,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667797158433}
 {:type :episode,
  :nr 10,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667797151709}
 {:type :episode,
  :nr 10,
  :score 0,
  :user "Einar",
  :timestamp_ms 1667797103913}
 {:type :framed,
  :nr 241,
  :score 1,
  :user "Einar",
  :timestamp_ms 1667797066382}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 240,
  :score 1,
  :user "Einar",
  :timestamp_ms 1667715108143}
 {:type :framed,
  :nr 240,
  :score 0,
  :user "Even",
  :timestamp_ms 1667694103700}
 {:type :framed,
  :nr 240,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667689799882}
 {:type :framed,
  :nr 240,
  :score 2,
  :user "Lars",
  :timestamp_ms 1667689626124}
 {:type :framed,
  :nr 240,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667689490455}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 239,
  :score 4,
  :user "Lars",
  :timestamp_ms 1667647500206}
 {:type :framed,
  :nr 239,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1667647213661}
 {:type :framed,
  :nr 239,
  :score 2,
  :user "Even",
  :timestamp_ms 1667638010348}
 {:type :framed,
  :nr 239,
  :score 2,
  :user "Einar",
  :timestamp_ms 1667604442984}
 {:type :framed,
  :nr 239,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667603163202}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 238,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667549242217}
 {:type :framed,
  :nr 238,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667549185850}
 {:type :framed,
  :nr 238,
  :score 1,
  :user "Lars",
  :timestamp_ms 1667546722349}
 {:type :framed,
  :nr 238,
  :score 0,
  :user "Even",
  :timestamp_ms 1667543159466}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 238,
  :score 2,
  :user "Einar",
  :timestamp_ms 1667538154290}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 237,
  :score 1,
  :user "Even",
  :timestamp_ms 1667455238414}
 {:type :framed,
  :nr 237,
  :score 2,
  :user "Einar",
  :timestamp_ms 1667452997831}
 {:type :framed,
  :nr 237,
  :score 1,
  :user "Lars",
  :timestamp_ms 1667430701710}
 {:type :framed,
  :nr 237,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1667430622505}
 {:type :framed,
  :nr 237,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1667430079754}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 236,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667373926855}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 236,
  :score 0,
  :user "Even",
  :timestamp_ms 1667369972206}
 {:type :framed,
  :nr 236,
  :score 6,
  :user "Einar",
  :timestamp_ms 1667366438685}
 {:type :framed,
  :nr 236,
  :score 6,
  :user "Lars",
  :timestamp_ms 1667344789697}
 {:type :framed,
  :nr 236,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667344200167}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 235,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1667294708976}
 {:type :framed,
  :nr 235,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1667289406924}
 {:type :framed,
  :nr 235,
  :score 4,
  :user "Lars",
  :timestamp_ms 1667287098534}
 {:type :framed,
  :nr 235,
  :score 3,
  :user "Even",
  :timestamp_ms 1667283956091}
 {:type :framed,
  :nr 235,
  :score 3,
  :user "Einar",
  :timestamp_ms 1667277560348}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 234,
  :score 4,
  :user "Even",
  :timestamp_ms 1667252283616}
 {:type :episode,
  :nr 9,
  :score 6,
  :user "Even",
  :timestamp_ms 1667251945308}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 9,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1667220352764}
 {:type :framed,
  :nr 234,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1667220312850}
 {:type :episode,
  :nr 9,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1667210323193}
 {:type :framed,
  :nr 234,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1667209878729}
 {:type :episode,
  :nr 9,
  :score 3,
  :user "Lars",
  :timestamp_ms 1667203735742}
 {:type :framed,
  :nr 234,
  :score 6,
  :user "Lars",
  :timestamp_ms 1667203262355}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 234,
  :score 6,
  :user "Einar",
  :timestamp_ms 1667193728017}
 {:type :episode,
  :nr 9,
  :score 10,
  :user "Einar",
  :timestamp_ms 1667193717693}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 233,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1667135900967}
 {:type :framed,
  :nr 233,
  :score 3,
  :user "Lars",
  :timestamp_ms 1667113535230}
 {:type :framed,
  :nr 233,
  :score 2,
  :user "Even",
  :timestamp_ms 1667084091621}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 233,
  :score 2,
  :user "Einar",
  :timestamp_ms 1667082948451}
 {:type :framed,
  :nr 233,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1667081745264}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 232,
  :score 0,
  :user "Even",
  :timestamp_ms 1667038169580}
 {:type :framed,
  :nr 232,
  :score 3,
  :user "Lars",
  :timestamp_ms 1667037769823}
 {:type :framed,
  :nr 232,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1667033979478}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 232,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1666999741864}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 232,
  :score 2,
  :user "Einar",
  :timestamp_ms 1666994510386}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 231,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1666945336890}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 231,
  :score 2,
  :user "Even",
  :timestamp_ms 1666934766930}
 {:type :framed,
  :nr 231,
  :score 4,
  :user "Einar",
  :timestamp_ms 1666931722849}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 231,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1666909763255}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 231,
  :score 3,
  :user "Lars",
  :timestamp_ms 1666909130364}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 230,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1666858204095}
 {:type :framed,
  :nr 230,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666853047049}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 230,
  :score 4,
  :user "Even",
  :timestamp_ms 1666847998634}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 230,
  :score 0,
  :user "Einar",
  :timestamp_ms 1666843634642}
 {:type :framed,
  :nr 230,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1666822356419}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 229,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1666771003007}
 {:type :framed,
  :nr 229,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666766013015}
 {:type :framed,
  :nr 229,
  :score 2,
  :user "Even",
  :timestamp_ms 1666761793640}
 {:type :framed,
  :nr 229,
  :score 5,
  :user "Einar",
  :timestamp_ms 1666757409591}
 {:type :framed,
  :nr 229,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1666737424106}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 228,
  :score 2,
  :user "Even",
  :timestamp_ms 1666690985061}
 {:type :framed,
  :nr 228,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1666689853679}
 {:type :framed,
  :nr 228,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1666680394939}
 {:type :framed,
  :nr 228,
  :score 2,
  :user "Lars",
  :timestamp_ms 1666676695233}
 {:type :framed,
  :nr 228,
  :score 1,
  :user "Einar",
  :timestamp_ms 1666671009175}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 8,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1666600645603}
 {:type :framed,
  :nr 227,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1666600640969}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 8,
  :score 7,
  :user "Even",
  :timestamp_ms 1666600412654}
 {:type :episode,
  :nr 8,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1666596558509}
 {:type :framed,
  :nr 227,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1666596481122}
 {:type :episode,
  :nr 8,
  :score 2,
  :user "Lars",
  :timestamp_ms 1666592271159}
 {:type :framed,
  :nr 227,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666591844089}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 227,
  :score 5,
  :user "Even",
  :timestamp_ms 1666590698812}
 {:type :framed,
  :nr 227,
  :score 6,
  :user "Einar",
  :timestamp_ms 1666586545544}
 {:type :episode,
  :nr 8,
  :score 3,
  :user "Einar",
  :timestamp_ms 1666586525639}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 226,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1666482756568}
 {:type :framed,
  :nr 226,
  :score 2,
  :user "Even",
  :timestamp_ms 1666477822605}
 {:type :framed,
  :nr 226,
  :score 4,
  :user "Einar",
  :timestamp_ms 1666477789477}
 {:type :framed,
  :nr 226,
  :score 4,
  :user "Lars",
  :timestamp_ms 1666477706092}
 {:type :framed,
  :nr 226,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1666477678131}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 225,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1666436942329}
 {:type :framed,
  :nr 225,
  :score 1,
  :user "Even",
  :timestamp_ms 1666418588169}
 {:type :framed,
  :nr 225,
  :score 6,
  :user "Einar",
  :timestamp_ms 1666413050401}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 225,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666390975761}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 225,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1666389742561}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 224,
  :score 0,
  :user "Even",
  :timestamp_ms 1666330599734}
 {:type :framed,
  :nr 224,
  :score 3,
  :user "Einar",
  :timestamp_ms 1666327104536}
 {:type :framed,
  :nr 224,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1666305126476}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 224,
  :score 0,
  :user "Lars",
  :timestamp_ms 1666303493798}
 {:type :framed,
  :nr 224,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1666303450299}
 {:type :framed,
  :nr 223,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1666246114408}
 {:type :framed,
  :nr 223,
  :score 0,
  :user "Even",
  :timestamp_ms 1666243799547}
 {:type :framed,
  :nr 223,
  :score 1,
  :user "Lars",
  :timestamp_ms 1666241066294}
 {:type :framed,
  :nr 223,
  :score 1,
  :user "Einar",
  :timestamp_ms 1666239958377}
 {:type :framed,
  :nr 223,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1666218423550}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 222,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1666165051962}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 222,
  :score 3,
  :user "Even",
  :timestamp_ms 1666164812433}
 {:type :framed,
  :nr 222,
  :score 6,
  :user "Einar",
  :timestamp_ms 1666152549956}
 {:type :framed,
  :nr 222,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666130862255}
 {:type :framed,
  :nr 222,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1666130587808}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 221,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1666077434972}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 221,
  :score 0,
  :user "Even",
  :timestamp_ms 1666071383896}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 221,
  :score 0,
  :user "Einar",
  :timestamp_ms 1666071199762}
 {:type :framed,
  :nr 221,
  :score 6,
  :user "Lars",
  :timestamp_ms 1666045764765}
 {:type :framed,
  :nr 221,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1666044815202}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 7,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1665996304127}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 220,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1665995825204}
 {:type :episode,
  :nr 7,
  :score 4,
  :user "Even",
  :timestamp_ms 1665985071669}
 {:type :framed,
  :nr 220,
  :score 0,
  :user "Even",
  :timestamp_ms 1665984232949}
 {:type :episode,
  :nr 7,
  :score 7,
  :user "Einar",
  :timestamp_ms 1665981608760}
 {:type :framed,
  :nr 220,
  :score 3,
  :user "Einar",
  :timestamp_ms 1665981445363}
 {:type :episode,
  :nr 7,
  :score 5,
  :user "Lars",
  :timestamp_ms 1665958438816}
 {:type :framed,
  :nr 220,
  :score 2,
  :user "Lars",
  :timestamp_ms 1665958138207}
 {:type :episode,
  :nr 7,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1665958005060}
 {:type :framed,
  :nr 220,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1665957941876}
 {:type :framed,
  :nr 219,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1665878401981}
 {:type :framed,
  :nr 219,
  :score 1,
  :user "Even",
  :timestamp_ms 1665872420640}
 {:type :framed,
  :nr 219,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1665871895605}
 {:type :framed,
  :nr 219,
  :score 1,
  :user "Lars",
  :timestamp_ms 1665871649874}
 {:type :framed,
  :nr 219,
  :score 1,
  :user "Einar",
  :timestamp_ms 1665871573832}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 218,
  :score 0,
  :user "Even",
  :timestamp_ms 1665816096256}
 {:type :framed,
  :nr 218,
  :score 5,
  :user "Einar",
  :timestamp_ms 1665809209002}
 {:type :framed,
  :nr 218,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1665790125861}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 218,
  :score 6,
  :user "Lars",
  :timestamp_ms 1665787930167}
 {:type :framed,
  :nr 218,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1665787640599}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 217,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1665731856483}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 217,
  :score 0,
  :user "Einar",
  :timestamp_ms 1665722230982}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 217,
  :score 3,
  :user "Even",
  :timestamp_ms 1665700243763}
 {:type :framed,
  :nr 217,
  :score 1,
  :user "Lars",
  :timestamp_ms 1665698513596}
 {:type :framed,
  :nr 217,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1665698447697}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 216,
  :score 3,
  :user "Even",
  :timestamp_ms 1665639741676}
 {:type :framed,
  :nr 216,
  :score 6,
  :user "Einar",
  :timestamp_ms 1665635247155}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 216,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1665614306344}
 {:type :framed,
  :nr 216,
  :score 6,
  :user "Lars",
  :timestamp_ms 1665614160451}
 {:type :framed,
  :nr 216,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1665613890962}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 215,
  :score 2,
  :user "Even",
  :timestamp_ms 1665553101325}
 {:type :framed,
  :nr 215,
  :score 4,
  :user "Einar",
  :timestamp_ms 1665547135401}
 {:type :framed,
  :nr 215,
  :score 3,
  :user "Lars",
  :timestamp_ms 1665526461418}
 {:type :framed,
  :nr 215,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1665526225010}
 {:type :framed,
  :nr 215,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1665526217467}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 214,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1665477031772}
 {:type :framed,
  :nr 214,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1665473315014}
 {:type :framed,
  :nr 214,
  :score 1,
  :user "Even",
  :timestamp_ms 1665468753500}
 {:type :framed,
  :nr 214,
  :score 6,
  :user "Lars",
  :timestamp_ms 1665468366090}
 {:type :framed,
  :nr 214,
  :score 6,
  :user "Einar",
  :timestamp_ms 1665462564343}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 6,
  :score 9,
  :user "Vegard",
  :timestamp_ms 1665393401971}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 213,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1665392684064}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 6,
  :score 9,
  :user "Abdi",
  :timestamp_ms 1665383971082}
 {:type :framed,
  :nr 213,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1665383957651}
 {:type :episode,
  :nr 6,
  :score 2,
  :user "Even",
  :timestamp_ms 1665379779337}
 {:type :framed,
  :nr 213,
  :score 2,
  :user "Even",
  :timestamp_ms 1665379779031}
 {:type :framed,
  :nr 213,
  :score 6,
  :user "Lars",
  :timestamp_ms 1665379190175}
 {:type :episode,
  :nr 6,
  :score 10,
  :user "Lars",
  :timestamp_ms 1665379068942}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 213,
  :score 6,
  :user "Einar",
  :timestamp_ms 1665374276552}
 {:type :episode,
  :nr 6,
  :score 9,
  :user "Einar",
  :timestamp_ms 1665374176261}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 212,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1665267287372}
 {:type :framed,
  :nr 212,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1665267177247}
 {:type :framed,
  :nr 212,
  :score 3,
  :user "Lars",
  :timestamp_ms 1665266629076}
 {:type :framed,
  :nr 212,
  :score 0,
  :user "Einar",
  :timestamp_ms 1665266502964}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 212,
  :score 0,
  :user "Even",
  :timestamp_ms 1665266423184}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 211,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1665220010888}
 {:type :framed,
  :nr 211,
  :score 6,
  :user "Even",
  :timestamp_ms 1665212829303}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 211,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1665184732013}
 {:type :framed,
  :nr 211,
  :score 6,
  :user "Lars",
  :timestamp_ms 1665182568623}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 211,
  :score 6,
  :user "Einar",
  :timestamp_ms 1665182465585}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 210,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1665129309338}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 210,
  :score 1,
  :user "Even",
  :timestamp_ms 1665127183049}
 {:type :framed,
  :nr 210,
  :score 1,
  :user "Einar",
  :timestamp_ms 1665121518834}
 {:type :framed,
  :nr 210,
  :score 5,
  :user "Lars",
  :timestamp_ms 1665095352323}
 {:type :framed,
  :nr 210,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1665094805850}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 209,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1665051881541}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 209,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1665038930329}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 209,
  :score 2,
  :user "Lars",
  :timestamp_ms 1665033824594}
 {:type :framed,
  :nr 209,
  :score 1,
  :user "Einar",
  :timestamp_ms 1665033739345}
 {:type :framed,
  :nr 209,
  :score 0,
  :user "Even",
  :timestamp_ms 1665033572648}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 208,
  :score 0,
  :user "Even",
  :timestamp_ms 1664948805649}
 {:type :framed,
  :nr 208,
  :score 5,
  :user "Einar",
  :timestamp_ms 1664943125892}
 {:type :framed,
  :nr 208,
  :score 6,
  :user "Lars",
  :timestamp_ms 1664925797433}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 208,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1664921502542}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 208,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1664921215220}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 207,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1664873168327}
 {:type :framed,
  :nr 207,
  :score 6,
  :user "Einar",
  :timestamp_ms 1664861280355}
 {:type :framed,
  :nr 207,
  :score 6,
  :user "Even",
  :timestamp_ms 1664859394723}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 207,
  :score 6,
  :user "Lars",
  :timestamp_ms 1664835028317}
 {:type :framed,
  :nr 207,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664834778205}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 5,
  :score 4,
  :user "Even",
  :timestamp_ms 1664775103262}
 {:type :framed,
  :nr 206,
  :score 1,
  :user "Even",
  :timestamp_ms 1664774870407}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 5,
  :score 0,
  :user "Einar",
  :timestamp_ms 1664769771323}
 {:type :framed,
  :nr 206,
  :score 4,
  :user "Einar",
  :timestamp_ms 1664769699949}
 {:type :episode,
  :nr 5,
  :score 5,
  :user "Lars",
  :timestamp_ms 1664749286941}
 {:type :episode,
  :nr 5,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1664748747258}
 {:type :framed,
  :nr 206,
  :score 0,
  :user "Lars",
  :timestamp_ms 1664748624832}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 206,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1664748585096}
 {:type :framed,
  :nr 205,
  :score 0,
  :user "Even",
  :timestamp_ms 1664693793862}
 {:type :framed,
  :nr 205,
  :score 1,
  :user "Einar",
  :timestamp_ms 1664690187278}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 205,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1664663163269}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 205,
  :score 0,
  :user "Lars",
  :timestamp_ms 1664662973147}
 {:type :framed,
  :nr 205,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1664662923447}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 204,
  :score 0,
  :user "Even",
  :timestamp_ms 1664609794370}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 204,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1664576836490}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 204,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1664576650606}
 {:type :framed,
  :nr 204,
  :score 1,
  :user "Lars",
  :timestamp_ms 1664576174112}
 {:type :framed,
  :nr 204,
  :score 1,
  :user "Einar",
  :timestamp_ms 1664575697840}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 203,
  :score 3,
  :user "Even",
  :timestamp_ms 1664550335109}
 {:type :framed,
  :nr 203,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1664549772141}
 {:type :framed,
  :nr 203,
  :score 0,
  :user "Einar",
  :timestamp_ms 1664514091471}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 203,
  :score 6,
  :user "Lars",
  :timestamp_ms 1664490579064}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 203,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664490385795}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 202,
  :score 1,
  :user "Even",
  :timestamp_ms 1664429698005}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 202,
  :score 0,
  :user "Einar",
  :timestamp_ms 1664426753624}
 {:type :framed,
  :nr 202,
  :score 0,
  :user "Lars",
  :timestamp_ms 1664426561977}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 202,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1664403564774}
 {:type :framed,
  :nr 202,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1664403414647}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 201,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664361446055}
 {:type :framed,
  :nr 201,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1664344563887}
 {:type :framed,
  :nr 201,
  :score 2,
  :user "Lars",
  :timestamp_ms 1664343646488}
 {:type :framed,
  :nr 201,
  :score 2,
  :user "Even",
  :timestamp_ms 1664343355199}
 {:type :framed,
  :nr 201,
  :score 3,
  :user "Einar",
  :timestamp_ms 1664341990744}
 {:type :framed,
  :nr 200,
  :score 3,
  :user "Even",
  :timestamp_ms 1664256026266}
 {:type :framed,
  :nr 200,
  :score 3,
  :user "Einar",
  :timestamp_ms 1664253939392}
 {:type :framed,
  :nr 200,
  :score 3,
  :user "Lars",
  :timestamp_ms 1664230288520}
 {:type :framed,
  :nr 200,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1664230134146}
 {:type :framed,
  :nr 200,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664229810976}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 4,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1664185231145}
 {:type :episode,
  :nr 4,
  :score 3,
  :user "Even",
  :timestamp_ms 1664172317161}
 {:type :framed,
  :nr 199,
  :score 0,
  :user "Even",
  :timestamp_ms 1664170267728}
 {:type :episode,
  :nr 4,
  :score 6,
  :user "Einar",
  :timestamp_ms 1664167869867}
 {:type :framed,
  :nr 199,
  :score 2,
  :user "Einar",
  :timestamp_ms 1664167697422}
 {:type :framed,
  :nr 199,
  :score 6,
  :user "Lars",
  :timestamp_ms 1664151021722}
 {:type :episode,
  :nr 4,
  :score 0,
  :user "Lars",
  :timestamp_ms 1664147051216}
 {:type :episode,
  :nr 4,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1664144943787}
 {:type :framed,
  :nr 199,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664144667634}
 {:type :framed,
  :nr 199,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1664144649915}
 {:type :framed,
  :nr 198,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1664105616513}
 {:type :framed,
  :nr 198,
  :score 1,
  :user "Even",
  :timestamp_ms 1664066973486}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 198,
  :score 2,
  :user "Einar",
  :timestamp_ms 1664057039361}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 198,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1664056884327}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 197,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1664040660453}
 {:type :framed,
  :nr 197,
  :score 3,
  :user "Even",
  :timestamp_ms 1664000448858}
 {:type :framed,
  :nr 197,
  :score 6,
  :user "Lars",
  :timestamp_ms 1664000094493}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 197,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1663974086721}
 {:type :framed,
  :nr 197,
  :score 3,
  :user "Einar",
  :timestamp_ms 1663973691935}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 196,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1663915921195}
 {:type :framed,
  :nr 196,
  :score 2,
  :user "Even",
  :timestamp_ms 1663912590482}
 {:type :framed,
  :nr 196,
  :score 2,
  :user "Einar",
  :timestamp_ms 1663906193192}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 196,
  :score 4,
  :user "Lars",
  :timestamp_ms 1663884446716}
 {:type :framed,
  :nr 196,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1663884254795}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 195,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1663862680737}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 195,
  :score 0,
  :user "Even",
  :timestamp_ms 1663823421410}
 {:type :framed,
  :nr 195,
  :score 2,
  :user "Einar",
  :timestamp_ms 1663820419112}
 {:type :framed,
  :nr 195,
  :score 4,
  :user "Lars",
  :timestamp_ms 1663799049078}
 {:type :framed,
  :nr 195,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1663798382140}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 3,
  :score 1,
  :user "Lars",
  :timestamp_ms 1663754760957}
 {:type :episode,
  :nr 3,
  :score 1,
  :user "Even",
  :timestamp_ms 1663754603466}
 {:type :episode,
  :nr 3,
  :score 4,
  :user "Einar",
  :timestamp_ms 1663754589825}
 {:type :episode,
  :nr 3,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1663754468807}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 194,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1663753671135}
 {:type :framed,
  :nr 194,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663740244748}
 {:type :framed,
  :nr 194,
  :score 4,
  :user "Even",
  :timestamp_ms 1663739127824}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 194,
  :score 6,
  :user "Einar",
  :timestamp_ms 1663732946208}
 {:type :framed,
  :nr 194,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1663712017543}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 193,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1663656143396}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 193,
  :score 4,
  :user "Even",
  :timestamp_ms 1663652276012}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 193,
  :score 6,
  :user "Einar",
  :timestamp_ms 1663649279475}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 193,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663628816007}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 193,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1663626603211}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 192,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663614842926}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 192,
  :score 6,
  :user "Even",
  :timestamp_ms 1663609116946}
 {:type :framed,
  :nr 192,
  :score 3,
  :user "Einar",
  :timestamp_ms 1663559409566}
 {:type :framed,
  :nr 192,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1663539311117}
 {:type :framed,
  :nr 192,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1663538547014}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 191,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1663454997979}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 191,
  :score 0,
  :user "Even",
  :timestamp_ms 1663454840116}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 191,
  :score 3,
  :user "Einar",
  :timestamp_ms 1663454311273}
 {:type :framed,
  :nr 191,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663454241293}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 191,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1663454006466}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 190,
  :score 0,
  :user "Even",
  :timestamp_ms 1663395187279}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 190,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1663366911860}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 190,
  :score 2,
  :user "Lars",
  :timestamp_ms 1663366261740}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 190,
  :score 5,
  :user "Einar",
  :timestamp_ms 1663366194694}
 {:type :framed,
  :nr 190,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1663365865054}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 189,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1663328526513}
 {:type :framed,
  :nr 189,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1663315409103}
 {:type :framed,
  :nr 189,
  :score 0,
  :user "Even",
  :timestamp_ms 1663307374377}
 {:type :framed,
  :nr 189,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663303498708}
 {:type :framed,
  :nr 189,
  :score 1,
  :user "Einar",
  :timestamp_ms 1663303266364}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 188,
  :score 2,
  :user "Even",
  :timestamp_ms 1663233347288}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 188,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1663221727048}
 {:type :framed,
  :nr 188,
  :score 1,
  :user "Einar",
  :timestamp_ms 1663214697723}
 {:type :framed,
  :nr 188,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1663193336164}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 187,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1663185697826}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 187,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1663134778038}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 187,
  :score 6,
  :user "Lars",
  :timestamp_ms 1663129446810}
 {:type :framed,
  :nr 187,
  :score 1,
  :user "Einar",
  :timestamp_ms 1663128841001}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 186,
  :score 6,
  :user "Einar",
  :timestamp_ms 1663085388660}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 186,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1663066778925}
 {:type :framed,
  :nr 186,
  :score 3,
  :user "Even",
  :timestamp_ms 1663055913800}
 {:type :framed,
  :nr 186,
  :score 3,
  :user "Lars",
  :timestamp_ms 1663055566250}
 {:type :framed,
  :nr 186,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1663055499532}
 {:type :episode,
  :nr 2,
  :score 5,
  :user "Lars",
  :timestamp_ms 1662960664935}
 {:type :framed,
  :nr 185,
  :score 3,
  :user "Even",
  :timestamp_ms 1662960502584}
 {:type :episode,
  :nr 2,
  :score 5,
  :user "Even",
  :timestamp_ms 1662960309962}
 {:type :framed,
  :nr 185,
  :score 4,
  :user "Lars",
  :timestamp_ms 1662960282378}
 {:type :episode,
  :nr 2,
  :score 5,
  :user "Einar",
  :timestamp_ms 1662957506112}
 {:type :framed,
  :nr 185,
  :score 5,
  :user "Einar",
  :timestamp_ms 1662957334337}
 {:type :episode,
  :nr 2,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1662940788779}
 {:type :framed,
  :nr 185,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1662940173137}
 {:type :framed,
  :nr 184,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1662895671502}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 184,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1662848403300}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 184,
  :score 3,
  :user "Lars",
  :timestamp_ms 1662848298578}
 {:type :framed,
  :nr 184,
  :score 3,
  :user "Even",
  :timestamp_ms 1662848204229}
 {:type :framed,
  :nr 184,
  :score 4,
  :user "Einar",
  :timestamp_ms 1662848050663}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 183,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1662804999779}
 {:type :framed,
  :nr 183,
  :score 1,
  :user "Even",
  :timestamp_ms 1662788174725}
 {:type :framed,
  :nr 183,
  :score 6,
  :user "Lars",
  :timestamp_ms 1662762084813}
 {:type :framed,
  :nr 183,
  :score 6,
  :user "Einar",
  :timestamp_ms 1662762071269}
 {:type :framed,
  :nr 183,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1662760946828}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 182,
  :score 5,
  :user "Einar",
  :timestamp_ms 1662698216357}
 {:type :framed,
  :nr 182,
  :score 2,
  :user "Lars",
  :timestamp_ms 1662695508131}
 {:type :framed,
  :nr 182,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1662675184483}
 {:type :framed,
  :nr 182,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1662674635746}
 {:type :framed,
  :nr 181,
  :score 0,
  :user "Even",
  :timestamp_ms 1662628499342}
 {:type :framed,
  :nr 181,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1662623234289}
 {:type :framed,
  :nr 181,
  :score 2,
  :user "Lars",
  :timestamp_ms 1662617109351}
 {:type :framed,
  :nr 181,
  :score 3,
  :user "Einar",
  :timestamp_ms 1662611428355}
 {:type :framed,
  :nr 181,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1662594310695}
 {:type :framed,
  :nr 180,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1662534836397}
 {:type :framed,
  :nr 180,
  :score 1,
  :user "Even",
  :timestamp_ms 1662528937288}
 {:type :framed,
  :nr 180,
  :score 1,
  :user "Lars",
  :timestamp_ms 1662523585900}
 {:type :framed,
  :nr 180,
  :score 1,
  :user "Einar",
  :timestamp_ms 1662523492249}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 1,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1662449811200}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 179,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1662449267561}
 {:type :episode,
  :nr 1,
  :score 3,
  :user "Einar",
  :timestamp_ms 1662442455546}
 {:type :framed,
  :nr 179,
  :score 2,
  :user "Even",
  :timestamp_ms 1662441969996}
 {:type :episode,
  :nr 1,
  :score 1,
  :user "Even",
  :timestamp_ms 1662441792607}
 {:type :framed,
  :nr 179,
  :score 2,
  :user "Einar",
  :timestamp_ms 1662437099467}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 179,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1662416703849}
 {:type :episode,
  :nr 1,
  :score 0,
  :user "Lars",
  :timestamp_ms 1662416573753}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 179,
  :score 2,
  :user "Lars",
  :timestamp_ms 1662416536472}
 {:type :framed,
  :nr 178,
  :score 0,
  :user "Even",
  :timestamp_ms 1662357593363}
 {:type :framed,
  :nr 178,
  :score 0,
  :user "Einar",
  :timestamp_ms 1662352864867}
 {:type :framed,
  :nr 178,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1662331358618}
 {:type :framed,
  :nr 178,
  :score 5,
  :user "Lars",
  :timestamp_ms 1662330444362}
 {:type :framed,
  :nr 178,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1662330153851}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 177,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1662248095827}
 {:type :framed,
  :nr 177,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1662243325490}
 {:type :framed,
  :nr 177,
  :score 0,
  :user "Even",
  :timestamp_ms 1662242721177}
 {:type :framed,
  :nr 177,
  :score 0,
  :user "Lars",
  :timestamp_ms 1662242689577}
 {:type :framed,
  :nr 177,
  :score 1,
  :user "Einar",
  :timestamp_ms 1662242621605}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 176,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1662197994801}
 {:type :framed,
  :nr 176,
  :score 2,
  :user "Lars",
  :timestamp_ms 1662185948620}
 {:type :framed,
  :nr 176,
  :score 2,
  :user "Even",
  :timestamp_ms 1662185880550}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 176,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1662157981672}
 {:type :framed,
  :nr 176,
  :score 1,
  :user "Einar",
  :timestamp_ms 1662156467409}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 175,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1662105647866}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 175,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1662099544953}
 {:type :framed,
  :nr 175,
  :score 1,
  :user "Even",
  :timestamp_ms 1662097775891}
 {:type :framed,
  :nr 175,
  :score 6,
  :user "Lars",
  :timestamp_ms 1662094286397}
 {:type :framed,
  :nr 175,
  :score 4,
  :user "Einar",
  :timestamp_ms 1662094010234}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 174,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1662028289733}
 {:type :framed,
  :nr 174,
  :score 3,
  :user "Even",
  :timestamp_ms 1662010179179}
 {:type :framed,
  :nr 174,
  :score 3,
  :user "Einar",
  :timestamp_ms 1662008719691}
 {:type :framed,
  :nr 174,
  :score 3,
  :user "Lars",
  :timestamp_ms 1662006337199}
 {:type :framed,
  :nr 174,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1661985677358}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 173,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1661969501052}
 {:type :framed,
  :nr 173,
  :score 3,
  :user "Even",
  :timestamp_ms 1661941053411}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 173,
  :score 6,
  :user "Lars",
  :timestamp_ms 1661924460981}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 173,
  :score 0,
  :user "Einar",
  :timestamp_ms 1661922367656}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 173,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1661897002880}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 172,
  :score 1,
  :user "Even",
  :timestamp_ms 1661852665634}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 172,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1661845811649}
 {:type :framed,
  :nr 172,
  :score 1,
  :user "Lars",
  :timestamp_ms 1661836705790}
 {:type :framed,
  :nr 172,
  :score 5,
  :user "Einar",
  :timestamp_ms 1661833549772}
 {:type :framed,
  :nr 172,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1661811108326}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 171,
  :score 6,
  :user "Lars",
  :timestamp_ms 1661761419272}
 {:type :framed,
  :nr 171,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1661761163657}
 {:type :framed,
  :nr 171,
  :score 0,
  :user "Even",
  :timestamp_ms 1661750093122}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 171,
  :score 4,
  :user "Einar",
  :timestamp_ms 1661746233851}
 {:type :framed,
  :nr 171,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1661728553198}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 170,
  :score 0,
  :user "Even",
  :timestamp_ms 1661672640671}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 170,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1661671811475}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 170,
  :score 0,
  :user "Lars",
  :timestamp_ms 1661666093159}
 {:type :framed,
  :nr 170,
  :score 0,
  :user "Einar",
  :timestamp_ms 1661639508806}
 {:type :framed,
  :nr 170,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661639397513}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 169,
  :score 3,
  :user "Lars",
  :timestamp_ms 1661579307841}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 169,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1661553518004}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 169,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1661553117142}
 {:type :framed,
  :nr 169,
  :score 2,
  :user "Even",
  :timestamp_ms 1661553030850}
 {:type :framed,
  :nr 169,
  :score 3,
  :user "Einar",
  :timestamp_ms 1661551617125}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 168,
  :score 0,
  :user "Even",
  :timestamp_ms 1661511045840}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 168,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661510175788}
 {:type :framed,
  :nr 168,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1661497919366}
 {:type :framed,
  :nr 168,
  :score 6,
  :user "Lars",
  :timestamp_ms 1661487886565}
 {:type :framed,
  :nr 168,
  :score 5,
  :user "Einar",
  :timestamp_ms 1661487717653}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 167,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1661416877675}
 {:type :framed,
  :nr 167,
  :score 0,
  :user "Even",
  :timestamp_ms 1661405585597}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 167,
  :score 5,
  :user "Lars",
  :timestamp_ms 1661402627277}
 {:type :framed,
  :nr 167,
  :score 0,
  :user "Einar",
  :timestamp_ms 1661401327390}
 {:type :framed,
  :nr 167,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1661381004539}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 166,
  :score 6,
  :user "Lars",
  :timestamp_ms 1661340806932}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 166,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1661327248206}
 {:type :framed,
  :nr 166,
  :score 6,
  :user "Even",
  :timestamp_ms 1661318439392}
 {:type :framed,
  :nr 166,
  :score 5,
  :user "Einar",
  :timestamp_ms 1661316835162}
 {:type :framed,
  :nr 166,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661296384094}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 165,
  :score 3,
  :user "Even",
  :timestamp_ms 1661260221010}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 165,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1661251790165}
 {:type :framed,
  :nr 165,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661251752850}
 {:type :framed,
  :nr 165,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1661251634952}
 {:type :framed,
  :nr 165,
  :score 4,
  :user "Einar",
  :timestamp_ms 1661234009071}
 {:type :framed,
  :nr 165,
  :score 6,
  :user "Lars",
  :timestamp_ms 1661229942655}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 164,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1661152739753}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 164,
  :score 0,
  :user "Even",
  :timestamp_ms 1661146069053}
 {:type :framed,
  :nr 164,
  :score 4,
  :user "Lars",
  :timestamp_ms 1661142432064}
 {:type :framed,
  :nr 164,
  :score 3,
  :user "Einar",
  :timestamp_ms 1661142070818}
 {:type :framed,
  :nr 164,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661119743909}
 {:type :framed,
  :nr 163,
  :score 2,
  :user "Even",
  :timestamp_ms 1661061597581}
 {:type :framed,
  :nr 163,
  :score 2,
  :user "Lars",
  :timestamp_ms 1661054829776}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 163,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1661033458508}
 {:type :framed,
  :nr 163,
  :score 2,
  :user "Einar",
  :timestamp_ms 1661033038770}
 {:type :framed,
  :nr 163,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1661032937651}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 162,
  :score 0,
  :user "Even",
  :timestamp_ms 1660976083065}
 {:type :framed,
  :nr 162,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1660948950447}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 162,
  :score 3,
  :user "Lars",
  :timestamp_ms 1660947265945}
 {:type :framed,
  :nr 162,
  :score 3,
  :user "Einar",
  :timestamp_ms 1660947240263}
 {:type :framed,
  :nr 162,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1660947142649}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 161,
  :score 2,
  :user "Even",
  :timestamp_ms 1660885674868}
 {:type :framed,
  :nr 161,
  :score 3,
  :user "Einar",
  :timestamp_ms 1660885016172}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 161,
  :score 6,
  :user "Lars",
  :timestamp_ms 1660863268682}
 {:type :framed,
  :nr 161,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1660863177512}
 {:type :framed,
  :nr 161,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1660862856936}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 160,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1660847802380}
 {:type :framed,
  :nr 160,
  :score 0,
  :user "Even",
  :timestamp_ms 1660813673034}
 {:type :framed,
  :nr 160,
  :score 3,
  :user "Einar",
  :timestamp_ms 1660796302930}
 {:type :framed,
  :nr 160,
  :score 0,
  :user "Lars",
  :timestamp_ms 1660774327643}
 {:type :framed,
  :nr 160,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1660774271882}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 159,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1660734035201}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 159,
  :score 2,
  :user "Even",
  :timestamp_ms 1660727122633}
 {:type :framed,
  :nr 159,
  :score 6,
  :user "Lars",
  :timestamp_ms 1660726544897}
 {:type :framed,
  :nr 159,
  :score 3,
  :user "Einar",
  :timestamp_ms 1660726177546}
 {:type :framed,
  :nr 158,
  :score 0,
  :user "Even",
  :timestamp_ms 1660632639305}
 {:type :framed,
  :nr 158,
  :score 5,
  :user "Einar",
  :timestamp_ms 1660631576773}
 {:type :framed,
  :nr 158,
  :score 6,
  :user "Lars",
  :timestamp_ms 1660631539521}
 {:type :framed,
  :nr 158,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1660631259887}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 157,
  :score 0,
  :user "Even",
  :timestamp_ms 1660541844003}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 157,
  :score 0,
  :user "Lars",
  :timestamp_ms 1660540740139}
 {:type :framed,
  :nr 157,
  :score 3,
  :user "Einar",
  :timestamp_ms 1660533996410}
 {:type :framed,
  :nr 157,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1660520013992}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 156,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1660488799366}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 156,
  :score 2,
  :user "Even",
  :timestamp_ms 1660459462184}
 {:type :framed,
  :nr 156,
  :score 3,
  :user "Lars",
  :timestamp_ms 1660430132399}
 {:type :framed,
  :nr 156,
  :score 2,
  :user "Einar",
  :timestamp_ms 1660429483762}
 {:type :framed,
  :nr 156,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1660429301996}
 {:type :framed,
  :nr 155,
  :score 0,
  :user "Lars",
  :timestamp_ms 1660373120551}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 155,
  :score 0,
  :user "Einar",
  :timestamp_ms 1660345044787}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 155,
  :score 0,
  :user "Even",
  :timestamp_ms 1660344963911}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 155,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1660344552519}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 155,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1660344538908}
 {:type :framed,
  :nr 154,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1660289220420}
 {:type :framed,
  :nr 154,
  :score 3,
  :user "Lars",
  :timestamp_ms 1660285124520}
 {:type :framed,
  :nr 154,
  :score 4,
  :user "Einar",
  :timestamp_ms 1660278283155}
 {:type :framed,
  :nr 154,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1660258359616}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 153,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1660205769086}
 {:type :framed,
  :nr 153,
  :score 5,
  :user "Lars",
  :timestamp_ms 1660204097280}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 153,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1660203210391}
 {:type :framed,
  :nr 153,
  :score 4,
  :user "Even",
  :timestamp_ms 1660197252281}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 153,
  :score 4,
  :user "Einar",
  :timestamp_ms 1660196568353}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 152,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1660122126157}
 {:type :framed,
  :nr 152,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1660117217851}
 {:type :framed,
  :nr 152,
  :score 6,
  :user "Lars",
  :timestamp_ms 1660113227944}
 {:type :framed,
  :nr 152,
  :score 2,
  :user "Even",
  :timestamp_ms 1660111147237}
 {:type :framed,
  :nr 152,
  :score 5,
  :user "Einar",
  :timestamp_ms 1660101872234}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 151,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1660032518682}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 151,
  :score 6,
  :user "Even",
  :timestamp_ms 1660029769810}
 {:type :framed,
  :nr 151,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1660029277057}
 {:type :framed,
  :nr 151,
  :score 6,
  :user "Lars",
  :timestamp_ms 1660026164385}
 {:type :framed,
  :nr 151,
  :score 5,
  :user "Einar",
  :timestamp_ms 1660016074427}
 {:type :framed,
  :nr 150,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1659953161576}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 150,
  :score 2,
  :user "Even",
  :timestamp_ms 1659936591309}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 150,
  :score 6,
  :user "Einar",
  :timestamp_ms 1659932725498}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 150,
  :score 2,
  :user "Lars",
  :timestamp_ms 1659911264478}
 {:type :framed,
  :nr 150,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1659911082299}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 149,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1659834903182}
 {:type :framed,
  :nr 149,
  :score 3,
  :user "Einar",
  :timestamp_ms 1659830313804}
 {:type :framed,
  :nr 149,
  :score 3,
  :user "Even",
  :timestamp_ms 1659828212025}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 149,
  :score 0,
  :user "Lars",
  :timestamp_ms 1659827935606}
 {:type :framed,
  :nr 149,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1659827884016}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 148,
  :score 6,
  :user "Lars",
  :timestamp_ms 1659739169033}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 148,
  :score 3,
  :user "Lars",
  :timestamp_ms 1659739149192}
 {:type :framed,
  :nr 148,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1659738999691}
 {:type :framed,
  :nr 148,
  :score 3,
  :user "Even",
  :timestamp_ms 1659738805186}
 {:type :framed,
  :nr 148,
  :score 3,
  :user "Einar",
  :timestamp_ms 1659738406958}
 {:type :framed,
  :nr 148,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1659738248615}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 147,
  :score 2,
  :user "Lars",
  :timestamp_ms 1659690093253}
 {:type :framed,
  :nr 147,
  :score 2,
  :user "Even",
  :timestamp_ms 1659687447784}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 147,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1659687116683}
 {:type :framed,
  :nr 147,
  :score 2,
  :user "Einar",
  :timestamp_ms 1659678269271}
 {:type :framed,
  :nr 146,
  :score 0,
  :user "Even",
  :timestamp_ms 1659592694063}
 {:type :framed,
  :nr 146,
  :score 2,
  :user "Einar",
  :timestamp_ms 1659592310224}
 {:type :framed,
  :nr 146,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1659568467101}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 145,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1659514820026}
 {:type :framed,
  :nr 145,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1659514692968}
 {:type :framed,
  :nr 145,
  :score 2,
  :user "Even",
  :timestamp_ms 1659514663030}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 144,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1659450845844}
 {:type :framed,
  :nr 144,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1659432142714}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 144,
  :score 2,
  :user "Even",
  :timestamp_ms 1659429164929}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 143,
  :score 1,
  :user "Even",
  :timestamp_ms 1659338902063}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 143,
  :score 1,
  :user "Lars",
  :timestamp_ms 1659306604845}
 {:type :framed,
  :nr 143,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1659306560443}
 {:type :framed,
  :nr 143,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1659306124481}
 {:type :framed,
  :nr 142,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1659273515675}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 142,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1659269510052}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 142,
  :score 6,
  :user "Lars",
  :timestamp_ms 1659255024015}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 142,
  :score 0,
  :user "Even",
  :timestamp_ms 1659251472573}
 {:type :framed,
  :nr 141,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1659203381846}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 141,
  :score 3,
  :user "Lars",
  :timestamp_ms 1659173946526}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 141,
  :score 3,
  :user "Even",
  :timestamp_ms 1659163789743}
 {:type :framed,
  :nr 141,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1659147534318}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 140,
  :score 1,
  :user "Even",
  :timestamp_ms 1659094749715}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 140,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1659094507984}
 {:type :framed,
  :nr 140,
  :score 1,
  :user "Lars",
  :timestamp_ms 1659094471730}
 {:type :framed,
  :nr 140,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1659094125723}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 139,
  :score 1,
  :user "Even",
  :timestamp_ms 1658989868447}
 {:type :framed,
  :nr 139,
  :score 1,
  :user "Lars",
  :timestamp_ms 1658987783176}
 {:type :framed,
  :nr 139,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1658967688672}
 {:type :framed,
  :nr 139,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1658967529539}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 138,
  :score 2,
  :user "Even",
  :timestamp_ms 1658920883987}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 138,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1658918698363}
 {:type :framed,
  :nr 138,
  :score 6,
  :user "Lars",
  :timestamp_ms 1658918579567}
 {:type :framed,
  :nr 138,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1658918291175}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 137,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1658834549084}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 137,
  :score 3,
  :user "Even",
  :timestamp_ms 1658814169391}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 137,
  :score 6,
  :user "Lars",
  :timestamp_ms 1658789230624}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 137,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1658788715509}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 136,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1658763689614}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 136,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1658763025580}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 136,
  :score 0,
  :user "Even",
  :timestamp_ms 1658731459770}
 {:type :framed,
  :nr 136,
  :score 3,
  :user "Lars",
  :timestamp_ms 1658700495043}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 135,
  :score 6,
  :user "Lars",
  :timestamp_ms 1658699841517}
 {:type :framed,
  :nr 135,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1658699645689}
 {:type :framed,
  :nr 134,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1658594987010}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 134,
  :score 3,
  :user "Lars",
  :timestamp_ms 1658559146084}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 134,
  :score 2,
  :user "Even",
  :timestamp_ms 1658558582715}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 133,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1658500045428}
 {:type :framed,
  :nr 133,
  :score 3,
  :user "Lars",
  :timestamp_ms 1658486686163}
 {:type :framed,
  :nr 133,
  :score 0,
  :user "Even",
  :timestamp_ms 1658484734249}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 132,
  :score 2,
  :user "Even",
  :timestamp_ms 1658425877099}
 {:type :framed,
  :nr 132,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1658425320618}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 132,
  :score 2,
  :user "Lars",
  :timestamp_ms 1658391948301}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 131,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1658338332861}
 {:type :framed,
  :nr 131,
  :score 1,
  :user "Lars",
  :timestamp_ms 1658290367792}
 {:type :framed,
  :nr 131,
  :score 1,
  :user "Even",
  :timestamp_ms 1658284902645}
 {:type :framed,
  :nr 130,
  :score 1,
  :user "Lars",
  :timestamp_ms 1658219416278}
 {:type :framed,
  :nr 130,
  :score 0,
  :user "Even",
  :timestamp_ms 1658219119894}
 {:type :framed,
  :nr 130,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1658219044500}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 129,
  :score 3,
  :user "Even",
  :timestamp_ms 1658146283260}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 129,
  :score 1,
  :user "Lars",
  :timestamp_ms 1658144951588}
 {:type :framed,
  :nr 129,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1658136897669}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 128,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1658055183472}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 128,
  :score 6,
  :user "Lars",
  :timestamp_ms 1658053715049}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 128,
  :score 3,
  :user "Even",
  :timestamp_ms 1658047516192}
 {:type :framed,
  :nr 127,
  :score 2,
  :user "Even",
  :timestamp_ms 1657965196425}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 127,
  :score 4,
  :user "Lars",
  :timestamp_ms 1657964029427}
 {:type :framed,
  :nr 127,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1657963780876}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 126,
  :score 1,
  :user "Lars",
  :timestamp_ms 1657907066309}
 {:type :framed,
  :nr 126,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1657899608167}
 {:type :framed,
  :nr 126,
  :score 1,
  :user "Even",
  :timestamp_ms 1657875184508}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 125,
  :score 3,
  :user "Even",
  :timestamp_ms 1657794530023}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 125,
  :score 6,
  :user "Lars",
  :timestamp_ms 1657790023665}
 {:type :framed,
  :nr 125,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1657789779651}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 124,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1657719513209}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 124,
  :score 6,
  :user "Lars",
  :timestamp_ms 1657719305318}
 {:type :framed,
  :nr 124,
  :score 0,
  :user "Even",
  :timestamp_ms 1657716661266}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 123,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1657612554560}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 123,
  :score 0,
  :user "Even",
  :timestamp_ms 1657608588489}
 {:type :framed,
  :nr 123,
  :score 0,
  :user "Lars",
  :timestamp_ms 1657584220142}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 122,
  :score 0,
  :user "Even",
  :timestamp_ms 1657522781455}
 {:type :framed,
  :nr 122,
  :score 0,
  :user "Lars",
  :timestamp_ms 1657522409937}
 {:type :framed,
  :nr 122,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1657492716087}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 121,
  :score 6,
  :user "Lars",
  :timestamp_ms 1657455610493}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 121,
  :score 3,
  :user "Even",
  :timestamp_ms 1657452094752}
 {:type :framed,
  :nr 121,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1657451372652}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 119,
  :score 1,
  :user "Even",
  :timestamp_ms 1657271659652}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 119,
  :score 3,
  :user "Lars",
  :timestamp_ms 1657271476824}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 119,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1657270075916}
 {:type :framed,
  :nr 118,
  :score 2,
  :user "Lars",
  :timestamp_ms 1657183188163}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 118,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1657182553058}]
)
