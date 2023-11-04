(ns framed.messages)

(def messages 
[{:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 602,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1699008687211}
 {:type :framed,
  :nr 602,
  :score 6,
  :user "Lars",
  :timestamp_ms 1699008286919}
 {:type :framed,
  :nr 602,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1699000403495}
 {:type :framed,
  :nr 602,
  :score 3,
  :user "Einar",
  :timestamp_ms 1698989927490}
 {:type :framed,
  :nr 602,
  :score 2,
  :user "Even",
  :timestamp_ms 1698988871592}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
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
 {:type :framed,
  :nr 601,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1698928442377}
 {:type :framed,
  :nr 601,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698917384441}
 {:type :framed,
  :nr 601,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1698917272715}
 {:type :framed,
  :nr 601,
  :score 2,
  :user "Even",
  :timestamp_ms 1698906834647}
 {:type :framed,
  :nr 601,
  :score 2,
  :user "Einar",
  :timestamp_ms 1698901087739}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 600,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1698838913737}
 {:type :framed,
  :nr 600,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698831992292}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 600,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1698830003825}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 600,
  :score 1,
  :user "Even",
  :timestamp_ms 1698817061699}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 600,
  :score 1,
  :user "Einar",
  :timestamp_ms 1698816725979}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 599,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1698752127327}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 61,
  :score 10,
  :user "Lars",
  :timestamp_ms 1698737817869}
 {:type :framed,
  :nr 599,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698737554584}
 {:type :framed,
  :nr 599,
  :score 6,
  :user "Even",
  :timestamp_ms 1698733540907}
 {:type :framed,
  :nr 599,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698730182902}
 {:type :framed,
  :nr 599,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1698707233312}
 {:type :framed,
  :nr 598,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698697356418}
 {:type :episode,
  :nr 61,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1698656840573}
 {:type :episode,
  :nr 61,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1698653661798}
 {:type :episode,
  :nr 61,
  :score 1,
  :user "Even",
  :timestamp_ms 1698646592254}
 {:type :episode,
  :nr 61,
  :score 7,
  :user "Einar",
  :timestamp_ms 1698646244491}
 {:type :framed,
  :nr 598,
  :score 0,
  :user "Einar",
  :timestamp_ms 1698646134062}
 {:type :framed,
  :nr 598,
  :score 0,
  :user "Even",
  :timestamp_ms 1698644931028}
 {:type :framed,
  :nr 598,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1698623251545}
 {:type :framed,
  :nr 598,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1698620555003}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 597,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1698578291805}
 {:type :framed,
  :nr 597,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698572682282}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 597,
  :score 2,
  :user "Einar",
  :timestamp_ms 1698562240864}
 {:type :framed,
  :nr 597,
  :score 2,
  :user "Even",
  :timestamp_ms 1698560089029}
 {:type :framed,
  :nr 597,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1698534257905}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 596,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1698491881688}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 596,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698484580224}
 {:type :framed,
  :nr 596,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1698482649373}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 596,
  :score 3,
  :user "Even",
  :timestamp_ms 1698472503268}
 {:type :framed,
  :nr 596,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698470247509}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 595,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1698404305723}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 595,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1698391863828}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 595,
  :score 5,
  :user "Lars",
  :timestamp_ms 1698391334868}
 {:type :framed,
  :nr 595,
  :score 1,
  :user "Even",
  :timestamp_ms 1698384837510}
 {:type :framed,
  :nr 595,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698382767958}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 594,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1698309187220}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 594,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1698304051998}
 {:type :framed,
  :nr 594,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698302035057}
 {:type :framed,
  :nr 594,
  :score 4,
  :user "Even",
  :timestamp_ms 1698297393249}
 {:type :framed,
  :nr 594,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698296630366}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 593,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1698229130951}
 {:type :framed,
  :nr 593,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1698213715722}
 {:type :framed,
  :nr 593,
  :score 4,
  :user "Even",
  :timestamp_ms 1698212675920}
 {:type :framed,
  :nr 593,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698212209331}
 {:type :framed,
  :nr 593,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698211996970}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 592,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698132708181}
 {:type :framed,
  :nr 592,
  :score 2,
  :user "Einar",
  :timestamp_ms 1698124983222}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 592,
  :score 4,
  :user "Even",
  :timestamp_ms 1698124887385}
 {:type :framed,
  :nr 592,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1698101010817}
 {:type :framed,
  :nr 592,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1698098881871}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :framed,
  :nr 591,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1698050693056}
 {:type :episode,
  :nr 60,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1698050686486}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 591,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1698049684333}
 {:type :episode,
  :nr 60,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1698049643880}
 {:type :episode,
  :nr 60,
  :score 1,
  :user "Even",
  :timestamp_ms 1698039575268}
 {:type :episode,
  :nr 60,
  :score 0,
  :user "Lars",
  :timestamp_ms 1698039553577}
 {:type :framed,
  :nr 591,
  :score 3,
  :user "Even",
  :timestamp_ms 1698039279180}
 {:type :framed,
  :nr 591,
  :score 6,
  :user "Lars",
  :timestamp_ms 1698039261683}
 {:type :episode,
  :nr 60,
  :score 4,
  :user "Einar",
  :timestamp_ms 1698033847982}
 {:type :framed,
  :nr 591,
  :score 6,
  :user "Einar",
  :timestamp_ms 1698033686157}
 {:type :framed,
  :nr 590,
  :score 0,
  :user "Lars",
  :timestamp_ms 1698001055759}
 {:type :framed,
  :nr 590,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1697928750267}
 {:type :framed,
  :nr 590,
  :score 0,
  :user "Even",
  :timestamp_ms 1697927198844}
 {:type :framed,
  :nr 590,
  :score 2,
  :user "Einar",
  :timestamp_ms 1697926934028}
 {:type :framed,
  :nr 590,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1697925993198}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 589,
  :score 1,
  :user "Lars",
  :timestamp_ms 1697891076471}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 589,
  :score 1,
  :user "Einar",
  :timestamp_ms 1697871294634}
 {:type :framed,
  :nr 589,
  :score 0,
  :user "Even",
  :timestamp_ms 1697867949499}
 {:type :framed,
  :nr 589,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1697840731783}
 {:type :framed,
  :nr 589,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1697840717479}
 {:type :framed,
  :nr 588,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1697838602125}
 {:type :framed,
  :nr 588,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697829478039}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 588,
  :score 1,
  :user "Einar",
  :timestamp_ms 1697780248437}
 {:type :framed,
  :nr 588,
  :score 1,
  :user "Even",
  :timestamp_ms 1697777602450}
 {:type :framed,
  :nr 588,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1697753598119}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 587,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1697710415934}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 587,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1697705546858}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 587,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697700741830}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 587,
  :score 6,
  :user "Even",
  :timestamp_ms 1697694411741}
 {:type :framed,
  :nr 587,
  :score 6,
  :user "Einar",
  :timestamp_ms 1697691537338}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 586,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1697623656167}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 586,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1697618288228}
 {:type :framed,
  :nr 586,
  :score 1,
  :user "Einar",
  :timestamp_ms 1697606157943}
 {:type :framed,
  :nr 586,
  :score 4,
  :user "Lars",
  :timestamp_ms 1697605826087}
 {:type :framed,
  :nr 586,
  :score 1,
  :user "Even",
  :timestamp_ms 1697605735169}
 {:type :framed,
  :nr 585,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697577776310}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 585,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1697541685291}
 {:type :framed,
  :nr 585,
  :score 5,
  :user "Even",
  :timestamp_ms 1697525037590}
 {:type :framed,
  :nr 585,
  :score 5,
  :user "Einar",
  :timestamp_ms 1697517710422}
 {:type :framed,
  :nr 585,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1697495402100}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 59,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1697467985681}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 584,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1697467934136}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 59,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1697441490498}
 {:type :framed,
  :nr 584,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1697441476643}
 {:type :episode,
  :nr 59,
  :score 10,
  :user "Lars",
  :timestamp_ms 1697437395901}
 {:type :framed,
  :nr 584,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697437279751}
 {:type :episode,
  :nr 59,
  :score 10,
  :user "Einar",
  :timestamp_ms 1697433287078}
 {:type :episode,
  :nr 59,
  :score 9,
  :user "Even",
  :timestamp_ms 1697433181255}
 {:type :framed,
  :nr 584,
  :score 1,
  :user "Einar",
  :timestamp_ms 1697433128562}
 {:type :framed,
  :nr 584,
  :score 2,
  :user "Even",
  :timestamp_ms 1697432587328}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 583,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1697371212131}
 {:type :framed,
  :nr 583,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1697359369296}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 583,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697358264908}
 {:type :framed,
  :nr 583,
  :score 6,
  :user "Einar",
  :timestamp_ms 1697351671158}
 {:type :framed,
  :nr 583,
  :score 2,
  :user "Even",
  :timestamp_ms 1697350413111}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 582,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1697314012338}
 {:type :framed,
  :nr 582,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1697313630919}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 582,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697272938863}
 {:type :framed,
  :nr 582,
  :score 6,
  :user "Einar",
  :timestamp_ms 1697261884879}
 {:type :framed,
  :nr 582,
  :score 2,
  :user "Even",
  :timestamp_ms 1697261007223}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 581,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1697190265671}
 {:type :framed,
  :nr 581,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1697184995356}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 581,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697184457779}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 581,
  :score 6,
  :user "Even",
  :timestamp_ms 1697183338849}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 581,
  :score 5,
  :user "Einar",
  :timestamp_ms 1697174677206}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 580,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1697107611698}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 580,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1697099824802}
 {:type :framed,
  :nr 580,
  :score 2,
  :user "Lars",
  :timestamp_ms 1697099723923}
 {:type :framed,
  :nr 580,
  :score 1,
  :user "Even",
  :timestamp_ms 1697090416835}
 {:type :framed,
  :nr 580,
  :score 2,
  :user "Einar",
  :timestamp_ms 1697082920103}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 579,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1697020459139}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 579,
  :score 6,
  :user "Lars",
  :timestamp_ms 1697020360838}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 579,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1697013923492}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 579,
  :score 2,
  :user "Even",
  :timestamp_ms 1697009088190}
 {:type :framed,
  :nr 579,
  :score 2,
  :user "Einar",
  :timestamp_ms 1696995430340}
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
  :nr 578,
  :score 1,
  :user "Even",
  :timestamp_ms 1696915743446}
 {:type :framed,
  :nr 578,
  :score 1,
  :user "Einar",
  :timestamp_ms 1696913665864}
 {:type :framed,
  :nr 578,
  :score 1,
  :user "Lars",
  :timestamp_ms 1696891938467}
 {:type :framed,
  :nr 578,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1696890307518}
 {:type :framed,
  :nr 578,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1696889800881}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 577,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1696846029656}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 58,
  :score 8,
  :user "Abdi",
  :timestamp_ms 1696845962496}
 {:type :episode,
  :nr 58,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1696839085169}
 {:type :framed,
  :nr 577,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1696838595745}
 {:type :episode,
  :nr 58,
  :score 5,
  :user "Even",
  :timestamp_ms 1696832372968}
 {:type :framed,
  :nr 577,
  :score 0,
  :user "Even",
  :timestamp_ms 1696832347746}
 {:type :episode,
  :nr 58,
  :score 9,
  :user "Lars",
  :timestamp_ms 1696829904528}
 {:type :framed,
  :nr 577,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696829588947}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 58,
  :score 10,
  :user "Einar",
  :timestamp_ms 1696825175260}
 {:type :framed,
  :nr 577,
  :score 6,
  :user "Einar",
  :timestamp_ms 1696825095255}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 576,
  :score 2,
  :user "Lars",
  :timestamp_ms 1696786527813}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 576,
  :score 0,
  :user "Even",
  :timestamp_ms 1696745618570}
 {:type :framed,
  :nr 576,
  :score 2,
  :user "Einar",
  :timestamp_ms 1696741501451}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 576,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1696719739707}
 {:type :framed,
  :nr 576,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1696716027817}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 575,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1696714580720}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 575,
  :score 1,
  :user "Lars",
  :timestamp_ms 1696662782978}
 {:type :framed,
  :nr 575,
  :score 0,
  :user "Einar",
  :timestamp_ms 1696659619324}
 {:type :framed,
  :nr 575,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1696656408511}
 {:type :framed,
  :nr 575,
  :score 0,
  :user "Even",
  :timestamp_ms 1696656067785}
 {:type :framed,
  :nr 574,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1696578196415}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 574,
  :score 5,
  :user "Lars",
  :timestamp_ms 1696575246518}
 {:type :framed,
  :nr 574,
  :score 2,
  :user "Even",
  :timestamp_ms 1696568997429}
 {:type :framed,
  :nr 574,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1696544251054}
 {:type :framed,
  :nr 574,
  :score 0,
  :user "Einar",
  :timestamp_ms 1696543411809}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 573,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696509798666}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 573,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1696502890572}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 573,
  :score 6,
  :user "Even",
  :timestamp_ms 1696499795193}
 {:type :framed,
  :nr 573,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1696499599892}
 {:type :framed,
  :nr 573,
  :score 3,
  :user "Einar",
  :timestamp_ms 1696484011793}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :framed,
  :nr 572,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1696422960819}
 {:type :framed,
  :nr 572,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696400301825}
 {:type :framed,
  :nr 572,
  :score 0,
  :user "Einar",
  :timestamp_ms 1696398629833}
 {:type :framed,
  :nr 572,
  :score 0,
  :user "Even",
  :timestamp_ms 1696395235795}
 {:type :framed,
  :nr 572,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1696372362071}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 57,
  :score 10,
  :user "Lars",
  :timestamp_ms 1696315930440}
 {:type :framed,
  :nr 571,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696315772556}
 {:type :framed,
  :nr 571,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1696315686687}
 {:type :framed,
  :nr 571,
  :score 0,
  :user "Even",
  :timestamp_ms 1696315372943}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 571,
  :score 0,
  :user "Einar",
  :timestamp_ms 1696311009854}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 571,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1696284365443}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 57,
  :score 10,
  :user "Abdi",
  :timestamp_ms 1696253654300}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 570,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1696252957856}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 57,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1696232978278}
 {:type :episode,
  :nr 57,
  :score 2,
  :user "Einar",
  :timestamp_ms 1696225930780}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 570,
  :score 6,
  :user "Einar",
  :timestamp_ms 1696225838980}
 {:type :episode,
  :nr 57,
  :score 1,
  :user "Even",
  :timestamp_ms 1696224158158}
 {:type :framed,
  :nr 570,
  :score 2,
  :user "Even",
  :timestamp_ms 1696223855633}
 {:type :framed,
  :nr 570,
  :score 1,
  :user "Lars",
  :timestamp_ms 1696218819477}
 {:type :framed,
  :nr 570,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1696199365165}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 569,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696179750612}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 569,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1696179477085}
 {:type :framed,
  :nr 569,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1696178556182}
 {:type :framed,
  :nr 569,
  :score 5,
  :user "Einar",
  :timestamp_ms 1696139739526}
 {:type :framed,
  :nr 569,
  :score 5,
  :user "Even",
  :timestamp_ms 1696139673347}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 568,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1696109414151}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 568,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1696108853852}
 {:type :framed,
  :nr 568,
  :score 6,
  :user "Lars",
  :timestamp_ms 1696055014496}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 567,
  :score 1,
  :user "Lars",
  :timestamp_ms 1696054902279}
 {:type :framed,
  :nr 568,
  :score 4,
  :user "Even",
  :timestamp_ms 1696054160112}
 {:type :framed,
  :nr 568,
  :score 6,
  :user "Einar",
  :timestamp_ms 1696036171652}
 {:type :framed,
  :nr 567,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1695972632531}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 567,
  :score 1,
  :user "Even",
  :timestamp_ms 1695964547945}
 {:type :framed,
  :nr 567,
  :score 0,
  :user "Einar",
  :timestamp_ms 1695963021202}
 {:type :framed,
  :nr 567,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1695939458389}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 566,
  :score 1,
  :user "Lars",
  :timestamp_ms 1695925153699}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 566,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1695882401703}
 {:type :framed,
  :nr 566,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1695880744992}
 {:type :framed,
  :nr 566,
  :score 0,
  :user "Einar",
  :timestamp_ms 1695876580481}
 {:type :framed,
  :nr 566,
  :score 0,
  :user "Even",
  :timestamp_ms 1695873884832}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 565,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1695811251729}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 565,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1695800607536}
 {:type :framed,
  :nr 565,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695792670484}
 {:type :framed,
  :nr 565,
  :score 1,
  :user "Even",
  :timestamp_ms 1695791378668}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 565,
  :score 6,
  :user "Einar",
  :timestamp_ms 1695790967482}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 564,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695762273021}
 {:type :framed,
  :nr 564,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1695723309936}
 {:type :framed,
  :nr 564,
  :score 2,
  :user "Even",
  :timestamp_ms 1695721957540}
 {:type :framed,
  :nr 564,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1695721772295}
 {:type :framed,
  :nr 564,
  :score 3,
  :user "Einar",
  :timestamp_ms 1695719427444}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 56,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1695656690109}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 563,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1695656586968}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 56,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1695642543479}
 {:type :framed,
  :nr 563,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1695642537697}
 {:type :episode,
  :nr 56,
  :score 9,
  :user "Even",
  :timestamp_ms 1695626835600}
 {:type :episode,
  :nr 56,
  :score 10,
  :user "Lars",
  :timestamp_ms 1695621067681}
 {:type :episode,
  :nr 56,
  :score 9,
  :user "Einar",
  :timestamp_ms 1695620778239}
 {:type :framed,
  :nr 563,
  :score 4,
  :user "Einar",
  :timestamp_ms 1695620610321}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 563,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695620441131}
 {:type :framed,
  :nr 563,
  :score 5,
  :user "Even",
  :timestamp_ms 1695618222626}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 562,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1695544166554}
 {:type :framed,
  :nr 562,
  :score 6,
  :user "Einar",
  :timestamp_ms 1695533502957}
 {:type :framed,
  :nr 562,
  :score 6,
  :user "Even",
  :timestamp_ms 1695532656540}
 {:type :framed,
  :nr 562,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695510913178}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 562,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1695510542555}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 561,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1695464295483}
 {:type :framed,
  :nr 561,
  :score 2,
  :user "Even",
  :timestamp_ms 1695463199323}
 {:type :framed,
  :nr 561,
  :score 3,
  :user "Einar",
  :timestamp_ms 1695462532813}
 {:type :framed,
  :nr 561,
  :score 3,
  :user "Lars",
  :timestamp_ms 1695454711484}
 {:type :framed,
  :nr 561,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1695454170156}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 560,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1695371343401}
 {:type :framed,
  :nr 560,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1695371310476}
 {:type :framed,
  :nr 560,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695364921297}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 560,
  :score 1,
  :user "Even",
  :timestamp_ms 1695360025406}
 {:type :framed,
  :nr 560,
  :score 1,
  :user "Einar",
  :timestamp_ms 1695359326426}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 559,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695286823752}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 559,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1695286556149}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 559,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1695279407368}
 {:type :framed,
  :nr 559,
  :score 6,
  :user "Einar",
  :timestamp_ms 1695272265196}
 {:type :framed,
  :nr 559,
  :score 3,
  :user "Even",
  :timestamp_ms 1695271927509}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 558,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1695199086956}
 {:type :framed,
  :nr 558,
  :score 2,
  :user "Lars",
  :timestamp_ms 1695186838071}
 {:type :framed,
  :nr 558,
  :score 2,
  :user "Even",
  :timestamp_ms 1695186386950}
 {:type :framed,
  :nr 558,
  :score 0,
  :user "Einar",
  :timestamp_ms 1695186100147}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 558,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1695160965633}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 557,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1695154441602}
 {:type :framed,
  :nr 557,
  :score 6,
  :user "Lars",
  :timestamp_ms 1695118538229}
 {:type :framed,
  :nr 557,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1695116735020}
 {:type :framed,
  :nr 557,
  :score 1,
  :user "Einar",
  :timestamp_ms 1695099675543}
 {:type :framed,
  :nr 557,
  :score 1,
  :user "Even",
  :timestamp_ms 1695099580010}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 556,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1695021482373}
 {:type :episode,
  :nr 55,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1695021478336}
 {:type :episode,
  :nr 55,
  :score 0,
  :user "Lars",
  :timestamp_ms 1695015078057}
 {:type :episode,
  :nr 55,
  :score 0,
  :user "Einar",
  :timestamp_ms 1695014549001}
 {:type :framed,
  :nr 556,
  :score 1,
  :user "Einar",
  :timestamp_ms 1695014480467}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 556,
  :score 0,
  :user "Even",
  :timestamp_ms 1695013581369}
 {:type :episode,
  :nr 55,
  :score 0,
  :user "Even",
  :timestamp_ms 1695013443628}
 {:type :episode,
  :nr 55,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1694989956016}
 {:type :framed,
  :nr 556,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694989945829}
 {:type :framed,
  :nr 556,
  :score 1,
  :user "Lars",
  :timestamp_ms 1694989207008}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 555,
  :score 3,
  :user "Even",
  :timestamp_ms 1694938858508}
 {:type :framed,
  :nr 555,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694935877107}
 {:type :framed,
  :nr 555,
  :score 1,
  :user "Einar",
  :timestamp_ms 1694929529968}
 {:type :framed,
  :nr 555,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1694903482043}
 {:type :framed,
  :nr 555,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694903305649}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 554,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1694858088622}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 554,
  :score 3,
  :user "Einar",
  :timestamp_ms 1694816624766}
 {:type :framed,
  :nr 554,
  :score 2,
  :user "Even",
  :timestamp_ms 1694816113907}
 {:type :framed,
  :nr 554,
  :score 1,
  :user "Lars",
  :timestamp_ms 1694816016949}
 {:type :framed,
  :nr 554,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1694815550443}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 553,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1694765950843}
 {:type :framed,
  :nr 553,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694765788214}
 {:type :framed,
  :nr 553,
  :score 4,
  :user "Even",
  :timestamp_ms 1694755116941}
 {:type :framed,
  :nr 553,
  :score 2,
  :user "Einar",
  :timestamp_ms 1694753821150}
 {:type :framed,
  :nr 553,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694728988364}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 552,
  :score 6,
  :user "Even",
  :timestamp_ms 1694683288729}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 552,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1694681458843}
 {:type :framed,
  :nr 552,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1694679485945}
 {:type :framed,
  :nr 552,
  :score 6,
  :user "Einar",
  :timestamp_ms 1694667130008}
 {:type :framed,
  :nr 552,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694643511012}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 551,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694594464370}
 {:type :framed,
  :nr 551,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1694591198093}
 {:type :framed,
  :nr 551,
  :score 3,
  :user "Lars",
  :timestamp_ms 1694583807353}
 {:type :framed,
  :nr 551,
  :score 0,
  :user "Even",
  :timestamp_ms 1694581215736}
 {:type :framed,
  :nr 551,
  :score 1,
  :user "Einar",
  :timestamp_ms 1694580856575}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 550,
  :score 3,
  :user "Even",
  :timestamp_ms 1694495038408}
 {:type :framed,
  :nr 550,
  :score 6,
  :user "Einar",
  :timestamp_ms 1694491633137}
 {:type :framed,
  :nr 550,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1694473944524}
 {:type :framed,
  :nr 550,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694470410080}
 {:type :framed,
  :nr 550,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1694469823312}
 {:type :episode,
  :nr 54,
  :score 10,
  :user "Lars",
  :timestamp_ms 1694453933206}
 {:type :episode,
  :nr 54,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1694435540217}
 {:type :framed,
  :nr 549,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1694435538202}
 {:type :episode,
  :nr 54,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694421864652}
 {:type :framed,
  :nr 549,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1694421860102}
 {:type :framed,
  :nr 549,
  :score 3,
  :user "Even",
  :timestamp_ms 1694412096120}
 {:type :framed,
  :nr 549,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694411049552}
 {:type :episode,
  :nr 54,
  :score 1,
  :user "Einar",
  :timestamp_ms 1694409089736}
 {:type :framed,
  :nr 549,
  :score 6,
  :user "Einar",
  :timestamp_ms 1694409040989}
 {:type :episode,
  :nr 54,
  :score 0,
  :user "Even",
  :timestamp_ms 1694408622837}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 548,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694345103331}
 {:type :framed,
  :nr 548,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1694343634868}
 {:type :framed,
  :nr 548,
  :score 1,
  :user "Einar",
  :timestamp_ms 1694328049766}
 {:type :framed,
  :nr 548,
  :score 1,
  :user "Lars",
  :timestamp_ms 1694327988313}
 {:type :framed,
  :nr 548,
  :score 1,
  :user "Even",
  :timestamp_ms 1694323347272}
 {:type :not-framed, :user "Lars"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 547,
  :score 5,
  :user "Lars",
  :timestamp_ms 1694253226024}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 547,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1694250135066}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 547,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1694247661908}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 547,
  :score 2,
  :user "Einar",
  :timestamp_ms 1694239778813}
 {:type :framed,
  :nr 547,
  :score 2,
  :user "Even",
  :timestamp_ms 1694237021790}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 546,
  :score 6,
  :user "Lars",
  :timestamp_ms 1694156612923}
 {:type :framed,
  :nr 546,
  :score 6,
  :user "Even",
  :timestamp_ms 1694151155164}
 {:type :framed,
  :nr 546,
  :score 6,
  :user "Einar",
  :timestamp_ms 1694148678741}
 {:type :framed,
  :nr 546,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1694126200649}
 {:type :framed,
  :nr 546,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1694124661917}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 545,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1694069169369}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 545,
  :score 0,
  :user "Lars",
  :timestamp_ms 1694067662268}
 {:type :framed,
  :nr 545,
  :score 0,
  :user "Einar",
  :timestamp_ms 1694060448589}
 {:type :framed,
  :nr 545,
  :score 0,
  :user "Even",
  :timestamp_ms 1694057547994}
 {:type :framed,
  :nr 545,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1694038154237}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 544,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1693988800335}
 {:type :framed,
  :nr 544,
  :score 0,
  :user "Einar",
  :timestamp_ms 1693974363917}
 {:type :framed,
  :nr 544,
  :score 0,
  :user "Even",
  :timestamp_ms 1693964818136}
 {:type :framed,
  :nr 544,
  :score 1,
  :user "Lars",
  :timestamp_ms 1693953485491}
 {:type :framed,
  :nr 544,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693951547328}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 543,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693934536870}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 543,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1693898301911}
 {:type :framed,
  :nr 543,
  :score 0,
  :user "Even",
  :timestamp_ms 1693890319354}
 {:type :framed,
  :nr 543,
  :score 6,
  :user "Einar",
  :timestamp_ms 1693886063000}
 {:type :framed,
  :nr 543,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693867787183}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 53,
  :score 0,
  :user "Even",
  :timestamp_ms 1693818215086}
 {:type :episode,
  :nr 53,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1693815948268}
 {:type :framed,
  :nr 542,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1693815944998}
 {:type :episode,
  :nr 53,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1693813068987}
 {:type :framed,
  :nr 542,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693813058137}
 {:type :framed,
  :nr 542,
  :score 2,
  :user "Even",
  :timestamp_ms 1693806294081}
 {:type :episode,
  :nr 53,
  :score 2,
  :user "Lars",
  :timestamp_ms 1693805764282}
 {:type :framed,
  :nr 542,
  :score 2,
  :user "Lars",
  :timestamp_ms 1693805638200}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 53,
  :score 6,
  :user "Einar",
  :timestamp_ms 1693803912395}
 {:type :framed,
  :nr 542,
  :score 0,
  :user "Einar",
  :timestamp_ms 1693803497840}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 541,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1693738004456}
 {:type :framed,
  :nr 541,
  :score 6,
  :user "Einar",
  :timestamp_ms 1693717615716}
 {:type :framed,
  :nr 541,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693694354336}
 {:type :framed,
  :nr 541,
  :score 6,
  :user "Even",
  :timestamp_ms 1693693771175}
 {:type :framed,
  :nr 541,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693692078599}
 {:type :framed,
  :nr 540,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1693679574566}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 540,
  :score 3,
  :user "Even",
  :timestamp_ms 1693675089118}
 {:type :framed,
  :nr 540,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1693669891847}
 {:type :framed,
  :nr 540,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693607421941}
 {:type :framed,
  :nr 540,
  :score 3,
  :user "Einar",
  :timestamp_ms 1693606607433}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 539,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693562565321}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 539,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693555704246}
 {:type :framed,
  :nr 539,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1693553639917}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 539,
  :score 0,
  :user "Even",
  :timestamp_ms 1693544788702}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 539,
  :score 6,
  :user "Einar",
  :timestamp_ms 1693543579224}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 538,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693514795336}
 {:type :framed,
  :nr 538,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1693471761056}
 {:type :framed,
  :nr 538,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1693460508742}
 {:type :framed,
  :nr 538,
  :score 3,
  :user "Einar",
  :timestamp_ms 1693454656220}
 {:type :framed,
  :nr 538,
  :score 0,
  :user "Even",
  :timestamp_ms 1693442965112}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 537,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693393087947}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 537,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693389872301}
 {:type :framed,
  :nr 537,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1693384318040}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 537,
  :score 6,
  :user "Even",
  :timestamp_ms 1693380772301}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 537,
  :score 6,
  :user "Einar",
  :timestamp_ms 1693369594503}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 536,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693300325069}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 536,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1693300171650}
 {:type :framed,
  :nr 536,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1693299760920}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 536,
  :score 1,
  :user "Einar",
  :timestamp_ms 1693285247514}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 536,
  :score 4,
  :user "Even",
  :timestamp_ms 1693284860073}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 52,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1693213069607}
 {:type :framed,
  :nr 535,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1693213048933}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :episode,
  :nr 52,
  :score 1,
  :user "Even",
  :timestamp_ms 1693205348734}
 {:type :episode,
  :nr 52,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1693205216665}
 {:type :framed,
  :nr 535,
  :score 3,
  :user "Even",
  :timestamp_ms 1693201472332}
 {:type :episode,
  :nr 52,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693201118044}
 {:type :framed,
  :nr 535,
  :score 3,
  :user "Lars",
  :timestamp_ms 1693200938435}
 {:type :framed,
  :nr 535,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1693200860409}
 {:type :episode,
  :nr 52,
  :score 5,
  :user "Einar",
  :timestamp_ms 1693195086447}
 {:type :framed,
  :nr 535,
  :score 2,
  :user "Einar",
  :timestamp_ms 1693194887484}
 {:type :framed,
  :nr 534,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1693140082542}
 {:type :framed,
  :nr 534,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1693133149376}
 {:type :framed,
  :nr 534,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693132679120}
 {:type :framed,
  :nr 534,
  :score 3,
  :user "Even",
  :timestamp_ms 1693118026061}
 {:type :framed,
  :nr 534,
  :score 5,
  :user "Einar",
  :timestamp_ms 1693115165083}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 533,
  :score 6,
  :user "Lars",
  :timestamp_ms 1693076545674}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 533,
  :score 2,
  :user "Even",
  :timestamp_ms 1693030682707}
 {:type :framed,
  :nr 533,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1693003950455}
 {:type :framed,
  :nr 533,
  :score 0,
  :user "Einar",
  :timestamp_ms 1693001388049}
 {:type :framed,
  :nr 533,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1693001213926}
 {:type :framed,
  :nr 532,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1692968393151}
 {:type :framed,
  :nr 532,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1692956047697}
 {:type :framed,
  :nr 532,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692946016456}
 {:type :framed,
  :nr 532,
  :score 2,
  :user "Even",
  :timestamp_ms 1692941202183}
 {:type :framed,
  :nr 532,
  :score 2,
  :user "Einar",
  :timestamp_ms 1692938960989}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 531,
  :score 1,
  :user "Lars",
  :timestamp_ms 1692864635117}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 531,
  :score 0,
  :user "Even",
  :timestamp_ms 1692855351893}
 {:type :framed,
  :nr 531,
  :score 0,
  :user "Einar",
  :timestamp_ms 1692849453106}
 {:type :framed,
  :nr 531,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692828421639}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 531,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1692828133828}
 {:type :framed,
  :nr 530,
  :score 0,
  :user "Even",
  :timestamp_ms 1692768932923}
 {:type :framed,
  :nr 530,
  :score 1,
  :user "Einar",
  :timestamp_ms 1692766168401}
 {:type :framed,
  :nr 530,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1692742260140}
 {:type :framed,
  :nr 530,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692741863685}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 529,
  :score 0,
  :user "Lars",
  :timestamp_ms 1692701051746}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 529,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692684393688}
 {:type :framed,
  :nr 529,
  :score 1,
  :user "Even",
  :timestamp_ms 1692680764104}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 529,
  :score 0,
  :user "Einar",
  :timestamp_ms 1692676667318}
 {:type :framed,
  :nr 529,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1692655610738}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 51,
  :score 10,
  :user "Lars",
  :timestamp_ms 1692647482393}
 {:type :framed,
  :nr 528,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692647231571}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 51,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1692602924583}
 {:type :framed,
  :nr 528,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1692602832615}
 {:type :framed,
  :nr 528,
  :score 1,
  :user "Even",
  :timestamp_ms 1692595320824}
 {:type :episode,
  :nr 51,
  :score 5,
  :user "Einar",
  :timestamp_ms 1692595174205}
 {:type :framed,
  :nr 528,
  :score 6,
  :user "Einar",
  :timestamp_ms 1692595057950}
 {:type :episode,
  :nr 51,
  :score 10,
  :user "Even",
  :timestamp_ms 1692594952371}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 51,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1692571384781}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 528,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1692569896028}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 527,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1692518695568}
 {:type :framed,
  :nr 527,
  :score 2,
  :user "Even",
  :timestamp_ms 1692514550002}
 {:type :framed,
  :nr 527,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1692488890967}
 {:type :framed,
  :nr 527,
  :score 3,
  :user "Lars",
  :timestamp_ms 1692483308429}
 {:type :framed,
  :nr 527,
  :score 1,
  :user "Einar",
  :timestamp_ms 1692483235576}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 526,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692448883115}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 526,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1692439297248}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 526,
  :score 2,
  :user "Even",
  :timestamp_ms 1692428828665}
 {:type :framed,
  :nr 526,
  :score 3,
  :user "Einar",
  :timestamp_ms 1692397037294}
 {:type :framed,
  :nr 526,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1692396862292}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 525,
  :score 1,
  :user "Lars",
  :timestamp_ms 1692348534607}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 525,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692340585372}
 {:type :framed,
  :nr 525,
  :score 0,
  :user "Even",
  :timestamp_ms 1692335553981}
 {:type :framed,
  :nr 525,
  :score 0,
  :user "Einar",
  :timestamp_ms 1692334855262}
 {:type :framed,
  :nr 525,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1692309762244}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 524,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1692275444186}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 524,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692262924111}
 {:type :framed,
  :nr 524,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1692257833729}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 524,
  :score 0,
  :user "Even",
  :timestamp_ms 1692248647347}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 524,
  :score 6,
  :user "Einar",
  :timestamp_ms 1692247765257}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 523,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692176329444}
 {:type :framed,
  :nr 523,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692165487244}
 {:type :framed,
  :nr 523,
  :score 2,
  :user "Einar",
  :timestamp_ms 1692164701692}
 {:type :framed,
  :nr 523,
  :score 0,
  :user "Even",
  :timestamp_ms 1692164124006}
 {:type :framed,
  :nr 523,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1692137973096}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 522,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1692084618379}
 {:type :framed,
  :nr 522,
  :score 4,
  :user "Einar",
  :timestamp_ms 1692077327374}
 {:type :framed,
  :nr 522,
  :score 3,
  :user "Even",
  :timestamp_ms 1692077081814}
 {:type :framed,
  :nr 522,
  :score 6,
  :user "Lars",
  :timestamp_ms 1692055260115}
 {:type :framed,
  :nr 522,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1692052615558}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 50,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1692001090166}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 521,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691996628771}
 {:type :episode,
  :nr 50,
  :score 0,
  :user "Lars",
  :timestamp_ms 1691992204095}
 {:type :framed,
  :nr 521,
  :score 1,
  :user "Lars",
  :timestamp_ms 1691992192554}
 {:type :episode,
  :nr 50,
  :score 0,
  :user "Einar",
  :timestamp_ms 1691988951459}
 {:type :framed,
  :nr 521,
  :score 0,
  :user "Einar",
  :timestamp_ms 1691988902730}
 {:type :episode,
  :nr 50,
  :score 0,
  :user "Even",
  :timestamp_ms 1691988872950}
 {:type :framed,
  :nr 521,
  :score 0,
  :user "Even",
  :timestamp_ms 1691988759420}
 {:type :episode,
  :nr 50,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1691965353161}
 {:type :framed,
  :nr 521,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1691965339644}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 520,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1691960603431}
 {:type :framed,
  :nr 520,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1691926490855}
 {:type :framed,
  :nr 520,
  :score 3,
  :user "Even",
  :timestamp_ms 1691918302420}
 {:type :framed,
  :nr 520,
  :score 6,
  :user "Lars",
  :timestamp_ms 1691917678720}
 {:type :framed,
  :nr 520,
  :score 5,
  :user "Einar",
  :timestamp_ms 1691903401823}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 519,
  :score 3,
  :user "Even",
  :timestamp_ms 1691842713876}
 {:type :framed,
  :nr 519,
  :score 5,
  :user "Einar",
  :timestamp_ms 1691841092159}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 519,
  :score 5,
  :user "Lars",
  :timestamp_ms 1691841034196}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 519,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1691840554774}
 {:type :framed,
  :nr 519,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1691840525129}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 518,
  :score 2,
  :user "Lars",
  :timestamp_ms 1691751183057}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 518,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1691744382621}
 {:type :framed,
  :nr 518,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1691742737814}
 {:type :framed,
  :nr 518,
  :score 1,
  :user "Einar",
  :timestamp_ms 1691731616180}
 {:type :framed,
  :nr 518,
  :score 0,
  :user "Even",
  :timestamp_ms 1691731492152}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 517,
  :score 2,
  :user "Even",
  :timestamp_ms 1691677285247}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 517,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691653892878}
 {:type :framed,
  :nr 517,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1691653786548}
 {:type :framed,
  :nr 517,
  :score 5,
  :user "Lars",
  :timestamp_ms 1691623524999}
 {:type :framed,
  :nr 517,
  :score 4,
  :user "Einar",
  :timestamp_ms 1691622948293}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 516,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1691533590901}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 516,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1691533302724}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 516,
  :score 5,
  :user "Lars",
  :timestamp_ms 1691533003024}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 516,
  :score 5,
  :user "Einar",
  :timestamp_ms 1691532785048}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 516,
  :score 5,
  :user "Even",
  :timestamp_ms 1691532637728}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 515,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1691483897599}
 {:type :framed,
  :nr 515,
  :score 0,
  :user "Einar",
  :timestamp_ms 1691472626900}
 {:type :framed,
  :nr 515,
  :score 1,
  :user "Even",
  :timestamp_ms 1691472573168}
 {:type :framed,
  :nr 515,
  :score 2,
  :user "Lars",
  :timestamp_ms 1691447964917}
 {:type :framed,
  :nr 515,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691447597799}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 49,
  :score 1,
  :user "Even",
  :timestamp_ms 1691390100021}
 {:type :framed,
  :nr 514,
  :score 2,
  :user "Even",
  :timestamp_ms 1691389851887}
 {:type :episode,
  :nr 49,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691364196243}
 {:type :episode,
  :nr 49,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1691360097009}
 {:type :episode,
  :nr 49,
  :score 4,
  :user "Lars",
  :timestamp_ms 1691359908416}
 {:type :framed,
  :nr 514,
  :score 2,
  :user "Lars",
  :timestamp_ms 1691359732429}
 {:type :framed,
  :nr 514,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1691359663639}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 49,
  :score 10,
  :user "Einar",
  :timestamp_ms 1691359602932}
 {:type :framed,
  :nr 514,
  :score 5,
  :user "Einar",
  :timestamp_ms 1691359459616}
 {:type :framed,
  :nr 514,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1691359438609}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 513,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1691318396583}
 {:type :framed,
  :nr 513,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1691317370995}
 {:type :framed,
  :nr 513,
  :score 5,
  :user "Even",
  :timestamp_ms 1691277278319}
 {:type :framed,
  :nr 513,
  :score 5,
  :user "Lars",
  :timestamp_ms 1691274888476}
 {:type :framed,
  :nr 513,
  :score 5,
  :user "Einar",
  :timestamp_ms 1691274739590}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 512,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691188681423}
 {:type :framed,
  :nr 512,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1691188040087}
 {:type :framed,
  :nr 512,
  :score 4,
  :user "Even",
  :timestamp_ms 1691187756797}
 {:type :framed,
  :nr 512,
  :score 2,
  :user "Lars",
  :timestamp_ms 1691187437179}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 512,
  :score 6,
  :user "Einar",
  :timestamp_ms 1691187392178}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 511,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1691135169345}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 511,
  :score 4,
  :user "Lars",
  :timestamp_ms 1691129368021}
 {:type :framed,
  :nr 511,
  :score 1,
  :user "Einar",
  :timestamp_ms 1691129173872}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 511,
  :score 0,
  :user "Even",
  :timestamp_ms 1691101172270}
 {:type :framed,
  :nr 511,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1691100738644}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 510,
  :score 6,
  :user "Lars",
  :timestamp_ms 1691058318092}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 510,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1691050689630}
 {:type :framed,
  :nr 510,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1691049004775}
 {:type :framed,
  :nr 510,
  :score 6,
  :user "Einar",
  :timestamp_ms 1691043305103}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 510,
  :score 6,
  :user "Even",
  :timestamp_ms 1691040386675}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 509,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1690962964626}
 {:type :framed,
  :nr 509,
  :score 6,
  :user "Even",
  :timestamp_ms 1690954382573}
 {:type :framed,
  :nr 509,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690952936151}
 {:type :framed,
  :nr 509,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690935764733}
 {:type :framed,
  :nr 509,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1690930037615}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 508,
  :score 0,
  :user "Even",
  :timestamp_ms 1690867085465}
 {:type :framed,
  :nr 508,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690867017502}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 508,
  :score 0,
  :user "Einar",
  :timestamp_ms 1690866712318}
 {:type :framed,
  :nr 508,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1690841441787}
 {:type :framed,
  :nr 508,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1690840831561}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 48,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1690803244675}
 {:type :episode,
  :nr 48,
  :score 4,
  :user "Lars",
  :timestamp_ms 1690796805475}
 {:type :framed,
  :nr 507,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690796794117}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 507,
  :score 6,
  :user "Even",
  :timestamp_ms 1690795900495}
 {:type :framed,
  :nr 507,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1690795859433}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 507,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1690790859367}
 {:type :episode,
  :nr 48,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1690789964153}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :episode,
  :nr 48,
  :score 0,
  :user "Even",
  :timestamp_ms 1690780510782}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 48,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690780381034}
 {:type :framed,
  :nr 507,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690780190746}
 {:type :framed,
  :nr 506,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690720746675}
 {:type :framed,
  :nr 506,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1690711515635}
 {:type :framed,
  :nr 506,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1690668983485}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 506,
  :score 3,
  :user "Even",
  :timestamp_ms 1690668619713}
 {:type :framed,
  :nr 506,
  :score 3,
  :user "Einar",
  :timestamp_ms 1690668170730}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 505,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690654722831}
 {:type :framed,
  :nr 505,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1690654468013}
 {:type :framed,
  :nr 505,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1690635819925}
 {:type :framed,
  :nr 505,
  :score 4,
  :user "Even",
  :timestamp_ms 1690609458935}
 {:type :framed,
  :nr 505,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690608240687}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 504,
  :score 1,
  :user "Lars",
  :timestamp_ms 1690575879526}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 504,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1690575796794}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 504,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690523022972}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 504,
  :score 2,
  :user "Even",
  :timestamp_ms 1690497392494}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 504,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1690495276138}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 503,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1690474251239}
 {:type :framed,
  :nr 503,
  :score 5,
  :user "Lars",
  :timestamp_ms 1690472653701}
 {:type :framed,
  :nr 503,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1690470722719}
 {:type :framed,
  :nr 503,
  :score 2,
  :user "Even",
  :timestamp_ms 1690437839764}
 {:type :framed,
  :nr 503,
  :score 2,
  :user "Einar",
  :timestamp_ms 1690436341254}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 502,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1690381088381}
 {:type :framed,
  :nr 502,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690380513753}
 {:type :framed,
  :nr 502,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1690368336288}
 {:type :framed,
  :nr 502,
  :score 0,
  :user "Einar",
  :timestamp_ms 1690351786410}
 {:type :framed,
  :nr 502,
  :score 3,
  :user "Even",
  :timestamp_ms 1690350451189}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 501,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1690311805232}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 501,
  :score 1,
  :user "Lars",
  :timestamp_ms 1690298713463}
 {:type :framed,
  :nr 501,
  :score 3,
  :user "Even",
  :timestamp_ms 1690294063704}
 {:type :framed,
  :nr 501,
  :score 4,
  :user "Einar",
  :timestamp_ms 1690266113496}
 {:type :framed,
  :nr 501,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1690241740359}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 47,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1690207871262}
 {:type :framed,
  :nr 500,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1690207870057}
 {:type :episode,
  :nr 47,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690205183762}
 {:type :framed,
  :nr 500,
  :score 6,
  :user "Lars",
  :timestamp_ms 1690204732234}
 {:type :episode,
  :nr 47,
  :score 3,
  :user "Einar",
  :timestamp_ms 1690183340901}
 {:type :framed,
  :nr 500,
  :score 6,
  :user "Einar",
  :timestamp_ms 1690183161642}
 {:type :episode,
  :nr 47,
  :score 2,
  :user "Even",
  :timestamp_ms 1690177931972}
 {:type :episode,
  :nr 47,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1690160674840}
 {:type :framed,
  :nr 500,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1690152159814}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 500,
  :score 6,
  :user "Even",
  :timestamp_ms 1690149941658}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 499,
  :score 4,
  :user "Lars",
  :timestamp_ms 1690122563045}
 {:type :framed,
  :nr 499,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1690122401587}
 {:type :framed,
  :nr 499,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1690110738443}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 499,
  :score 2,
  :user "Einar",
  :timestamp_ms 1690101834603}
 {:type :framed,
  :nr 499,
  :score 3,
  :user "Even",
  :timestamp_ms 1690101582057}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 498,
  :score 4,
  :user "Lars",
  :timestamp_ms 1690038498295}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 498,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1690018957930}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 498,
  :score 3,
  :user "Einar",
  :timestamp_ms 1690004808644}
 {:type :framed,
  :nr 497,
  :score 6,
  :user "Lars",
  :timestamp_ms 1689994480935}
 {:type :framed,
  :nr 498,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1689982037439}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 498,
  :score 4,
  :user "Even",
  :timestamp_ms 1689977133006}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 497,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1689938734077}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 497,
  :score 6,
  :user "Einar",
  :timestamp_ms 1689917402691}
 {:type :framed,
  :nr 497,
  :score 2,
  :user "Even",
  :timestamp_ms 1689908593114}
 {:type :framed,
  :nr 497,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1689893672928}
 {:type :framed,
  :nr 496,
  :score 2,
  :user "Even",
  :timestamp_ms 1689889906683}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 496,
  :score 6,
  :user "Lars",
  :timestamp_ms 1689862992716}
 {:type :framed,
  :nr 496,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1689851120970}
 {:type :framed,
  :nr 496,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1689850480418}
 {:type :framed,
  :nr 496,
  :score 6,
  :user "Einar",
  :timestamp_ms 1689835471997}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 495,
  :score 6,
  :user "Lars",
  :timestamp_ms 1689805998507}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 495,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1689804338473}
 {:type :framed,
  :nr 495,
  :score 6,
  :user "Even",
  :timestamp_ms 1689744410235}
 {:type :framed,
  :nr 495,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1689719440011}
 {:type :framed,
  :nr 495,
  :score 3,
  :user "Einar",
  :timestamp_ms 1689718129830}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 46,
  :score 10,
  :user "Lars",
  :timestamp_ms 1689693003484}
 {:type :framed,
  :nr 494,
  :score 5,
  :user "Lars",
  :timestamp_ms 1689690869932}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 46,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1689690367510}
 {:type :episode,
  :nr 46,
  :score 3,
  :user "Even",
  :timestamp_ms 1689682614541}
 {:type :episode,
  :nr 46,
  :score 2,
  :user "Einar",
  :timestamp_ms 1689682456776}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 46,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1689677925160}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 494,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1689676973289}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 494,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1689675116970}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 494,
  :score 3,
  :user "Even",
  :timestamp_ms 1689661186012}
 {:type :framed,
  :nr 494,
  :score 3,
  :user "Einar",
  :timestamp_ms 1689659313586}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 493,
  :score 2,
  :user "Lars",
  :timestamp_ms 1689602706974}
 {:type :framed,
  :nr 493,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1689585343566}
 {:type :framed,
  :nr 493,
  :score 0,
  :user "Even",
  :timestamp_ms 1689575959453}
 {:type :framed,
  :nr 493,
  :score 2,
  :user "Einar",
  :timestamp_ms 1689575024647}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 493,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1689545251033}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 492,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1689514554625}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 492,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1689514006112}
 {:type :framed,
  :nr 492,
  :score 2,
  :user "Lars",
  :timestamp_ms 1689508138663}
 {:type :framed,
  :nr 492,
  :score 0,
  :user "Einar",
  :timestamp_ms 1689488868818}
 {:type :framed,
  :nr 492,
  :score 0,
  :user "Even",
  :timestamp_ms 1689459720966}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 491,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1689430761869}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 491,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1689426534972}
 {:type :framed,
  :nr 491,
  :score 6,
  :user "Lars",
  :timestamp_ms 1689424302419}
 {:type :framed,
  :nr 491,
  :score 5,
  :user "Einar",
  :timestamp_ms 1689400362330}
 {:type :framed,
  :nr 491,
  :score 3,
  :user "Even",
  :timestamp_ms 1689372723875}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 490,
  :score 4,
  :user "Lars",
  :timestamp_ms 1689333077701}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 490,
  :score 1,
  :user "Einar",
  :timestamp_ms 1689330603466}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 490,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1689317260887}
 {:type :framed,
  :nr 490,
  :score 2,
  :user "Even",
  :timestamp_ms 1689317051558}
 {:type :framed,
  :nr 490,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1689290011573}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 489,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1689259003607}
 {:type :framed,
  :nr 489,
  :score 3,
  :user "Lars",
  :timestamp_ms 1689256606460}
 {:type :framed,
  :nr 489,
  :score 1,
  :user "Einar",
  :timestamp_ms 1689232201034}
 {:type :framed,
  :nr 489,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1689202492594}
 {:type :framed,
  :nr 489,
  :score 1,
  :user "Even",
  :timestamp_ms 1689201030574}
 {:type :framed,
  :nr 488,
  :score 6,
  :user "Lars",
  :timestamp_ms 1689158952484}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 488,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1689156072921}
 {:type :framed,
  :nr 488,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1689145501802}
 {:type :framed,
  :nr 488,
  :score 2,
  :user "Even",
  :timestamp_ms 1689144681039}
 {:type :framed,
  :nr 488,
  :score 2,
  :user "Einar",
  :timestamp_ms 1689142854382}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
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
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 487,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1689027859896}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 487,
  :score 0,
  :user "Even",
  :timestamp_ms 1689027523080}
 {:type :framed,
  :nr 487,
  :score 1,
  :user "Lars",
  :timestamp_ms 1689027235422}
 {:type :framed,
  :nr 487,
  :score 2,
  :user "Einar",
  :timestamp_ms 1689027189409}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 487,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1689027006538}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 45,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1689011335790}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :episode,
  :nr 45,
  :score 8,
  :user "Lars",
  :timestamp_ms 1689010051671}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 486,
  :score 4,
  :user "Lars",
  :timestamp_ms 1688986877970}
 {:type :episode,
  :nr 45,
  :score 1,
  :user "Einar",
  :timestamp_ms 1688972170402}
 {:type :episode,
  :nr 45,
  :score 0,
  :user "Even",
  :timestamp_ms 1688969336198}
 {:type :framed,
  :nr 486,
  :score 3,
  :user "Even",
  :timestamp_ms 1688969104650}
 {:type :framed,
  :nr 486,
  :score 3,
  :user "Einar",
  :timestamp_ms 1688966548585}
 {:type :episode,
  :nr 45,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1688942823106}
 {:type :framed,
  :nr 486,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1688942807355}
 {:type :framed,
  :nr 486,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1688941164016}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 485,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1688916884125}
 {:type :framed,
  :nr 485,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688886385188}
 {:type :framed,
  :nr 485,
  :score 2,
  :user "Einar",
  :timestamp_ms 1688883878997}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 485,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1688863343284}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 485,
  :score 2,
  :user "Even",
  :timestamp_ms 1688863150833}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 484,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1688808403699}
 {:type :framed,
  :nr 484,
  :score 6,
  :user "Even",
  :timestamp_ms 1688796574380}
 {:type :framed,
  :nr 484,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688767781672}
 {:type :framed,
  :nr 484,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1688767734233}
 {:type :framed,
  :nr 484,
  :score 6,
  :user "Einar",
  :timestamp_ms 1688767649734}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 483,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1688718050998}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 483,
  :score 1,
  :user "Even",
  :timestamp_ms 1688710490257}
 {:type :framed,
  :nr 483,
  :score 1,
  :user "Einar",
  :timestamp_ms 1688707457423}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 483,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688682062229}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 483,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1688681941732}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :framed,
  :nr 482,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688661423811}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 482,
  :score 0,
  :user "Einar",
  :timestamp_ms 1688622509981}
 {:type :framed,
  :nr 482,
  :score 0,
  :user "Even",
  :timestamp_ms 1688622009037}
 {:type :framed,
  :nr 482,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1688594698832}
 {:type :framed,
  :nr 482,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1688594650035}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 481,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1688545277691}
 {:type :framed,
  :nr 481,
  :score 6,
  :user "Einar",
  :timestamp_ms 1688537739355}
 {:type :framed,
  :nr 481,
  :score 0,
  :user "Even",
  :timestamp_ms 1688535303712}
 {:type :framed,
  :nr 481,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688509036810}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 481,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1688508505245}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 480,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1688461839617}
 {:type :framed,
  :nr 480,
  :score 1,
  :user "Even",
  :timestamp_ms 1688456242115}
 {:type :framed,
  :nr 480,
  :score 1,
  :user "Einar",
  :timestamp_ms 1688452087360}
 {:type :framed,
  :nr 480,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688423449645}
 {:type :framed,
  :nr 480,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1688422680802}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :episode,
  :nr 44,
  :score 1,
  :user "Einar",
  :timestamp_ms 1688389697161}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 44,
  :score 10,
  :user "Lars",
  :timestamp_ms 1688388796616}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 44,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1688387057638}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 479,
  :score 2,
  :user "Even",
  :timestamp_ms 1688374159155}
 {:type :episode,
  :nr 44,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1688372364149}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 44,
  :score 0,
  :user "Even",
  :timestamp_ms 1688372346621}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 479,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1688370875111}
 {:type :framed,
  :nr 479,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1688369070573}
 {:type :framed,
  :nr 479,
  :score 0,
  :user "Lars",
  :timestamp_ms 1688336747470}
 {:type :framed,
  :nr 479,
  :score 4,
  :user "Einar",
  :timestamp_ms 1688335381782}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 478,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1688325210545}
 {:type :framed,
  :nr 478,
  :score 5,
  :user "Lars",
  :timestamp_ms 1688291923668}
 {:type :framed,
  :nr 478,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1688290967597}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 478,
  :score 6,
  :user "Einar",
  :timestamp_ms 1688279904562}
 {:type :framed,
  :nr 478,
  :score 6,
  :user "Even",
  :timestamp_ms 1688277783634}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 477,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1688201249479}
 {:type :framed,
  :nr 477,
  :score 6,
  :user "Einar",
  :timestamp_ms 1688193201180}
 {:type :framed,
  :nr 477,
  :score 3,
  :user "Even",
  :timestamp_ms 1688191492953}
 {:type :framed,
  :nr 477,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688169870703}
 {:type :framed,
  :nr 477,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1688167179206}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 476,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1688117302149}
 {:type :framed,
  :nr 475,
  :score 5,
  :user "Even",
  :timestamp_ms 1688117046388}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 476,
  :score 6,
  :user "Even",
  :timestamp_ms 1688105033670}
 {:type :framed,
  :nr 476,
  :score 6,
  :user "Einar",
  :timestamp_ms 1688101444076}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 476,
  :score 6,
  :user "Lars",
  :timestamp_ms 1688078816070}
 {:type :framed,
  :nr 476,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1688078718134}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 475,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1688030619643}
 {:type :framed,
  :nr 475,
  :score 5,
  :user "Lars",
  :timestamp_ms 1688029829737}
 {:type :framed,
  :nr 475,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1688024953122}
 {:type :framed,
  :nr 475,
  :score 1,
  :user "Einar",
  :timestamp_ms 1688017476387}
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
 {:type :framed,
  :nr 474,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1687944461278}
 {:type :framed,
  :nr 474,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1687939249159}
 {:type :framed,
  :nr 474,
  :score 6,
  :user "Lars",
  :timestamp_ms 1687937444891}
 {:type :framed,
  :nr 474,
  :score 2,
  :user "Even",
  :timestamp_ms 1687930137755}
 {:type :framed,
  :nr 474,
  :score 4,
  :user "Einar",
  :timestamp_ms 1687925374674}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 473,
  :score 2,
  :user "Lars",
  :timestamp_ms 1687901263668}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 473,
  :score 2,
  :user "Even",
  :timestamp_ms 1687865657054}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 473,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1687864028436}
 {:type :framed,
  :nr 473,
  :score 0,
  :user "Einar",
  :timestamp_ms 1687841751010}
 {:type :framed,
  :nr 473,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687817838017}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 43,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687771213644}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 43,
  :score 0,
  :user "Even",
  :timestamp_ms 1687759446606}
 {:type :framed,
  :nr 472,
  :score 0,
  :user "Even",
  :timestamp_ms 1687758431524}
 {:type :episode,
  :nr 43,
  :score 1,
  :user "Einar",
  :timestamp_ms 1687754903064}
 {:type :framed,
  :nr 472,
  :score 4,
  :user "Einar",
  :timestamp_ms 1687754812392}
 {:type :episode,
  :nr 43,
  :score 1,
  :user "Lars",
  :timestamp_ms 1687733360620}
 {:type :episode,
  :nr 43,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1687733196579}
 {:type :framed,
  :nr 472,
  :score 6,
  :user "Lars",
  :timestamp_ms 1687732266692}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 472,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687731691367}
 {:type :framed,
  :nr 472,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1687731345087}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 471,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1687714140537}
 {:type :framed,
  :nr 471,
  :score 1,
  :user "Even",
  :timestamp_ms 1687669013094}
 {:type :framed,
  :nr 471,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1687656557684}
 {:type :framed,
  :nr 471,
  :score 1,
  :user "Einar",
  :timestamp_ms 1687648704925}
 {:type :framed,
  :nr 471,
  :score 1,
  :user "Lars",
  :timestamp_ms 1687647834316}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 470,
  :score 0,
  :user "Einar",
  :timestamp_ms 1687586798626}
 {:type :framed,
  :nr 470,
  :score 1,
  :user "Even",
  :timestamp_ms 1687584995528}
 {:type :framed,
  :nr 470,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1687559112000}
 {:type :framed,
  :nr 470,
  :score 0,
  :user "Lars",
  :timestamp_ms 1687558231896}
 {:type :framed,
  :nr 470,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687558095450}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 469,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1687514527464}
 {:type :framed,
  :nr 469,
  :score 3,
  :user "Lars",
  :timestamp_ms 1687510077639}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 469,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687504642508}
 {:type :framed,
  :nr 469,
  :score 1,
  :user "Even",
  :timestamp_ms 1687499168559}
 {:type :framed,
  :nr 469,
  :score 1,
  :user "Einar",
  :timestamp_ms 1687498431416}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 468,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1687427170282}
 {:type :framed,
  :nr 468,
  :score 6,
  :user "Lars",
  :timestamp_ms 1687419641246}
 {:type :framed,
  :nr 468,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1687418961515}
 {:type :framed,
  :nr 468,
  :score 1,
  :user "Even",
  :timestamp_ms 1687414037060}
 {:type :framed,
  :nr 468,
  :score 6,
  :user "Einar",
  :timestamp_ms 1687413787171}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 467,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1687368427481}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 467,
  :score 6,
  :user "Even",
  :timestamp_ms 1687351831591}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 467,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1687343538934}
 {:type :framed,
  :nr 467,
  :score 1,
  :user "Lars",
  :timestamp_ms 1687330453688}
 {:type :framed,
  :nr 467,
  :score 6,
  :user "Einar",
  :timestamp_ms 1687322789123}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 466,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1687262314819}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 466,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687261575298}
 {:type :framed,
  :nr 466,
  :score 1,
  :user "Even",
  :timestamp_ms 1687246310487}
 {:type :framed,
  :nr 466,
  :score 2,
  :user "Lars",
  :timestamp_ms 1687242656886}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 466,
  :score 3,
  :user "Einar",
  :timestamp_ms 1687233593848}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 465,
  :score 1,
  :user "Even",
  :timestamp_ms 1687195877359}
 {:type :episode,
  :nr 42,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1687184346276}
 {:type :framed,
  :nr 465,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1687184266826}
 {:type :episode,
  :nr 42,
  :score 1,
  :user "Even",
  :timestamp_ms 1687158014656}
 {:type :framed,
  :nr 465,
  :score 3,
  :user "Einar",
  :timestamp_ms 1687155618130}
 {:type :episode,
  :nr 42,
  :score 2,
  :user "Einar",
  :timestamp_ms 1687150219439}
 {:type :episode,
  :nr 42,
  :score 2,
  :user "Lars",
  :timestamp_ms 1687128366612}
 {:type :framed,
  :nr 465,
  :score 5,
  :user "Lars",
  :timestamp_ms 1687128222056}
 {:type :episode,
  :nr 42,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1687126310243}
 {:type :framed,
  :nr 465,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687126301423}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 464,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1687096368883}
 {:type :framed,
  :nr 464,
  :score 0,
  :user "Even",
  :timestamp_ms 1687074596195}
 {:type :framed,
  :nr 464,
  :score 6,
  :user "Einar",
  :timestamp_ms 1687066461229}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 464,
  :score 2,
  :user "Lars",
  :timestamp_ms 1687039361212}
 {:type :framed,
  :nr 464,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1687039247657}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 463,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1687029247258}
 {:type :framed,
  :nr 463,
  :score 2,
  :user "Lars",
  :timestamp_ms 1686992949684}
 {:type :framed,
  :nr 463,
  :score 1,
  :user "Even",
  :timestamp_ms 1686987790037}
 {:type :framed,
  :nr 463,
  :score 1,
  :user "Einar",
  :timestamp_ms 1686984180545}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 463,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1686953072547}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 462,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1686907108706}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 462,
  :score 1,
  :user "Lars",
  :timestamp_ms 1686905358840}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 462,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1686899471873}
 {:type :framed,
  :nr 462,
  :score 0,
  :user "Einar",
  :timestamp_ms 1686894657046}
 {:type :framed,
  :nr 462,
  :score 0,
  :user "Even",
  :timestamp_ms 1686894256337}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 461,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686818756941}
 {:type :framed,
  :nr 461,
  :score 1,
  :user "Even",
  :timestamp_ms 1686809201964}
 {:type :framed,
  :nr 461,
  :score 4,
  :user "Einar",
  :timestamp_ms 1686804499265}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 461,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1686782125721}
 {:type :framed,
  :nr 461,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1686780164023}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 460,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686742273733}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 460,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1686741790072}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 460,
  :score 6,
  :user "Even",
  :timestamp_ms 1686741060260}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 460,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1686740419833}
 {:type :framed,
  :nr 460,
  :score 6,
  :user "Einar",
  :timestamp_ms 1686717946917}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 459,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1686651374707}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 459,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1686644460684}
 {:type :framed,
  :nr 459,
  :score 5,
  :user "Lars",
  :timestamp_ms 1686641011192}
 {:type :framed,
  :nr 459,
  :score 3,
  :user "Even",
  :timestamp_ms 1686639877836}
 {:type :framed,
  :nr 459,
  :score 2,
  :user "Einar",
  :timestamp_ms 1686633833995}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 458,
  :score 3,
  :user "Even",
  :timestamp_ms 1686567468478}
 {:type :framed,
  :nr 458,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1686567461295}
 {:type :episode,
  :nr 41,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1686567261165}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 41,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1686566903990}
 {:type :framed,
  :nr 458,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1686566898332}
 {:type :episode,
  :nr 41,
  :score 2,
  :user "Lars",
  :timestamp_ms 1686554959367}
 {:type :framed,
  :nr 458,
  :score 1,
  :user "Lars",
  :timestamp_ms 1686554367603}
 {:type :episode,
  :nr 41,
  :score 3,
  :user "Even",
  :timestamp_ms 1686550047406}
 {:type :episode,
  :nr 41,
  :score 0,
  :user "Einar",
  :timestamp_ms 1686544646089}
 {:type :framed,
  :nr 458,
  :score 2,
  :user "Einar",
  :timestamp_ms 1686544589960}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 457,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1686519200933}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 457,
  :score 4,
  :user "Abdi",
  :timestamp_ms 1686519023753}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 457,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686476513458}
 {:type :framed,
  :nr 457,
  :score 0,
  :user "Even",
  :timestamp_ms 1686435426624}
 {:type :framed,
  :nr 457,
  :score 3,
  :user "Einar",
  :timestamp_ms 1686434617922}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 456,
  :score 3,
  :user "Lars",
  :timestamp_ms 1686415727958}
 {:type :framed,
  :nr 456,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1686413336573}
 {:type :framed,
  :nr 456,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1686391795941}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 456,
  :score 2,
  :user "Einar",
  :timestamp_ms 1686378827043}
 {:type :framed,
  :nr 456,
  :score 0,
  :user "Even",
  :timestamp_ms 1686349201178}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 455,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1686304064407}
 {:type :framed,
  :nr 455,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1686300019702}
 {:type :framed,
  :nr 455,
  :score 0,
  :user "Even",
  :timestamp_ms 1686299982995}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 455,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686289762619}
 {:type :framed,
  :nr 455,
  :score 5,
  :user "Einar",
  :timestamp_ms 1686285413419}
 {:type :framed,
  :nr 454,
  :score 6,
  :user "Even",
  :timestamp_ms 1686210042333}
 {:type :framed,
  :nr 454,
  :score 6,
  :user "Einar",
  :timestamp_ms 1686199157225}
 {:type :framed,
  :nr 454,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1686177243969}
 {:type :framed,
  :nr 454,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1686177129170}
 {:type :framed,
  :nr 454,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686176531731}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 453,
  :score 0,
  :user "Lars",
  :timestamp_ms 1686127742443}
 {:type :framed,
  :nr 453,
  :score 0,
  :user "Even",
  :timestamp_ms 1686114871219}
 {:type :framed,
  :nr 453,
  :score 2,
  :user "Einar",
  :timestamp_ms 1686114778577}
 {:type :framed,
  :nr 453,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1686089423368}
 {:type :framed,
  :nr 453,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1686088962029}
 {:type :framed,
  :nr 452,
  :score 0,
  :user "Even",
  :timestamp_ms 1686028643906}
 {:type :framed,
  :nr 452,
  :score 1,
  :user "Einar",
  :timestamp_ms 1686023506370}
 {:type :framed,
  :nr 452,
  :score 1,
  :user "Lars",
  :timestamp_ms 1686006491242}
 {:type :framed,
  :nr 452,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1686005399923}
 {:type :framed,
  :nr 452,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1686002785377}
 {:type :episode,
  :nr 40,
  :score 10,
  :user "Lars",
  :timestamp_ms 1686000692544}
 {:type :framed,
  :nr 451,
  :score 6,
  :user "Lars",
  :timestamp_ms 1686000450430}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 451,
  :score 0,
  :user "Even",
  :timestamp_ms 1686000284970}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 40,
  :score 4,
  :user "Vegard",
  :timestamp_ms 1685962211482}
 {:type :framed,
  :nr 451,
  :score 3,
  :user "Einar",
  :timestamp_ms 1685950012803}
 {:type :episode,
  :nr 40,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1685944295151}
 {:type :framed,
  :nr 451,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1685944283127}
 {:type :episode,
  :nr 40,
  :score 8,
  :user "Even",
  :timestamp_ms 1685944103768}
 {:type :episode,
  :nr 40,
  :score 8,
  :user "Einar",
  :timestamp_ms 1685937460050}
 {:type :framed,
  :nr 451,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1685918260973}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 450,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1685879120252}
 {:type :framed,
  :nr 450,
  :score 3,
  :user "Lars",
  :timestamp_ms 1685869010887}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 450,
  :score 3,
  :user "Even",
  :timestamp_ms 1685832645269}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 450,
  :score 3,
  :user "Einar",
  :timestamp_ms 1685831662589}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 450,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1685831192539}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 449,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1685782100335}
 {:type :framed,
  :nr 449,
  :score 0,
  :user "Even",
  :timestamp_ms 1685781861981}
 {:type :framed,
  :nr 449,
  :score 0,
  :user "Einar",
  :timestamp_ms 1685766109225}
 {:type :framed,
  :nr 449,
  :score 4,
  :user "Lars",
  :timestamp_ms 1685745263006}
 {:type :framed,
  :nr 449,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1685743298336}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 448,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1685700798027}
 {:type :framed,
  :nr 448,
  :score 2,
  :user "Even",
  :timestamp_ms 1685691955046}
 {:type :framed,
  :nr 448,
  :score 0,
  :user "Einar",
  :timestamp_ms 1685684470951}
 {:type :framed,
  :nr 448,
  :score 5,
  :user "Lars",
  :timestamp_ms 1685658760368}
 {:type :framed,
  :nr 448,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1685656863150}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 447,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1685607636857}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 447,
  :score 6,
  :user "Lars",
  :timestamp_ms 1685606901411}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 447,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1685606826968}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 447,
  :score 6,
  :user "Even",
  :timestamp_ms 1685604807943}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 447,
  :score 5,
  :user "Einar",
  :timestamp_ms 1685592207992}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 446,
  :score 2,
  :user "Lars",
  :timestamp_ms 1685532478773}
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
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 446,
  :score 1,
  :user "Even",
  :timestamp_ms 1685530439451}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 446,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1685520518542}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 446,
  :score 0,
  :user "Einar",
  :timestamp_ms 1685510391602}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 446,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1685484227662}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 445,
  :score 5,
  :user "Vegard",
  :timestamp_ms 1685443363004}
 {:type :framed,
  :nr 445,
  :score 6,
  :user "Lars",
  :timestamp_ms 1685436564873}
 {:type :framed,
  :nr 445,
  :score 0,
  :user "Even",
  :timestamp_ms 1685421697148}
 {:type :framed,
  :nr 445,
  :score 2,
  :user "Einar",
  :timestamp_ms 1685421112060}
 {:type :framed,
  :nr 445,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1685399898134}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 39,
  :score 10,
  :user "Lars",
  :timestamp_ms 1685381063441}
 {:type :framed,
  :nr 444,
  :score 6,
  :user "Lars",
  :timestamp_ms 1685380823341}
 {:type :episode,
  :nr 39,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1685356509692}
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
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 39,
  :score 8,
  :user "Even",
  :timestamp_ms 1685343119370}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 444,
  :score 3,
  :user "Even",
  :timestamp_ms 1685342182902}
 {:type :episode,
  :nr 39,
  :score 7,
  :user "Einar",
  :timestamp_ms 1685337609195}
 {:type :framed,
  :nr 444,
  :score 6,
  :user "Einar",
  :timestamp_ms 1685337346153}
 {:type :episode,
  :nr 39,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1685314820025}
 {:type :framed,
  :nr 444,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1685314809936}
 {:type :framed,
  :nr 444,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1685314366802}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 442,
  :score 6,
  :user "Lars",
  :timestamp_ms 1685278530566}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 443,
  :score 6,
  :user "Lars",
  :timestamp_ms 1685269180085}
 {:type :framed,
  :nr 443,
  :score 5,
  :user "Even",
  :timestamp_ms 1685267116089}
 {:type :framed,
  :nr 443,
  :score 5,
  :user "Einar",
  :timestamp_ms 1685253046265}
 {:type :framed,
  :nr 443,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1685228021413}
 {:type :framed,
  :nr 443,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1685226174810}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 442,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1685215763076}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 442,
  :score 5,
  :user "Abdi",
  :timestamp_ms 1685142748530}
 {:type :framed,
  :nr 442,
  :score 5,
  :user "Even",
  :timestamp_ms 1685140138436}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 442,
  :score 6,
  :user "Einar",
  :timestamp_ms 1685138621376}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 441,
  :score 2,
  :user "Even",
  :timestamp_ms 1685086369416}
 {:type :framed,
  :nr 441,
  :score 0,
  :user "Lars",
  :timestamp_ms 1685085857739}
 {:type :framed,
  :nr 441,
  :score 4,
  :user "Einar",
  :timestamp_ms 1685083246710}
 {:type :framed,
  :nr 441,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1685052567567}
 {:type :framed,
  :nr 441,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1685052466551}
 {:type :framed,
  :nr 440,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1684968988592}
 {:type :framed,
  :nr 440,
  :score 0,
  :user "Even",
  :timestamp_ms 1684966616450}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 440,
  :score 2,
  :user "Einar",
  :timestamp_ms 1684965992875}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 440,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684965825665}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 439,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1684911896374}
 {:type :framed,
  :nr 439,
  :score 2,
  :user "Lars",
  :timestamp_ms 1684910096759}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 439,
  :score 5,
  :user "Even",
  :timestamp_ms 1684905388025}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 439,
  :score 6,
  :user "Einar",
  :timestamp_ms 1684902221659}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 439,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1684879843492}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 438,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1684825173944}
 {:type :framed,
  :nr 438,
  :score 1,
  :user "Even",
  :timestamp_ms 1684819335231}
 {:type :framed,
  :nr 438,
  :score 0,
  :user "Einar",
  :timestamp_ms 1684818639776}
 {:type :framed,
  :nr 438,
  :score 4,
  :user "Lars",
  :timestamp_ms 1684794170151}
 {:type :framed,
  :nr 438,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684793084494}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 437,
  :score 1,
  :user "Even",
  :timestamp_ms 1684748754189}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 38,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1684744528816}
 {:type :episode,
  :nr 38,
  :score 2,
  :user "Lars",
  :timestamp_ms 1684737736857}
 {:type :framed,
  :nr 437,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684737492458}
 {:type :episode,
  :nr 38,
  :score 1,
  :user "Even",
  :timestamp_ms 1684733283749}
 {:type :episode,
  :nr 38,
  :score 7,
  :user "Einar",
  :timestamp_ms 1684727857901}
 {:type :framed,
  :nr 437,
  :score 3,
  :user "Einar",
  :timestamp_ms 1684727658424}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 437,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684707097077}
 {:type :episode,
  :nr 38,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1684707086207}
 {:type :framed,
  :nr 437,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1684706533468}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 435,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684702156634}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 436,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684702078841}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 436,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1684663059298}
 {:type :framed,
  :nr 436,
  :score 1,
  :user "Even",
  :timestamp_ms 1684651628717}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 436,
  :score 6,
  :user "Einar",
  :timestamp_ms 1684640549896}
 {:type :framed,
  :nr 436,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684620721066}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 435,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1684612394913}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 435,
  :score 2,
  :user "Even",
  :timestamp_ms 1684561514973}
 {:type :framed,
  :nr 435,
  :score 1,
  :user "Einar",
  :timestamp_ms 1684561030317}
 {:type :framed,
  :nr 435,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1684538559290}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 434,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684487166228}
 {:type :framed,
  :nr 434,
  :score 2,
  :user "Even",
  :timestamp_ms 1684481901986}
 {:type :framed,
  :nr 434,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1684451582236}
 {:type :framed,
  :nr 434,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684449511707}
 {:type :framed,
  :nr 434,
  :score 6,
  :user "Einar",
  :timestamp_ms 1684448508766}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 433,
  :score 0,
  :user "Even",
  :timestamp_ms 1684435446472}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 433,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1684434405159}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 433,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684409353538}
 {:type :framed,
  :nr 433,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684361268609}
 {:type :framed,
  :nr 433,
  :score 2,
  :user "Einar",
  :timestamp_ms 1684361148982}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 432,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684306924171}
 {:type :framed,
  :nr 432,
  :score 1,
  :user "Even",
  :timestamp_ms 1684302602204}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 432,
  :score 2,
  :user "Einar",
  :timestamp_ms 1684299727229}
 {:type :framed,
  :nr 432,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1684278576389}
 {:type :framed,
  :nr 432,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1684275702149}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 431,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1684236229557}
 {:type :framed,
  :nr 431,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684236111639}
 {:type :framed,
  :nr 431,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684222688226}
 {:type :framed,
  :nr 431,
  :score 0,
  :user "Even",
  :timestamp_ms 1684215370683}
 {:type :framed,
  :nr 431,
  :score 1,
  :user "Einar",
  :timestamp_ms 1684206792991}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 37,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1684150338256}
 {:type :framed,
  :nr 430,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1684150334676}
 {:type :episode,
  :nr 37,
  :score 4,
  :user "Lars",
  :timestamp_ms 1684139514216}
 {:type :framed,
  :nr 430,
  :score 6,
  :user "Lars",
  :timestamp_ms 1684139165175}
 {:type :episode,
  :nr 37,
  :score 0,
  :user "Even",
  :timestamp_ms 1684128634209}
 {:type :framed,
  :nr 430,
  :score 0,
  :user "Even",
  :timestamp_ms 1684128491296}
 {:type :episode,
  :nr 37,
  :score 0,
  :user "Einar",
  :timestamp_ms 1684126639460}
 {:type :framed,
  :nr 430,
  :score 6,
  :user "Einar",
  :timestamp_ms 1684125821078}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 37,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684103117735}
 {:type :framed,
  :nr 430,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1684103102516}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 429,
  :score 2,
  :user "Even",
  :timestamp_ms 1684063352939}
 {:type :framed,
  :nr 429,
  :score 2,
  :user "Lars",
  :timestamp_ms 1684061202783}
 {:type :framed,
  :nr 429,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1684055121443}
 {:type :framed,
  :nr 429,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1684016612430}
 {:type :framed,
  :nr 429,
  :score 0,
  :user "Einar",
  :timestamp_ms 1684016077419}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 428,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1683981377652}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 428,
  :score 2,
  :user "Lars",
  :timestamp_ms 1683958559577}
 {:type :framed,
  :nr 428,
  :score 2,
  :user "Einar",
  :timestamp_ms 1683957390822}
 {:type :framed,
  :nr 428,
  :score 0,
  :user "Even",
  :timestamp_ms 1683953534552}
 {:type :framed,
  :nr 428,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1683928978728}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 427,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683915152054}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 427,
  :score 2,
  :user "Even",
  :timestamp_ms 1683870640063}
 {:type :framed,
  :nr 427,
  :score 2,
  :user "Einar",
  :timestamp_ms 1683864205577}
 {:type :framed,
  :nr 427,
  :score 2,
  :user "Lars",
  :timestamp_ms 1683844181767}
 {:type :framed,
  :nr 427,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683842746914}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 426,
  :score 2,
  :user "Even",
  :timestamp_ms 1683795218614}
 {:type :framed,
  :nr 426,
  :score 2,
  :user "Einar",
  :timestamp_ms 1683778563710}
 {:type :framed,
  :nr 426,
  :score 6,
  :user "Lars",
  :timestamp_ms 1683775012807}
 {:type :framed,
  :nr 426,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1683759098677}
 {:type :framed,
  :nr 426,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1683758369744}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 425,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1683708017730}
 {:type :framed,
  :nr 425,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683705713107}
 {:type :framed,
  :nr 425,
  :score 3,
  :user "Lars",
  :timestamp_ms 1683699874550}
 {:type :framed,
  :nr 425,
  :score 0,
  :user "Even",
  :timestamp_ms 1683696615945}
 {:type :framed,
  :nr 425,
  :score 3,
  :user "Einar",
  :timestamp_ms 1683692137106}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 424,
  :score 6,
  :user "Lars",
  :timestamp_ms 1683648316906}
 {:type :framed,
  :nr 424,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1683642596768}
 {:type :framed,
  :nr 424,
  :score 1,
  :user "Even",
  :timestamp_ms 1683620770297}
 {:type :framed,
  :nr 424,
  :score 5,
  :user "Einar",
  :timestamp_ms 1683607009963}
 {:type :framed,
  :nr 424,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1683584396352}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :episode,
  :nr 36,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683547062467}
 {:type :framed,
  :nr 423,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1683547052565}
 {:type :framed,
  :nr 423,
  :score 2,
  :user "Even",
  :timestamp_ms 1683538313043}
 {:type :episode,
  :nr 36,
  :score 0,
  :user "Even",
  :timestamp_ms 1683533647769}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 422,
  :score 2,
  :user "Lars",
  :timestamp_ms 1683530515643}
 {:type :episode,
  :nr 36,
  :score 0,
  :user "Lars",
  :timestamp_ms 1683530364501}
 {:type :framed,
  :nr 423,
  :score 4,
  :user "Lars",
  :timestamp_ms 1683530348740}
 {:type :not-framed, :user "Lars"}
 {:type :episode,
  :nr 36,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683528531840}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 36,
  :score 8,
  :user "Einar",
  :timestamp_ms 1683518435379}
 {:type :framed,
  :nr 423,
  :score 6,
  :user "Einar",
  :timestamp_ms 1683518350897}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 423,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1683499064391}
 {:type :framed,
  :nr 422,
  :score 0,
  :user "Einar",
  :timestamp_ms 1683438504430}
 {:type :framed,
  :nr 422,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683414178667}
 {:type :framed,
  :nr 422,
  :score 0,
  :user "Even",
  :timestamp_ms 1683411089177}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 422,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683410571286}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :framed,
  :nr 421,
  :score 0,
  :user "Lars",
  :timestamp_ms 1683359251636}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 421,
  :score 3,
  :user "Even",
  :timestamp_ms 1683326715294}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 421,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683326314874}
 {:type :framed,
  :nr 421,
  :score 1,
  :user "Einar",
  :timestamp_ms 1683326228327}
 {:type :framed,
  :nr 421,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683325135381}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 420,
  :score 0,
  :user "Einar",
  :timestamp_ms 1683263317775}
 {:type :framed,
  :nr 420,
  :score 2,
  :user "Even",
  :timestamp_ms 1683263194340}
 {:type :framed,
  :nr 420,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683238711613}
 {:type :framed,
  :nr 420,
  :score 2,
  :user "Lars",
  :timestamp_ms 1683238139590}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 420,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683237919756}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 419,
  :score 5,
  :user "Lars",
  :timestamp_ms 1683189952932}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :framed,
  :nr 419,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1683189706669}
 {:type :framed,
  :nr 419,
  :score 1,
  :user "Even",
  :timestamp_ms 1683187185590}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 419,
  :score 6,
  :user "Einar",
  :timestamp_ms 1683177387011}
 {:type :framed,
  :nr 419,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1683151521972}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :framed,
  :nr 418,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1683099891848}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 418,
  :score 2,
  :user "Even",
  :timestamp_ms 1683092860202}
 {:type :framed,
  :nr 418,
  :score 3,
  :user "Einar",
  :timestamp_ms 1683088236550}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 418,
  :score 6,
  :user "Lars",
  :timestamp_ms 1683065609975}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 417,
  :score 5,
  :user "Lars",
  :timestamp_ms 1683065381345}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 418,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1683064853578}
 {:type :framed,
  :nr 417,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1683021872398}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 417,
  :score 3,
  :user "Even",
  :timestamp_ms 1683021002986}
 {:type :framed,
  :nr 417,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1683020103912}
 {:type :framed,
  :nr 417,
  :score 2,
  :user "Einar",
  :timestamp_ms 1683016914065}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :episode,
  :nr 35,
  :score 1,
  :user "Lars",
  :timestamp_ms 1682955791357}
 {:type :framed,
  :nr 416,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682955669085}
 {:type :episode,
  :nr 35,
  :score 10,
  :user "Einar",
  :timestamp_ms 1682947224361}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 35,
  :score 1,
  :user "Even",
  :timestamp_ms 1682922277023}
 {:type :episode,
  :nr 35,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1682896436240}
 {:type :framed,
  :nr 416,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682896426988}
 {:type :episode,
  :nr 35,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1682894484732}
 {:type :framed,
  :nr 416,
  :score 4,
  :user "Einar",
  :timestamp_ms 1682893962018}
 {:type :framed,
  :nr 416,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1682893599973}
 {:type :framed,
  :nr 416,
  :score 1,
  :user "Even",
  :timestamp_ms 1682892657159}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
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
 {:type :framed,
  :nr 415,
  :score 2,
  :user "Even",
  :timestamp_ms 1682878661481}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 415,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1682878024581}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Lars"}
 {:type :framed,
  :nr 415,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1682808633455}
 {:type :framed,
  :nr 415,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682807928913}
 {:type :framed,
  :nr 415,
  :score 6,
  :user "Einar",
  :timestamp_ms 1682806050303}
 {:type :framed,
  :nr 414,
  :score 0,
  :user "Even",
  :timestamp_ms 1682759512263}
 {:type :framed,
  :nr 414,
  :score 2,
  :user "Einar",
  :timestamp_ms 1682744947515}
 {:type :framed,
  :nr 414,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682724298676}
 {:type :framed,
  :nr 414,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1682721746232}
 {:type :framed,
  :nr 414,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682721706335}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 413,
  :score 3,
  :user "Even",
  :timestamp_ms 1682678517083}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 413,
  :score 3,
  :user "Vegard",
  :timestamp_ms 1682665286422}
 {:type :framed,
  :nr 413,
  :score 6,
  :user "Einar",
  :timestamp_ms 1682663224012}
 {:type :framed,
  :nr 413,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682663144713}
 {:type :framed,
  :nr 413,
  :score 3,
  :user "Abdi",
  :timestamp_ms 1682635485979}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 412,
  :score 1,
  :user "Abdi",
  :timestamp_ms 1682592534721}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 412,
  :score 1,
  :user "Even",
  :timestamp_ms 1682584417014}
 {:type :framed,
  :nr 412,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1682583318033}
 {:type :framed,
  :nr 412,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682581617456}
 {:type :framed,
  :nr 412,
  :score 2,
  :user "Einar",
  :timestamp_ms 1682567882499}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Einar"}
 {:type :framed,
  :nr 411,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682535113598}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :framed,
  :nr 411,
  :score 6,
  :user "Abdi",
  :timestamp_ms 1682504964100}
 {:type :framed,
  :nr 411,
  :score 6,
  :user "Even",
  :timestamp_ms 1682504428423}
 {:type :framed,
  :nr 411,
  :score 6,
  :user "Vegard",
  :timestamp_ms 1682500745936}
 {:type :framed,
  :nr 411,
  :score 6,
  :user "Einar",
  :timestamp_ms 1682482512783}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
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
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 410,
  :score 1,
  :user "Vegard",
  :timestamp_ms 1682418436073}
 {:type :framed,
  :nr 410,
  :score 2,
  :user "Lars",
  :timestamp_ms 1682409902191}
 {:type :framed,
  :nr 410,
  :score 0,
  :user "Even",
  :timestamp_ms 1682406317398}
 {:type :framed,
  :nr 410,
  :score 2,
  :user "Einar",
  :timestamp_ms 1682397356919}
 {:type :framed,
  :nr 410,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682374130367}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Even"}
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
 {:type :not-framed, :user "Even"}
 {:type :not-framed, :user "Abdi"}
 {:type :framed,
  :nr 409,
  :score 2,
  :user "Even",
  :timestamp_ms 1682333677338}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Vegard"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Lars"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Abdi"}
 {:type :not-framed, :user "Einar"}
 {:type :episode,
  :nr 34,
  :score 0,
  :user "Abdi",
  :timestamp_ms 1682324451144}
 {:type :framed,
  :nr 409,
  :score 2,
  :user "Abdi",
  :timestamp_ms 1682324439803}
 {:type :episode,
  :nr 34,
  :score 0,
  :user "Lars",
  :timestamp_ms 1682323911233}
 {:type :framed,
  :nr 409,
  :score 6,
  :user "Lars",
  :timestamp_ms 1682323882613}
 {:type :framed,
  :nr 409,
  :score 2,
  :user "Vegard",
  :timestamp_ms 1682320033864}
 {:type :episode,
  :nr 34,
  :score 0,
  :user "Vegard",
  :timestamp_ms 1682320031630}
 {:type :episode,
  :nr 34,
  :score 0,
  :user "Even",
  :timestamp_ms 1682315292968}
 {:type :episode,
  :nr 34,
  :score 0,
  :user "Einar",
  :timestamp_ms 1682313138127}
 {:type :framed,
  :nr 409,
  :score 1,
  :user "Einar",
  :timestamp_ms 1682310961910}
 {:type :framed,
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
 {:type :not-framed, :user "Einar"}]
)
