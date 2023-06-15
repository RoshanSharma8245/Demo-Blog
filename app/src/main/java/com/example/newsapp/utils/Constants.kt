package com.example.newsapp.utils

object Constants {

    const val HOME = "Home"
    const val GENERAL = "general"
    const val SCIENCE = "science"
    const val HEALTH = "health"
    const val ENTERTAINMENT = "entertainment"
    const val BUSINESS = "business"
    const val TECHNOLOGY = "technology"
    const val SPORTS = "sports"
    const val NEWS_URL = "news url"
    const val NEWS_TITLE = "news title"
    const val NEWS_IMAGE_URL = "news image url"
    const val NEWS_SOURCE = "news source"
    const val NEWS_AUTHOR = "news author"
    const val NEWS_PUBLICATION_TIME = "news publication time"
    const val NEWS_DESCRIPTION = "news description"
    const val NEWS_CONTENT = "news content"
    const val TOTAL_NEWS_TAB = 7
    const val TOP_HEADLINES_COUNT = 5
    const val CONTENT_ID = "content id"

    val newsCategories = arrayOf(
        HOME, BUSINESS,
        ENTERTAINMENT, SCIENCE,
        SPORTS, TECHNOLOGY, HEALTH
    )

    const val DATABASE_NAME = "LOGIN_DATABASE"

    const val DEFAULT_SWIPER_DELAY = 4000L

    const val INITIAL_POSITION = 0

    const val technologyNewsArticle:String= "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Thenationalnews.com\"\n" +
            "      },\n" +
            "      \"author\": \"Faisal Salah\",\n" +
            "      \"title\": \"Ubisoft Forward 2023 highlights: Avatar, Prince of Persia and Assassin's Creed Mirage - The National\",\n" +
            "      \"description\": \"The company unveiled first-person shooter, stealth and side-scrolling games\",\n" +
            "      \"url\": \"https://www.thenationalnews.com/arts-culture/2023/06/13/ubisoft-forward-2023-highlights-avatar-prince-of-persia-and-assassins-creed-mirage/\",\n" +
            "      \"urlToImage\": \"https://thenational-the-national-prod.cdn.arcpublishing.com/resizer/Byc2jyNDnfSXk1imCaHZs1s1zI0=/800x0/filters:format(jpg):quality(70):focal(918x587:928x597)/cloudfront-eu-central-1.images.arcpublishing.com/thenational/77H3LOOQUZCLBOSNFTBHOAXJIE.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T10:05:40Z\",\n" +
            "      \"content\": \"French video game publisher Ubisoft held its 2023 showcase on Monday, with gameplay footage and trailers for their biggest upcoming titles.\\r\\nHere's a rundown of the most exciting takeaways:\\r\\nThe late… [+2138 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Rock Paper Shotgun\"\n" +
            "      },\n" +
            "      \"author\": \"James Archer\",\n" +
            "      \"title\": \"Starfield's system requirements are up, wants a GTX 1070 Ti and 125GB SSD space at minimum - Rock Paper Shotgun\",\n" +
            "      \"description\": \"Bethesda have released Starfield's system requirements for the PC version, and they're on the high side - even demanding a fast SSD for the minimum spec.\",\n" +
            "      \"url\": \"https://www.rockpapershotgun.com/starfields-system-requirements-are-up-wants-a-gtx-1070-ti-and-125gb-ssd-space-at-minimum\",\n" +
            "      \"urlToImage\": \"https://assetsio.reedpopcdn.com/starfield-mountains_9iKMw0I.jpg?width=1200&height=630&fit=crop&enable=upscale&auto=webp\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:57:02Z\",\n" +
            "      \"content\": \"Starfield’s PC system requirements have appeared on its Steam page, and while exploring its possibly too vast collection of planets and facial hair options probably will not have your PC sobbing stre… [+2101 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"TIMESOFINDIA.COM\",\n" +
            "      \"title\": \"Redmi Buds Active 4 true wireless earbuds with ENC launched: Price, features and more - Times of India\",\n" +
            "      \"description\": \"Along with its latest Xiaomi Pad 6, the Chinese smartphone maker has also launched its new Redmi branded true wireless earbuds in the country. The com\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/gadgets-news/redmi-buds-active-4-true-wireless-earbuds-with-enc-launched-price-features-and-more/articleshow/100960070.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100960060,width-1070,height-580,imgsize-568486,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:07:00Z\",\n" +
            "      \"content\": \"5G phones with Android 13, 8GB RAM under Rs 20,000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Sportskeeda\"\n" +
            "      },\n" +
            "      \"author\": \"Suyash Sahay\",\n" +
            "      \"title\": \"How to download new GTA Online San Andreas Mercenaries update on PlayStation, PC and Xbox - Sportskeeda\",\n" +
            "      \"description\": \"The Grand Theft Auto (GTA) Online San Andreas Mercenaries update will be out in a few hours. It will be available for the PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, and PC.\",\n" +
            "      \"url\": \"https://www.sportskeeda.com/gta/how-to-download-new-gta-online-san-andreas-mercenaries-update-playstation-pc-xbox\",\n" +
            "      \"urlToImage\": \"https://staticc.sportskeeda.com/editor/2023/06/4ca57-16866404911207-1920.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:44:00Z\",\n" +
            "      \"content\": \"The Grand Theft Auto (GTA) Online San Andreas Mercenaries update will be out in a few hours. It will be available for the PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, and PC. It looks lik… [+2401 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"YouTube\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Let's Move: An Olympic Invite to get the world moving! - Olympics\",\n" +
            "      \"description\": \"Get your invite now: https://oly.ch/OlympicDayYT \uD83D\uDCC6 30 minutes of daily physical activity can improve the way we live.Join us on #OlympicDay, June 23, and ev...\",\n" +
            "      \"url\": \"https://www.youtube.com/watch?v=zBeyzFMGtwQ\",\n" +
            "      \"urlToImage\": \"https://i.ytimg.com/vi/zBeyzFMGtwQ/maxresdefault.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:14:42Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"TIMESOFINDIA.COM\",\n" +
            "      \"title\": \"OnePlus Nord 3 likely design and specs surface online: Here’s what the upcoming OnePlus smartphone may of - Times of India\",\n" +
            "      \"description\": \"OnePlus is said to be gearing up for the launch of its new Nord series smartphone. The company is expected to launch its mid-range OnePlus Nord 3 smar\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/gadgets-news/oneplus-nord-3-likely-design-and-specs-surface-online-heres-what-the-upcoming-oneplus-smartphone-may-offer/articleshow/100957469.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100957453,width-1070,height-580,imgsize-26056,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:35:00Z\",\n" +
            "      \"content\": \"5G phones with Android 13, 8GB RAM under Rs 20,000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Indian Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Indian Express\",\n" +
            "      \"title\": \"Xiaomi Pad 6 with 144Hz display, Snapdragon 870 SoC launched - The Indian Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://indianexpress.com/article/technology/tech-news-technology/xiaomi-pad-6-launch-price-features-specs-8660125/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T06:18:17Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Editorji.com\"\n" +
            "      },\n" +
            "      \"author\": \"Editorji News Desk\",\n" +
            "      \"title\": \"15-inch MacBook Air M2 now available in India: Price, specs and features - Editorji\",\n" +
            "      \"description\": \"The 15-inch MacBook Air M2 is similar to the 13-inch model except for the display size.\",\n" +
            "      \"url\": \"https://www.editorji.com/tech-news/15-inch-macbook-air-m2-now-available-in-india-price-specs-and-features-1686636626477\",\n" +
            "      \"urlToImage\": \"https://cdn.editorji.com/BWvAmc39hP.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:10:26Z\",\n" +
            "      \"content\": \"The 15-inch MacBook Air M2 is now available for purchase in India. \\r\\nThe 15-inch MacBook Air M2 is powered by the new M2 chip, which Apple claims offers up to 40 percent faster CPU performance and up… [+594 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-hindu\",\n" +
            "        \"name\": \"The Hindu\"\n" +
            "      },\n" +
            "      \"author\": \"The Hindu\",\n" +
            "      \"title\": \"Ubisoft teases VR version of hit game ‘Assassin’s Creed’ - The Hindu\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.thehindu.com/sci-tech/technology/ubisoft-teases-vr-version-hit-game-assassins-creed/article66963274.ece\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T06:08:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India Today\"\n" +
            "      },\n" +
            "      \"author\": \"Divya Bhati\",\n" +
            "      \"title\": \"WhatsApp to soon allow Windows users to share screen during video calls: how to use - India Today\",\n" +
            "      \"description\": \"WhatsApp will soon allow Windows users to share screens during a video call. Similar to the screen-sharing feature in Google Meet or Microsoft Teams, this feature will come in handy for quick team meetings and other purposes.\",\n" +
            "      \"url\": \"https://www.indiatoday.in/technology/news/story/whatsapp-to-soon-allow-windows-users-to-share-screen-during-video-calls-how-to-use-2392358-2023-06-13\",\n" +
            "      \"urlToImage\": \"https://akm-img-a-in.tosshub.com/indiatoday/images/story/202306/whatsapp_9-sixteen_nine.jpg?VersionId=_j_LVb1sA3y4SPAOYn5kj8fBf8FD_E5H\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:49:26Z\",\n" +
            "      \"content\": \"By Divya Bhati: WhatsApp is working on a bunch of new updates for its app for Microsoft Windows. The app, owned by Meta, has reportedly started testing one of the most anticipated features, which all… [+3148 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"Manshi Singh\",\n" +
            "      \"title\": \"35% price drop! Massive Samsung Galaxy F13 discount rolled out; check rate now - HT Tech\",\n" +
            "      \"description\": \"35 price drop Massive Samsung Galaxy F13 discount rolled out check rate now Samsung Galaxy F13 discount will surely make you take a second look as the rate cut is substantial. Samsung Galaxy F13 discount has been rolled out during the Flipkart Big Saving Days…\",\n" +
            "      \"url\": \"https://tech.hindustantimes.com/web-stories/35-price-drop-massive-samsung-galaxy-f13-discount-rolled-out-check-rate-now-71686631333844.html\",\n" +
            "      \"urlToImage\": \"https://images.hindustantimes.com/tech/img/2023/06/13/1600x900/kvf_1686633064985_1686634252619.jpg/\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:35:59Z\",\n" +
            "      \"content\": \"Photo Credit: Samsung\\r\\n Samsung Galaxy F13 discount will surely make you take a second look as the rate cut is substantial.\\r\\nPhoto Credit: Samsung\\r\\n Samsung Galaxy F13 discount has been rolled out du… [+1014 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Jagran.com\"\n" +
            "      },\n" +
            "      \"author\": \"Ashish Singh\",\n" +
            "      \"title\": \"WhatsApp Enhances User Experience With Message Editing Feature In Latest Windows Beta Update; Details - Jagran English\",\n" +
            "      \"description\": \"WhatsApp has begun putting out a beta version for Windows users that includes the Message Editing feature\",\n" +
            "      \"url\": \"https://english.jagran.com/technology/whatsapp-enhances-user-experience-with-message-editing-feature-in-latest-windows-beta-update-details-10082452\",\n" +
            "      \"urlToImage\": \"https://imgeng.jagran.com/images/2023/jun/WhatsApp (7)1686634932954.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:35:00Z\",\n" +
            "      \"content\": \"WhatsApp, which has been steadily releasing new capabilities for all eligible platforms, has now begun to roll out the edit tool to Windows beta testers. According to a report, this indicates that al… [+1610 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India Today\"\n" +
            "      },\n" +
            "      \"author\": \"Divyanshi Sharma\",\n" +
            "      \"title\": \"Apple Vision Pro has a new fan and it is none other than Google CEO Sundar Pichai - India Today\",\n" +
            "      \"description\": \"Google CEO Sundar Pichai said that he is excited about the potential of technology that is seen in Apple's Vision Pro to create more immersive computing experiences.\",\n" +
            "      \"url\": \"https://www.indiatoday.in/technology/news/story/apple-vision-pro-has-a-new-fan-and-it-is-none-other-than-google-ceo-sundar-pichai-2392346-2023-06-13\",\n" +
            "      \"urlToImage\": \"https://akm-img-a-in.tosshub.com/indiatoday/images/story/202306/pichai-sixteen_nine.jpg?VersionId=XV7PBZj6PsGTII4dtKBkLUb8xszzyd6d\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:25:33Z\",\n" +
            "      \"content\": \"By Divyanshi Sharma: While launching the Apple Vision Pro during the recently-held WWDC 2023, CEO Tim Cook called it a 'new type of computer' and unveiled the promising headset in front of the world.… [+2331 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Govind Choudhary\",\n" +
            "      \"title\": \"Microsoft adds new security features to Windows 11, including new privacy settings and glance VPN. Check details here | Mint - Mint\",\n" +
            "      \"description\": \"Microsoft introduces enhanced security features for Windows 11, including updated privacy settings and a new ‘glanceable VPN’ feature.\",\n" +
            "      \"url\": \"https://www.livemint.com/technology/tech-news/microsoft-adds-new-security-features-to-windows-11-including-new-privacy-settings-and-glance-vpn-check-details-here-11686629843357.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/w11_1624551666843_1686631734958.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T04:50:21Z\",\n" +
            "      \"content\": \"Microsoft announced the introduction of enhanced security features for Windows 11. These include updated app privacy settings and a new feature called \\\"glanceable VPN.\\\" According to Microsoft, the ne… [+2391 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT News Desk\",\n" +
            "      \"title\": \"Amazon Apple Day Sale goes live, get iPhone 14 series at these discounted prices - Hindustan Times\",\n" +
            "      \"description\": \"The iPhone 14 series, the sixteenth and latest of Apple's flagship iPhones, was launched in September 2022.\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/technology/amazon-apple-day-sale-iphone-series-iphone-14-iphone14-plus-iphone-pro-iphone-14-pro-max-price-drop-101686628369934.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/13/1600x900/Apple_iPhone_14_1662573992688_1686628471980.jpeg\",\n" +
            "      \"publishedAt\": \"2023-06-13T04:42:57Z\",\n" +
            "      \"content\": \"Amazon's Apple Day Sale began on Tuesday and will be live till Saturday. As its name suggests, Apple products, including the iPhone 14 series, will be on sale, and customers can purchase these at a c… [+1205 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Quint\"\n" +
            "      },\n" +
            "      \"author\": \"Shivangani Singh\",\n" +
            "      \"title\": \"OnePlus's First Folding Smartphone To Launch Before August 19; Details Here - The Quint\",\n" +
            "      \"description\": \"OnePlus Fold will be launched in August as per the reports by the tipsters and news updates. Check the expected specs, features, and price in India\",\n" +
            "      \"url\": \"https://www.thequint.com/tech-and-auto/tech-news/onepluss-first-folding-smartphone-to-launch-in-august-expected-specs-price\",\n" +
            "      \"urlToImage\": \"https://images.thequint.com/thequint%2F2023-06%2F6342efe4-1a78-4000-8645-47ca90e03261%2F2023_06_13.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T04:29:24Z\",\n" +
            "      \"content\": \"OnePlus kept the buyers quite interested in the highly anticipated foldable smartphone, the OnePlus Fold. The smartphone will soon become a reality. According to a tipster, the company is all set to … [+566 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"9to5Mac\"\n" +
            "      },\n" +
            "      \"author\": \"Filipe Espósito\",\n" +
            "      \"title\": \"15-inch MacBook Air and Mac Pro orders arriving to customers - 9to5Mac\",\n" +
            "      \"description\": \"Apple announced three new Macs at WWDC 2023: a 15-inch MacBook Air, a new-generation Mac Studio, and the very first...\",\n" +
            "      \"url\": \"https://9to5mac.com/2023/06/12/15-inch-macbook-air-apple-silicon-mac-pro-orders/\",\n" +
            "      \"urlToImage\": \"https://i0.wp.com/9to5mac.com/wp-content/uploads/sites/6/2023/06/2023-New-Macs.jpg?resize=1200%2C628&quality=82&strip=all&ssl=1\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:43:00Z\",\n" +
            "      \"content\": \"Apple announced three new Macs at WWDC 2023: a 15-inch MacBook Air, a new-generation Mac Studio, and the very first Mac Pro with an Apple Silicon chip. These Macs went on pre-order last week, and now… [+2474 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Nintendo Life\"\n" +
            "      },\n" +
            "      \"author\": \"Liam Doolan\",\n" +
            "      \"title\": \"Just Dance 2024 Edition Brings The Party To Switch This October - Nintendo Life\",\n" +
            "      \"description\": \"Physical version includes code instead of a game card\",\n" +
            "      \"url\": \"https://www.nintendolife.com/news/2023/06/just-dance-2024-edition-brings-the-party-to-switch-this-october\",\n" +
            "      \"urlToImage\": \"https://images.nintendolife.com/80d7d3cb3792b/1280x720.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:30:00Z\",\n" +
            "      \"content\": \"Subscribe to Nintendo Life on YouTube\\r\\nDuring Ubisoft Forward today, Ubisoft announced Just Dance 2024 Edition would be launching on the Nintendo Switch on 24th October 2023. Like last year's release… [+997 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Livemint\",\n" +
            "      \"title\": \"Garena Free Fire Max redeem codes for June 13, 2023: Get revolt weapon loot crate, diamonds voucher, more | Mint - Mint\",\n" +
            "      \"description\": \"Garena Free Fire Max offers redeem codes for in-game items like weapons, diamonds and skins. Players can redeem daily codes for limited hours and for the first 500 users only. There is a dedicated microsite to redeem codes and a list of active codes available.\",\n" +
            "      \"url\": \"https://www.livemint.com/technology/tech-news/garena-free-fire-max-redeem-codes-for-june-13-2023-get-revolt-weapon-loot-crate-diamonds-voucher-more-11686623886165.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/Garena_Free_Fire_Max_1686545079791_1686624136392.webp\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:43:14Z\",\n" +
            "      \"content\": \"Garena Free Fire Max redeem codes can be used to win in-game items like weapons, diamonds, skins and more. These 12 digit alphanumeric codes consist of capital letters and numbers. For those unaware,… [+2004 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Tech\",\n" +
            "      \"title\": \"BGMI Redeem Codes for June 13: Grab freebies for Battlegrounds Mobile India this way! - HT Tech\",\n" +
            "      \"description\": \"BGMI Redeem Codes for June 13: If you’re a BGMI player, then you can grab the latest set of redeem codes for BGMI and unlock exciting and free rewards! Here’s how.\",\n" +
            "      \"url\": \"https://tech.hindustantimes.com/how-to/bgmi-redeem-codes-for-june-13-grab-freebies-for-battlegrounds-mobile-india-this-way-71686620158084.html\",\n" +
            "      \"urlToImage\": \"https://images.hindustantimes.com/tech/img/2023/06/13/1600x900/BGMI_Rising_1685629702207_1686620197495.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T01:39:55Z\",\n" +
            "      \"content\": \"The Skyesports Champions Series tournament, which began on June 9, is still going strong and will be live till June 18. It has been organized by Skyesports, a prominent esports and gaming enterprise,… [+1854 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val healthNewsArticle:String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India.com\"\n" +
            "      },\n" +
            "      \"author\": \"https://www.india.com/author/lifestylestaff/\",\n" +
            "      \"title\": \"Diabetes Diet: 6 Soluble Fiber Foods to Regulate Glucose Spike - India.com\",\n" +
            "      \"description\": \"Soluble fibers are good sources to include in the diet for keeping glucose spike in check.\",\n" +
            "      \"url\": \"https://www.india.com/health/diabetes-diet-6-soluble-fiber-foods-to-regulate-glucose-spike-6107964/\",\n" +
            "      \"urlToImage\": \"https://static.india.com/wp-content/uploads/2023/06/soluble-fiber.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T10:13:42Z\",\n" +
            "      \"content\": \"Soluble fibers are good sources to include in the diet for keeping glucose spike in check. \\r\\nLife with diabetes is not easy. There is a whole list of lifestyle changes, restrictions and additions one… [+2506 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Tech Explorist\"\n" +
            "      },\n" +
            "      \"author\": \"Vidya Nagalwade\",\n" +
            "      \"title\": \"Pregnancy is beneficial for women with multiple sclerosis - Tech Explorist\",\n" +
            "      \"description\": \"Benefits of pregnancy can lead to new treatments for multiple sclerosis.\",\n" +
            "      \"url\": \"https://www.techexplorist.com/pregnancy-beneficial-women-multiple-sclerosis/62051/\",\n" +
            "      \"urlToImage\": \"https://www.techexplorist.com/wp-content/uploads/2023/06/gravid-traning.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:51:46Z\",\n" +
            "      \"content\": \"Researchers have shown that the positive immune system modifications that typically occur during pregnancy help women with multiple sclerosis (MS) temporarily improve when pregnant. \\r\\nA particularly … [+5170 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Healthshots.com\"\n" +
            "      },\n" +
            "      \"author\": \"Arushi Bidhuri\",\n" +
            "      \"title\": \"High stomach acid: Signs you must not ignore and how to prevent it - Health shots\",\n" +
            "      \"description\": \"High stomach acid is one of the most common problems people face in their daily lives. From symptoms to preventive methods, here's everything you need to know about high stomach acid.\",\n" +
            "      \"url\": \"https://www.healthshots.com/preventive-care/self-care/high-stomach-acid-common-symptoms-and-how-to-prevent-it/\",\n" +
            "      \"urlToImage\": \"https://images.healthshots.com/healthshots/en/uploads/2023/06/13142130/high-stomach-acid.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:49:50Z\",\n" +
            "      \"content\": \"Did you know your stomach has its own line of acid production? This acid is scientifically known as gastric juice. It is like a superhero of pH that plays a crucial role in the breakdown and digestio… [+4547 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Positive Results For Potential First Chikungunya Vaccine - NDTV\",\n" +
            "      \"description\": \"NDTV.com: India, Business, Bollywood, Cricket, Video and Breaking News\",\n" +
            "      \"url\": \"https://www.ndtv.com/news\",\n" +
            "      \"urlToImage\": \"https://cdn.ndtv.com/common/images/ogndtv.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:34:40Z\",\n" +
            "      \"content\": \"If you're a climate change warrior or know people doing incredible work, submit your entries &amp; we'll share the most innovative stories globally.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"VOGUE India\"\n" +
            "      },\n" +
            "      \"author\": \"Irene Coltrinari\",\n" +
            "      \"title\": \"I have been eating Greek yoghurt for breakfast every morning for three years—here are all the benefits - VOGUE India\",\n" +
            "      \"description\": \"Why food is not only dietary but also a faithful ally of well-being\",\n" +
            "      \"url\": \"https://www.vogue.in/content/i-have-been-eating-greek-yoghurt-for-breakfast-every-morning-for-three-years-here-are-all-the-benefits\",\n" +
            "      \"urlToImage\": \"https://assets.vogue.in/photos/6488357e383d387166d522fa/16:9/w_1280,c_limit/Greek%20yoghurt.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:33:05Z\",\n" +
            "      \"content\": \"The first time I ate Greek yoghurt, I thought it didn't seem like a diet food at all. It was a day in May, and I had paired it with a strawberry on a hot early summer afternoon. It was one of the fir… [+4343 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Deccan Herald\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"(RM3) Red Mountain Weight Loss Pills Alternative and Diet Supplements - Deccan Herald\",\n" +
            "      \"description\": \"Introduction People always want to be fit and healthy. Being unfit brings many health problems and troubles. But, for many people, getting in shape is a hard goal. This article shows the five best supplements to help you reach this dream. Weight And Related P…\",\n" +
            "      \"url\": \"https://www.deccanherald.com/brandspot/sponsored/rm3-red-mountain-weight-loss-pills-alternative-and-diet-supplements-1227423.html\",\n" +
            "      \"urlToImage\": \"https://www.deccanherald.com/sites/dh/files/Pict%201065-1227423-1686648636.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:30:36Z\",\n" +
            "      \"content\": \"Introduction People always want to be fit and healthy. Being unfit brings many health problems and troubles. But, for many people, getting in shape is a hard goal. This article shows the five best su… [+23375 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"ET HealthWorld\",\n" +
            "      \"title\": \"Overactive inflammatory response could be at the root of long COVID: Study - ETHealthWorld\",\n" +
            "      \"description\": \"Looking at blood samples from 25 people who had had COVID but recovered, and from 25 volunteers who had never had COVID to their knowledge, the scientists found that those without long COVID did not show the same signs of inflammation in their blood.\",\n" +
            "      \"url\": \"https://health.economictimes.indiatimes.com/news/industry/overactive-inflammatory-response-could-be-at-the-root-of-long-covid-study/100962067\",\n" +
            "      \"urlToImage\": \"https://etimg.etb2bimg.com/thumb/msid-100962067,imgsize-18500,width-1200,height=765,overlay-ethealth/industry/overactive-inflammatory-response-could-be-at-the-root-of-long-covid-study.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:30:00Z\",\n" +
            "      \"content\": \"New Delhi: An overactive inflammatory response could be at the root of many long COVID cases, according to new research. A set of molecules associated with inflammation was found in the blood protein… [+3104 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"TIMESOFINDIA.COM\",\n" +
            "      \"title\": \"Shenaz Treasury diagnosed with hypothyroidism: Know what it is and what are the symptoms - Times of India\",\n" +
            "      \"description\": \"Actor Shenaz Treasury has revealed that she has been diagnosed with hypothyroidism. She has shared a video of her drinking apple cider vinegar which s\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/life-style/health-fitness/health-news/shenaz-treasury-diagnosed-with-hypothyroidism-know-what-it-is-and-what-are-the-symptoms/articleshow/100961391.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100961361,width-1070,height-580,imgsize-1733223,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:58:00Z\",\n" +
            "      \"content\": \"How to know if your forgetfulness is no longer normalForgetting minor things is normal with age but if it starts to prevent you from living a productive life, it should be a matter of concern. In thi… [+80 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Economist\",\n" +
            "      \"title\": \"How the new generation of weight-loss drugs work | Mint - Mint\",\n" +
            "      \"description\": \"They were intended to treat diabetes. Their other benefits were discovered by accident\",\n" +
            "      \"url\": \"https://www.livemint.com/science/health/how-the-new-generation-of-weight-loss-drugs-work-11686645916354.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/USA-HEALTH--3_1686646161301_1686646201343.JPG\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:56:07Z\",\n" +
            "      \"content\": \"This article is part of our Summer reads series. Visit the full collection for book lists, guest essays and more seasonal distractions. Weight-loss drugs are everywhere. In newspapers, on social medi… [+4070 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Mid-day\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Chronic exposure to lead, cadmium & arsenic linked to increased risk of heart diseases - mid-day.com\",\n" +
            "      \"description\": \"Even low-level exposure to contaminant metals is near-universal and contributes to the burden of cardiovascular disease, especially heart attacks, stroke, disease of the arteries to the legs and premature death from cardiac causes\",\n" +
            "      \"url\": \"https://www.mid-day.com/lifestyle/health-and-fitness/article/chronic-exposure-to-lead-cadmium-and-arsenic-linked-to-increased-risk-of-heart-disease-23292037\",\n" +
            "      \"urlToImage\": \"https://images.mid-day.com/images/images/2023/jun/heartdiseasescontaminationmidday_d.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:51:00Z\",\n" +
            "      \"content\": \"Even low-level exposure to contaminant metals is near-universal and contributes to the burden of cardiovascular disease, especially heart attacks, stroke, disease of the arteries to the legs and prem… [+3465 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India.com\"\n" +
            "      },\n" +
            "      \"author\": \"Jigyasa Sahay\",\n" +
            "      \"title\": \"Top 10 Indian States With High Diabetes Rate - India.com\",\n" +
            "      \"description\": \"According to the recent ICMR backed research published in Lancet, India has  over 100 million people suffering from diabetes. Here are top worst affected states.\",\n" +
            "      \"url\": \"https://www.india.com/webstories/health/top-10-indian-states-with-high-diabetes-rate-goa-puducherry-kerala-6107601/\",\n" +
            "      \"urlToImage\": \"https://static.india.com/wp-content/uploads/2023/06/diabettes-state3.jpeg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:36:46Z\",\n" +
            "      \"content\": \"According to a recent study backed by ICMR and published in Lancet, over 100 million Indians are diabetic\\r\\n1. Goa has highest percentage of diabetic people -26.4 %\\r\\n2. Puducherry with - 26.3\\r\\n4. Chan… [+273 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Zoom\"\n" +
            "      },\n" +
            "      \"author\": \"Ashima Sharda Mahindra\",\n" +
            "      \"title\": \"Are you diabetic and in love with mangoes? Know how safe it is for your blood sugar levels - Times Now\",\n" +
            "      \"description\": \"King of fruits – the delicious mangoes are enjoyed by all, however, those suffering from diabetes are always in a dilemma – whether to eat or not. Despite being packed with minerals and nutrients, the fruit is suspected of increasing blood sugar levels. But, …\",\n" +
            "      \"url\": \"https://www.timesnownews.com/health/are-you-diabetic-and-in-love-with-mangoes-know-how-safe-it-is-for-your-blood-sugar-levels-article-100959768\",\n" +
            "      \"urlToImage\": \"https://static.tnn.in/thumb/msid-100959768,updatedat-1686644969129,width-1280,height-720,resizemode-75/100959768.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:29:00Z\",\n" +
            "      \"content\": \"Adipurush Tickets SOLD OUT At Delhi For Rs 2000. Here's How Much YOU Need To Pay In Mumbai, Kolkata, Bangalore\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Editorji.com\"\n" +
            "      },\n" +
            "      \"author\": \"Editorji\",\n" +
            "      \"title\": \"Women who started taking contraceptive pill as teens have 130% higher rate of depression: Study - Editorji\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.editorji.com/lifestyle-news/health/women-who-started-taking-contraceptive-pill-as-teens-have-130-higher-rate-of-depression-study-1686643753875\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T08:09:13Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Business Standard\"\n" +
            "      },\n" +
            "      \"author\": \"Business Standard\",\n" +
            "      \"title\": \"Pfizer and GSK to battle for share of new RSV vaccine market: Report - Business Standard\",\n" +
            "      \"description\": \"US drugmaker Pfizers and British pharma major GSK are likely to face significant competition in the respiratory syncytial virus (RSV) vaccine market, according to a report on Tuesday\",\n" +
            "      \"url\": \"https://www.business-standard.com/companies/news/pfizer-and-gsk-to-battle-for-share-of-new-rsv-vaccine-market-report-123061300331_1.html\",\n" +
            "      \"urlToImage\": \"https://bsmedia.business-standard.com/_media/bs/img/article/2023-03/14/full/1678794082-0665.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:02:29Z\",\n" +
            "      \"content\": \"US drugmaker Pfizers and British pharma major GSK are likely to face significant competition in the respiratory syncytial virus (RSV) vaccine market, according to a report on Tuesday.\\r\\nGSK's novel va… [+2798 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Healthnews.com\"\n" +
            "      },\n" +
            "      \"author\": \"Healthnews.com\",\n" +
            "      \"title\": \"Can Thyroid Issues Cause Hair Loss? | HealthNews - Healthnews.com\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://healthnews.com/health-conditions/endocrine-disorders/can-thyroid-cause-hair-loss/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T07:38:56Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Indian Express\"\n" +
            "      },\n" +
            "      \"author\": \"Anuradha Mascarenhas\",\n" +
            "      \"title\": \"Can Metformin reduce risk of long Covid by 40 per cent? Experts still wary of new study - The Indian Express\",\n" +
            "      \"description\": \"The results of the trial will not be applicable to everyone with acute COVID-19 because the definition of long Covid has been evolving throughout the pandemic, and basing efficacy analysis of the drug for preventing it can be tricky. More trials are needed, s…\",\n" +
            "      \"url\": \"https://indianexpress.com/article/health-wellness/can-metformin-reduce-risk-long-covid-40-per-cent-experts-wary-new-study-8660064/\",\n" +
            "      \"urlToImage\": \"https://images.indianexpress.com/2023/06/long-covid.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:00:11Z\",\n" +
            "      \"content\": \"Taking a two-week course of Metformin, a safe and affordable diabetes medication, after testing positive for SARS-CoV-2 may reduce long COVID chances by 40 per cent. A study, published in The Lancet … [+5090 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Expresshealthcare.in\"\n" +
            "      },\n" +
            "      \"author\": \"EH News Bureau\",\n" +
            "      \"title\": \"The importance of adult vaccination - Express Healthcare\",\n" +
            "      \"description\": \"Dr Pullela Srikar Krishna, MD-General Medicine, Consultant, Apollo Clinic highlights that the development and deployment of COVID-19 vaccines have underscored the importance of vaccinating adults to control the spread of infectious diseases and protect indivi…\",\n" +
            "      \"url\": \"https://www.expresshealthcare.in/news/the-importance-of-adult-vaccination/439599/\",\n" +
            "      \"urlToImage\": \"https://cdn.expresshealthcare.in/wp-content/uploads/2023/06/13115601/New-Project-2023-06-13T115515.631.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:28:08Z\",\n" +
            "      \"content\": \"Dr Pullela Srikar Krishna, MD-General Medicine, Consultant, Apollo Clinic highlights that the development and deployment of COVID-19 vaccines have underscored the importance of vaccinating adults to … [+7199 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Thehealthsite.com\"\n" +
            "      },\n" +
            "      \"author\": \"Satata Karmakar\",\n" +
            "      \"title\": \"Turmeric For High Cholesterol: How Haldi Powder Helps In Managing Blood Cholesterol Levels | TheHealthSite - TheHealthSite\",\n" +
            "      \"description\": \"Does turmeric help in managing blood cholesterol levels? Read on to know the truth. TheHealthSite.com\",\n" +
            "      \"url\": \"https://www.thehealthsite.com/home-remedies/turmeric-for-high-cholesterol-how-haldi-powder-helps-in-managing-blood-cholesterol-levels-984644/\",\n" +
            "      \"urlToImage\": \"https://st1.thehealthsite.com/wp-content/uploads/2023/06/Turmeric-4.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:22:00Z\",\n" +
            "      \"content\": \"Turmeric For High Cholesterol: How Haldi Powder Helps In Managing Blood Cholesterol Levels\\r\\nDoes turmeric help in managing blood cholesterol levels? Read on to know the truth.\\r\\nCholesterol is a waxy … [+5341 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Mumbailive.com\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Vaginal Prolapse: Symptoms, treatments and precautions - Here's all you need to know - Mumbai Live\",\n" +
            "      \"description\": \"The vagina is one of several organs located in the pelvic region Muscles and other tissue hold these organs in place These muscles work together to form a structure known as the pelvic floor This support structure can begin to deteriorate over time This can h…\",\n" +
            "      \"url\": \"https://www.mumbailive.com/en/lifestyle/vaginal-prolapse-symptoms-treatments-and-precautions-79127\",\n" +
            "      \"urlToImage\": \"https://www.mumbailive.com/images/news/Diabetes-During-Pregnancy_1510314841186.jpg?bg=e2ded9&crop=1368%2C768%2C0%2C0&fit=fill&fm=webp&h=606.3157894736842&height=768&w=1080&width=1368\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:00:00Z\",\n" +
            "      \"content\": \"The vagina is one of several organs located in the pelvic region. Muscles and other tissue hold these organs in place. These muscles work together to form a structure known as the pelvic floor. This … [+4153 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"ANI\",\n" +
            "      \"title\": \"How brain waves can predict cognitive impairment in Parkinson's disease: Study - Hindustan Times\",\n" +
            "      \"description\": \"The study states that brain waves can help in predicting cognitive impairment in Parkinson's disease, thereby aiding in better treatment. | Health\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/lifestyle/health/how-brain-waves-can-predict-cognitive-impairment-in-parkinsons-disease-study-101686633952393.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/13/1600x900/_3e20e778-4650-11ea-8b8c-fba542a06006_1686634203125.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:34:27Z\",\n" +
            "      \"content\": \"For Parkinson's disease (PD) patients, a few minutes of data collected from a single electrode put on top of the head may be sufficient to anticipate cognitive issues, including dementia.\\r\\nHow brain … [+4648 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val sportsNewsArticle:String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Manish Kumar\",\n" +
            "      \"title\": \"WTC Final Poll results: Fans blame Ashwin's exclusion and IPL for India's defeat against Australia | Cricket News - Indiatimes.com\",\n" +
            "      \"description\": \"Cricket News: The sound 209-run thrashing that Team India received at the hands of Australia in the World Test Championship final at The Oval last weekend has hurt\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/sports/cricket/icc-world-test-championship/wtc-final-poll-results-fans-blame-ashwins-exclusion-and-ipl-for-indias-defeat-against-australia/articleshow/100963012.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100962912,width-1070,height-580,imgsize-77668,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:50:00Z\",\n" +
            "      \"content\": \"Time for Team India to bite the transition bullet?\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": \"NDTV Sports Desk\",\n" +
            "      \"title\": \"\\\"Go And Hammer West Indies 2-0, 3-0\\\": Sunil Gavaskar Launches Scathing Attack At Indian Team - NDTV Sports\",\n" +
            "      \"description\": \"India's forgettable outing at the World Test Championship final against Australia has left the legendary batter Sunil Gavaskar fuming with anger.\",\n" +
            "      \"url\": \"https://sports.ndtv.com/cricket/go-and-hammer-west-indies-2-0-3-0-sunil-gavaskar-launches-scathing-attack-at-indian-team-4113980\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2023-06/h57hocfg_sunil-gavaskar_650x300_12_June_23.jpg?im=FitAndFill,algorithm=dnn,width=1200,height=675\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:16:00Z\",\n" +
            "      \"content\": \"India's forgettable outing at the World Test Championship final against Australia has left the legendary batter Sunil Gavaskar fuming with anger. The former India skipper spoke very critically about … [+2315 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Psgtalk.com\"\n" +
            "      },\n" +
            "      \"author\": \"Eduardo\",\n" +
            "      \"title\": \"PSG Shuts Down Real Madrid’s Hopes for Mbappé Transfer- Report - PSG Talk\",\n" +
            "      \"description\": \"According to a report out of Spain, Paris Saint-Germain is open to selling Kylian Mbappé, but they don't intend to sell to Real Madrid.\",\n" +
            "      \"url\": \"https://psgtalk.com/2023/06/psg-shuts-down-real-madrids-hopes-for-mbappe-transfer-report/\",\n" +
            "      \"urlToImage\": \"https://icdn.psgtalk.com/wp-content/uploads/2022/10/kylian-mbappe-psg-v-marseille-ligue-1-2022.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:03:33Z\",\n" +
            "      \"content\": \"Kylian Mbappé appears to be on his way out as the 24-year-old informed Paris Saint-Germain that he does not plan to exercise the one-year option in his contract.\\r\\nFurthermore, reports suggest that th… [+978 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India.com\"\n" +
            "      },\n" +
            "      \"author\": \"https://www.india.com/author/sportsdesk/\",\n" +
            "      \"title\": \"LIVE Updates | ODI World Cup 2023 Schedule: BIG Announcement Anytime NOW - India.com\",\n" +
            "      \"description\": \"LIVE Updates | ICC World Cup 2023: The Final Schedule is set to be released soon. The much venue for the much anticipated India vs Pakistan clash will be revealed in the ICC Meeting.\",\n" +
            "      \"url\": \"https://www.india.com/sports/live-updates-odi-world-cup-2023-schedule-venues-timing-dates-fixtures-teams-squads-june-13-tuesday-india-vs-pakistan-oct-15-ahmedabad-icc-world-cup-live-streaming-rohit-virat-gill-hardik-cricket-news-6105319/\",\n" +
            "      \"urlToImage\": \"https://static.india.com/wp-content/uploads/2023/06/ODI-WC-2023-Schedule.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:25:18Z\",\n" +
            "      \"content\": \"LIVE Updates | ICC World Cup 2023: The Final Schedule is set to be released soon. The much venue for the much anticipated India vs Pakistan clash will be revealed in the ICC Meeting.\\r\\nODI WC 2023 Sch… [+2338 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": \"NDTV Sports Desk\",\n" +
            "      \"title\": \"\\\"Never Going To Be Happy...\\\": Rahul Dravid's Blunt Take On WTC Final Preparation - NDTV Sports\",\n" +
            "      \"description\": \"India's wait for their next ICC trophy continues as they lost to Australia in the World Test Championship final on Sunday at The Oval.\",\n" +
            "      \"url\": \"https://sports.ndtv.com/cricket/never-going-to-be-happy-rahul-dravids-blunt-take-on-wtc-final-preparation-4112595\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2023-03/7v2ldgro_rahul-dravid_625x300_13_March_23.jpg?im=FeatureCrop,algorithm=dnn,width=1200,height=675\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:36:53Z\",\n" +
            "      \"content\": \"India's wait for their next ICC trophy continues as they lost to Australia in the World Test Championship final on Sunday at The Oval. Needing 280 runs to win with seven wickets in hand on Day 5, Tea… [+2163 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Feroz Khan\",\n" +
            "      \"title\": \"'Fake Confidence by Winning on Bad Pitches': Harbhajan Singh Blasts Indian Team After WTC Final Defeat - News18\",\n" +
            "      \"description\": \"Harbhajan Singh blamed the spin-friendly pitches in home conditions for India's shoddy display in the WTC final\",\n" +
            "      \"url\": \"https://www.news18.com/cricketnext/wtc-final-india-cricket-team-harbhajan-singh-ind-vs-aus-pitches-spinners-fast-bowlers-8065987.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/harbhajan-singh-india-cricket-team-168663797716x9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:34:19Z\",\n" +
            "      \"content\": \"India qualified for the final of the ICC World Test Championship final by ensuring a second spot in the standings. They lost to Australia in the summit clash, a team they beat 2-1 during the Border G… [+1845 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Crictracker.com\"\n" +
            "      },\n" +
            "      \"author\": \"CricTracker Staff\",\n" +
            "      \"title\": \"TNPL 2023: Match 2, SS vs CSG Match Prediction – Who will win today’s TNPL match between Salem Spartans and Chepauk Super Gillies? - CricTracker\",\n" +
            "      \"description\": \"The seventh edition of the TNPL is all set to continue on Day 2 of the competition with Salem Spartans (SS) and four-time champions Chepauk Super Gillies (CSG) taking on each other on June 13, Tuesday\",\n" +
            "      \"url\": \"https://www.crictracker.com/cricket-match-predictions/tnpl-2023-match-2-ss-vs-csg-match-prediction-who-will-win-todays-tnpl-match-between-salem-spartans-and-chepauk-super-gillies/\",\n" +
            "      \"urlToImage\": \"https://media.crictracker.com/media/featureimage/Chepauk-Super-Gillies.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:00:00Z\",\n" +
            "      \"content\": \"The seventh edition of the TNPL is all set to continue on Day 2 of the competition with Salem Spartans (SS) and four-time champions Chepauk Super Gillies (CSG) taking on each other on June 13, Tuesda… [+2306 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": \"Press Trust of India\",\n" +
            "      \"title\": \"\\\"Virat Kohli And Ajinkya Rahane Needed To...\\\": Glenn McGrath On India's WTC Final Defeat - NDTV Sports\",\n" +
            "      \"description\": \"India suffered a crushing 209-run defeat to Australia on the fifth day of the summit clash at the Oval on Sunday.\",\n" +
            "      \"url\": \"https://sports.ndtv.com/cricket/virat-kohli-and-ajinkya-rahane-needed-to-glnn-mcgrath-on-indias-wtc-final-defeat-4115851\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2023-06/koud85ag_virat-kohli-and-ajinkya-rahane-afp_625x300_13_June_23.jpg?im=FitAndFill,algorithm=dnn,width=1200,height=675\",\n" +
            "      \"publishedAt\": \"2023-06-13T04:49:32Z\",\n" +
            "      \"content\": \"\\\"Sometimes it can happen\\\", was what fast bowling legend Glenn McGrath said on Monday about India's capitulation in the World Test Championship final against Australia in London. India suffered a crus… [+3415 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Sportskeeda\"\n" +
            "      },\n" +
            "      \"author\": \"Kartik Iyer\",\n" +
            "      \"title\": \"\\\"Only one batter from our WTC final team has an average over 40 in this decade\\\" - Aakash Chopra on Indian batters' poor Test numbers since 2020 - Sportskeeda\",\n" +
            "      \"description\": \"Aakash Chopra has highlighted the Indian batters' underwhelming Test numbers in the last few years.\",\n" +
            "      \"url\": \"https://www.sportskeeda.com/cricket/news-only-one-batter-wtc-final-team-average-40-decade-aakash-chopra-indian-batters-poor-test-numbers-since-2020\",\n" +
            "      \"urlToImage\": \"https://staticc.sportskeeda.com/editor/2023/06/b812f-16866258867245-1920.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:58:34Z\",\n" +
            "      \"content\": \"Aakash Chopra has highlighted the Indian batters' underwhelming Test numbers in the last few years.\\r\\nRohit Sharma and Co. suffered a 209-run loss in the World Test Championship (WTC) final at the Ova… [+2579 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Arani Basu\",\n" +
            "      \"title\": \"Transition pangs: No 'A' tours, Indian cricket feeder line dries up - Indiatimes.com\",\n" +
            "      \"description\": \"Cricket News: When Rishabh Pant and Washington Sundar were pulling off a heist against Australia at the Gabba in January 2021, they represented the strong feeder sy\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/sports/cricket/icc-world-test-championship/transition-pangs-no-a-tours-indian-cricket-feeder-line-dries-up/articleshow/100952918.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100952908,width-1070,height-580,imgsize-36132,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:27:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"ESPN India\"\n" +
            "      },\n" +
            "      \"author\": \"Ohm Youngmisuk\",\n" +
            "      \"title\": \"Nuggets star Nikola Jokic named NBA Finals MVP - ESPN - ESPN India\",\n" +
            "      \"description\": \"Nuggets star Nikola Jokic was named NBA Finals MVP after leading Denver to the NBA title over Miami.\",\n" +
            "      \"url\": \"https://www.espn.in/nba/story/_/id/37844421/nuggets-star-nikola-jokic-named-nba-finals-mvp\",\n" +
            "      \"urlToImage\": \"https://a.espncdn.com/combiner/i?img=%2Fphoto%2F2023%2F0613%2Fr1185896_1296x729_16%2D9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:14:00Z\",\n" +
            "      \"content\": \"DENVER -- Nikola Jokic didn't win his third straight Most Valuable Player award this season, but he still ended up with an MVP trophy after all.\\r\\nIn addition to getting the championship he has covete… [+9087 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": \"NDTV Sports Desk\",\n" +
            "      \"title\": \"Watch: Cows Invade Field In Village Cricket, Forces Players To Stop Match - NDTV Sports\",\n" +
            "      \"description\": \"A video is going viral on social media in which three cows could be seen invading the ground with the match going on. It is interesting to note that the cows made their way to the playing area despite some really good fencing around the ground.\",\n" +
            "      \"url\": \"https://sports.ndtv.com/cricket/i-cant-speak-cows-invade-field-in-village-cricket-forces-players-to-stop-match-watch-4115804\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2023-06/td3n6te_cows-twitter_625x300_12_June_23.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T03:10:26Z\",\n" +
            "      \"content\": \"Cricket is an amazing game! From batting masterclass to sensational bowling to breathtaking fielding, it certainly has everything to impress the spectators. Besides the performance of the players wha… [+1464 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Manchester Evening News\"\n" +
            "      },\n" +
            "      \"author\": \"Manchester Evening News\",\n" +
            "      \"title\": \"Harry Kane alternative and Jadon Sancho exit - Manchester United 2023/2024 transfer predictions - Manchester Evening News\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.manchestereveningnews.co.uk/sport/football/football-news/manchester-united-summer-transfer-window-27107014\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T03:00:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Sports Desk\",\n" +
            "      \"title\": \"'Jaiswal... Sarfaraz... Mukesh...': Karthik's solution to India for Test revamp - Hindustan Times\",\n" +
            "      \"description\": \"Dinesh Karthik named some players who could be slotted into India's Test squad after their defeat in the WTC final. | Cricket\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/cricket/yashasvi-jaiswal-sarfaraz-khan-mukesh-kumar-dinesh-karthiks-solution-to-india-for-test-squad-revamp-101686578292934.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/12/1600x900/wttt_1686578627881_1686578669383.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:52:08Z\",\n" +
            "      \"content\": \"India crashed to a humiliating defeat against Australia in the WTC final, at The Oval in London. The match, which took place from June 7-11, ended in the first session of Day 5. Having secured a 209-… [+3361 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Crictoday.com\"\n" +
            "      },\n" +
            "      \"author\": \"Venkat Narayanan\",\n" +
            "      \"title\": \"Ruturaj Gaikwad dedicates his engagement to people of Chennai - Crictoday.com (Cricket News) \",\n" +
            "      \"description\": \"Chennai Super Kings' opening batsman, Ruturaj Gaikwad, has dedicated his engagement to the people of Chennai\",\n" +
            "      \"url\": \"http://crictoday.com/cricket/daily-cricket-news/ruturaj-gaikwad-dedicates-his-engagement-to-people-of-chennai/\",\n" +
            "      \"urlToImage\": \"https://crictoday.com/wp-content/uploads/2023/06/Ruturaj-Gaikwad.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:31:54Z\",\n" +
            "      \"content\": \"Chennai Super Kings’ opening batsman, Ruturaj Gaikwad, has dedicated his engagement to the people of Chennai. Gaikwad tied the knot with Utkarsha Pawar, a fellow cricketer from Maharashtra who has pl… [+893 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Zoom\"\n" +
            "      },\n" +
            "      \"author\": \"TN Sports Desk\",\n" +
            "      \"title\": \"CSK's Tushar Deshpande Gets Engaged To His 'School Crush', Ruturaj Gaikwad Welcomes Him To the Club - See Post - Times Now\",\n" +
            "      \"description\": \"\u200BMumbai and Chennai Super Kings pacer Tushar Deshpande\u200B got engaged to his school crush Nabha Gaddamwar as Ruturaj Gaikwad welcomed him to the club. Deshpande's Mumbai and CSK teammates congratulated the couple as they exchanged rings kept on a cricket ball i…\",\n" +
            "      \"url\": \"https://www.timesnownews.com/sports/cricket/csks-tushar-deshpande-gets-engaged-to-his-school-crush-ruturaj-gaikwad-welcomes-him-to-the-club-see-post-article-100950451\",\n" +
            "      \"urlToImage\": \"https://static.tnn.in/thumb/msid-100950451,updatedat-1686621434403,width-1280,height-720,resizemode-75/100950451.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:30:52Z\",\n" +
            "      \"content\": \"Adipurush Advance Booking: Prabhas, Kriti Sanon Film Sells Over 1 Lakh Tickets. Has It Crossed Rs 100-Crore Mark Already?\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Barca Blaugranes\"\n" +
            "      },\n" +
            "      \"author\": \"Gill Clark\",\n" +
            "      \"title\": \"Frenkie de Jong talks Sergio Busquets leaving and Barcelona missing out on Lionel Messi - Barca Blaugranes\",\n" +
            "      \"description\": \"The midfielder has had his say\",\n" +
            "      \"url\": \"https://www.barcablaugranes.com/2023/6/13/23757700/frenkie-de-jong-talks-sergio-busquets-leaving-and-barcelona-missing-out-on-lionel-messi\",\n" +
            "      \"urlToImage\": \"https://cdn.vox-cdn.com/thumbor/b15eOFipfV8OAbz6VAf43EExRX8=/0x0:4071x2131/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/24718937/1496067899.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:00:00Z\",\n" +
            "      \"content\": \"Frenkie de Jong is currently away on international duty with the Netherlands but has given a couple of interviews to discuss recent events.\\r\\nThe midfielder spoke to Voetbal International about Sergio… [+1022 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Sportskeeda\"\n" +
            "      },\n" +
            "      \"author\": \"Urvi Mehra\",\n" +
            "      \"title\": \"Serena Williams congratulates Novak Djokovic on joining her as a 23-time Grand Slam champion - Sportskeeda\",\n" +
            "      \"description\": \"Serena Williams recently conveyed her congratulatory wishes for Novak Djokovic after the Serb won the 2023 French Open, tying her record for 23 Grand Slam titles.\",\n" +
            "      \"url\": \"https://www.sportskeeda.com/tennis/news-serena-williams-congratulates-novak-djokovic-joining-23-time-grand-slam-champion\",\n" +
            "      \"urlToImage\": \"https://staticc.sportskeeda.com/editor/2023/06/d8a5d-16866206587802-1920.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T01:50:00Z\",\n" +
            "      \"content\": \"Serena Williams recently conveyed her congratulatory wishes for Novak Djokovic after the Serb won the 2023 French Open, tying her record for 23 Grand Slam titles.\\r\\nFollowing his triumph at the 2023 A… [+2435 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Sports Desk\",\n" +
            "      \"title\": \"'No cricketer treated as bafflingly as Ashwin': Gavaskar calls out Rohit, Dravid - Hindustan Times\",\n" +
            "      \"description\": \"On the Ashwin conundrum, Gavaskar has landed fresh punches on not only the current regime of Rohit and Dravid but their predecessors Kohli and Shastri as well. | Cricket\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/cricket/no-other-indian-cricketer-has-been-treated-as-bafflingly-as-ashwin-gavaskar-calls-out-rohit-dravid-kohli-shastri-101686581772512.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/12/1600x900/gavaskar-ashwin-getty_1686582032103_1686582036976.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T01:49:09Z\",\n" +
            "      \"content\": \"It has been two days since India faced a humiliating 209-run defeat in the World Test Championship final against Australia, but with many still nursing the wounds of another painful squandering of an… [+4016 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Sports Desk\",\n" +
            "      \"title\": \"'Only Virat can reveal why…': Ganguly's blockbuster truth on Kohli controversy - Hindustan Times\",\n" +
            "      \"description\": \"Sourav Ganguly had earlier claimed that the BCCI requested Virat Kohli to not relinquish the leadership role at Team India. | Cricket\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/cricket/rohit-sharma-the-best-option-sourav-ganguly-bombshell-revelation-virat-kohli-test-captaincy-saga-ind-vs-aus-wtc-final-101686590807576.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/12/1600x900/kohli_ganguly_getty_imagesss_1686601070276_1686601077748.JPG\",\n" +
            "      \"publishedAt\": \"2023-06-13T01:39:45Z\",\n" +
            "      \"content\": \"Former Board of Control for Cricket in India (BCCI) president Sourav Ganguly has issued an eye-catching statement about Virat Kohli after Team India's heartbreaking loss to Australia in the ICC World… [+2744 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val scienceNewsArticle: String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Nature.com\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Anticancer activity of lactoferrin-coated biosynthesized selenium nanoparticles for combating different human cancer cells via mediating apoptotic effects | Scientific Reports - Nature.com\",\n" +
            "      \"description\": \"Scientific Reports - Anticancer activity of lactoferrin-coated biosynthesized selenium nanoparticles for combating different human cancer cells via mediating apoptotic effects\",\n" +
            "      \"url\": \"https://www.nature.com/articles/s41598-023-36492-8\",\n" +
            "      \"urlToImage\": \"https://media.springernature.com/m685/springer-static/image/art%3A10.1038%2Fs41598-023-36492-8/MediaObjects/41598_2023_36492_Fig1_HTML.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:33:59Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Indian Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Indian Express\",\n" +
            "      \"title\": \"Hubble captures a jellyfish galaxy 700 million light-years away - The Indian Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://indianexpress.com/article/technology/science/hubble-jellyfish-galaxy-8660594/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T09:31:17Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Nanowerk\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Treadmill for microswimmers allows closer look at behavior - Nanowerk\",\n" +
            "      \"description\": \"Scientists created an acoustic microfluidic method that offers new opportunities to conduct experiments with swimming cells and microorganisms.\",\n" +
            "      \"url\": \"https://www.nanowerk.com/nanotechnology-news2/newsid=63157.php\",\n" +
            "      \"urlToImage\": \"https://www.nanowerk.com/nanotechnology-news2/id63157.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:17:56Z\",\n" +
            "      \"content\": \"Nanowerk Newsletter\\r\\nGet our daily Nanotechnology News to your inbox!\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News-Medical.Net\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Empowering aging adults: waist-worn sensors may revolutionize independent activity monitoring and promote healthy aging - News-Medical.Net\",\n" +
            "      \"description\": \"Researchers investigated whether waist-mounted sensors could evaluate gait parameters in older adults.\",\n" +
            "      \"url\": \"https://www.news-medical.net/news/20230613/Empowering-aging-adults-waist-worn-sensors-may-revolutionize-independent-activity-monitoring-and-promote-healthy-aging.aspx\",\n" +
            "      \"urlToImage\": \"https://d2jx2rerrg6sh3.cloudfront.net/images/news/ImageForNews_750836_16866465980048218.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:59:00Z\",\n" +
            "      \"content\": \"In a recent study published in PLOS ONE, researchers investigated whether waist-mounted sensors could evaluate gait parameters reflecting older adults' speed, distance covered, and physical activity … [+5052 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Buzz Staff\",\n" +
            "      \"title\": \"NASA Is Growing Flower In The Space And It's Spectacular - News18\",\n" +
            "      \"description\": \"NASA has been conducting plant studies in space since the 1970s, but this particular experiment, was initiated by astronaut Kjell Lindgren in 2015.\",\n" +
            "      \"url\": \"https://www.news18.com/viral/nasa-is-growing-flower-in-the-space-and-its-spectacular-8067481.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/harshit-pandey-98-168664590516x9.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:46:02Z\",\n" +
            "      \"content\": \"NASA continues to captivate the world with its latest revelation. This time, the focus is not on distant celestial bodies or breathtaking images captured by telescopes, but rather on a stunning flowe… [+2295 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Editorji.com\"\n" +
            "      },\n" +
            "      \"author\": \"Editorji\",\n" +
            "      \"title\": \"Brightest Gamma-Ray burst shatters existing models: Check details - Editorji\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.editorji.com/tech-news/brightest-gamma-ray-burst-shatters-existing-models-check-details-1686645440673\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T08:37:20Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Weather Channel\"\n" +
            "      },\n" +
            "      \"author\": \"The Weather Channel\",\n" +
            "      \"title\": \"Fungi Lock Away Over One-Third of Global Fossil Fuel Emissions In the Soil! | Weather.com - The Weather Channel\",\n" +
            "      \"description\": \"The massive underground network of fungi could end up storing about 13 gigatons of carbon every year. This is the equivalent of 36% of total global fossil fuel emissions — more than China emits annually!\",\n" +
            "      \"url\": \"https://weather.com/en-IN/india/climate-change/news/2023-06-13-fungi-lock-one-third-of-global-fossil-fuel-emissions-in-soil\",\n" +
            "      \"urlToImage\": \"https://s.w-x.co/in-mushroom_farm.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:26:32Z\",\n" +
            "      \"content\": \"Did you know that the largest organism in the world might actually be a fungus? The enormous Armillaria ostoyae fungus spans about 10 square kilometres of intricate underground roots underneath the M… [+2350 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"THE WEEK\"\n" +
            "      },\n" +
            "      \"author\": \"Web Desk\",\n" +
            "      \"title\": \"Lunar enigma: Could the Moon harbor microbial life? NASA researchers weigh in - The Week\",\n" +
            "      \"description\": \"In a groundbreaking revelation, NASA scientists suggest that the Moon, long considered a lifeless celestial body, may harbor microbial life in its dark craters located at the lunar south pole. Prabal Saxena, a planetary researcher at NASA's Goddard Space Flig…\",\n" +
            "      \"url\": \"https://www.theweek.in/news/sci-tech/2023/06/13/lunar-enigma-could-the-moon-harbor-microbial-life-nasa-researche.html\",\n" +
            "      \"urlToImage\": \"https://www.theweek.in/content/dam/week/news/2022/images/2023/2/moon-An-aircraft-passes-by-the-moon-in-Frankfurt-Germany-ap.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:17:04Z\",\n" +
            "      \"content\": \"<ul><li>NASA scientists propose microbial life may exist in Moon's dark craters</li><li>Studies have provided compelling evidence for the survival of microorganisms in extreme environments</li><li>Hu… [+3394 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Science Daily\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"New method enables study of nano-sized particles - Science Daily\",\n" +
            "      \"description\": \"Researchers have created a new method of studying the smallest bioparticles in the body. The study has considerable scientific potential, such as in the development of more effective vaccines.\",\n" +
            "      \"url\": \"https://www.sciencedaily.com/releases/2023/06/230612114628.htm\",\n" +
            "      \"urlToImage\": \"https://www.sciencedaily.com/images/scidaily-icon.png\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:15:32Z\",\n" +
            "      \"content\": \"Researchers at Karolinska Institutet have created a new method of studying the smallest bioparticles in the body. The study, which is published in Nature Biotechnology, has considerable scientific po… [+1373 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Transcontinentaltimes.com\"\n" +
            "      },\n" +
            "      \"author\": \"Aditya Saikrishna\",\n" +
            "      \"title\": \"The Fermi-Pasta-Ulam-Tsingou Paradox Reveals Astonishing Insights into Nonlinear Dynamics - Transcontinental Times\",\n" +
            "      \"description\": \"NEW MEXICO: In the realm of scientific mysteries, few have captured the imagination of physicists quite like the Fermi-Pasta-Ulam-Tsingou (FPUT) paradox. In the 1950s, this paradox originated from an unexpected discovery, challenging our understanding of nonl…\",\n" +
            "      \"url\": \"https://www.transcontinentaltimes.com/the-fermi-pasta-ulam-tsingou-paradox/\",\n" +
            "      \"urlToImage\": \"https://www.transcontinentaltimes.com/wp-content/uploads/2023/06/Fermi-Pasta-Ulam-Tsingou.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:05:42Z\",\n" +
            "      \"content\": \"NEW MEXICO: In the realm of scientific mysteries, few have captured the imagination of physicists quite like the Fermi-Pasta-Ulam-Tsingou (FPUT) paradox.\\r\\nIn the 1950s, this paradox originated from a… [+3444 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Newstracklive.com\"\n" +
            "      },\n" +
            "      \"author\": \"Sanskar Tiwari\",\n" +
            "      \"title\": \"All Facts Related to the Solar System - News Track English\",\n" +
            "      \"description\": \"Welcome to our comprehensive guide on all the fascinating facts related to the solar system. The solar system is an awe-inspiring expanse of celestial bodies that has captivated human curiosity for centuries. In this article, we will explore everything from t…\",\n" +
            "      \"url\": \"https://english.newstracklive.com/news/all-facts-related-to-the-solar-system-a-comprehensive-guide-emc-sc71-nu384-ta384-1280445-1.html\",\n" +
            "      \"urlToImage\": \"https://media.newstrack.in/uploads/technology-news/technology-news/Jun/13/big_thumb/Solar-System_64881c99d55b6.jpeg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:53:28Z\",\n" +
            "      \"content\": \"Welcome to our comprehensive guide on all the fascinating facts related to the solar system. The solar system is an awe-inspiring expanse of celestial bodies that has captivated human curiosity for c… [+6667 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Tech\",\n" +
            "      \"title\": \"NASA Astronomy Picture of the Day 13 June 2023: Moons crossing Great Red Spot on Jupiter - HT Tech\",\n" +
            "      \"description\": \"Today’s NASA Astronomy Picture of the Day is a snapshot of Jupiter’s two Galilean moons, Europa and Io, crossing the gas giant.\",\n" +
            "      \"url\": \"https://tech.hindustantimes.com/tech/news/nasa-astronomy-picture-of-the-day-13-june-2023-moons-crossing-great-red-spot-on-jupiter-71686640731737.html\",\n" +
            "      \"urlToImage\": \"https://images.hindustantimes.com/tech/img/2023/06/13/1600x900/Untitled_design_1686641342391_1686641362391.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:30:19Z\",\n" +
            "      \"content\": \"Jupiter has been shocking astronomers ever since astronomer Galileo Galilei started recording its mysteries as far back as 1610. Jupiter is also known as the Gas Giant as it has a dense atmosphere of… [+2101 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Pratidintime.com\"\n" +
            "      },\n" +
            "      \"author\": \"Pratidin Bureau\",\n" +
            "      \"title\": \"NASA's Mission to Prevent ‘Internet Apocalypse’ - Pratidin Time\",\n" +
            "      \"description\": \"NASA’s Parker Solar Probe has successfully travelled through solar wind, gathering valuable insights into the sun’s workings to prevent a potential “internet ap\",\n" +
            "      \"url\": \"https://www.pratidintime.com/world/nasa-launch-mission-to-prevent-internet-apocalypse\",\n" +
            "      \"urlToImage\": \"https://gumlet.assettype.com/pratidintime%2F2023-06%2F846f35dc-b852-4e18-9096-bc493c71446d%2FNew_Project__5_.jpg?w=1200&auto=format%2Ccompress&ogImage=true&enlarge=true\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:06:56Z\",\n" +
            "      \"content\": \"Typically found at the suns poles during quiet periods, the holes do not directly impact Earth. However, during the suns active phase every 11 years, when its magnetic field flips, these holes appear… [+86 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India Today\"\n" +
            "      },\n" +
            "      \"author\": \"India Today Science Desk\",\n" +
            "      \"title\": \"Mega-bubble collapsed on Sun triggering an explosion to hit Earth. But then... - India Today\",\n" +
            "      \"description\": \"What surprised astronomers about this event was that the bubble had triggered a coronal mass ejection that was expected to slam into Earth.\",\n" +
            "      \"url\": \"https://www.indiatoday.in/science/story/mega-bubble-collapsed-on-sun-triggering-an-explosion-to-hit-earth-but-then-2392374-2023-06-13\",\n" +
            "      \"urlToImage\": \"https://akm-img-a-in.tosshub.com/indiatoday/images/story/202306/sun_explosion-sixteen_nine.jpg?VersionId=WZuQt8SLFvjv6aj04SuuJRZPEkwDBwJv\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:27:22Z\",\n" +
            "      \"content\": \"By India Today Science Desk: The Sun has been extremely active of late as it peaks towards the maxima as part of its current cycle and a new list of significant events released by NOAA has revealed h… [+2752 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Transcontinentaltimes.com\"\n" +
            "      },\n" +
            "      \"author\": \"Aditya Saikrishna\",\n" +
            "      \"title\": \"SpaceX Celebrates 200th Booster Landing; Falcon 9 Rocket Deploys 72 Satellites to Orbit - Transcontinental Times\",\n" +
            "      \"description\": \"UNITED STATES: SpaceX reached a significant milestone in its space exploration endeavours as it successfully launched 72 small satellites into orbit and achieved its 200th booster landing. The Falcon 9 rocket, carrying a payload of 72 spacecraft, lifted off f…\",\n" +
            "      \"url\": \"https://www.transcontinentaltimes.com/spacex-celebrate-booster-landing/\",\n" +
            "      \"urlToImage\": \"https://www.transcontinentaltimes.com/wp-content/uploads/2023/06/SpaceX-Booster-Landing.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:15:06Z\",\n" +
            "      \"content\": \"UNITED STATES: SpaceX reached a significant milestone in its space exploration endeavours as it successfully launched 72 small satellites into orbit and achieved its 200th booster landing.\\r\\nThe Falco… [+2061 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Timestech.in\"\n" +
            "      },\n" +
            "      \"author\": \"Analog Devices\",\n" +
            "      \"title\": \"The Amazing Technology Behind EV Batteries - TimesTech\",\n" +
            "      \"description\": \"A battery management system (BMS) is responsible for extracting the maximum capacity and lifetime from these cells while ensuring safety\",\n" +
            "      \"url\": \"https://timestech.in/the-amazing-technology-behind-ev-batteries/\",\n" +
            "      \"urlToImage\": \"https://timestech.in/wp-content/uploads/2023/06/evbb.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:09:25Z\",\n" +
            "      \"content\": \"Unlike a single energy storage element such as a fuel tank, an electric vehicle (EV) battery pack consists of hundreds of individual lithium-ion (Li-Ion) bat-tery cells in a long series. When not ope… [+12049 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Siliconrepublic.com\"\n" +
            "      },\n" +
            "      \"author\": \"silicon\",\n" +
            "      \"title\": \"Harnessing the power of structural colour in nature for photonic sensors - SiliconRepublic.com\",\n" +
            "      \"description\": \"Colm Delaney works on creating photonic sensors by exploiting a phenomenon known as ‘structural colour’ often found in nature.\",\n" +
            "      \"url\": \"https://www.siliconrepublic.com/innovation/photonics-structural-colour-chemistry-nanoscience-colm-delaney\",\n" +
            "      \"urlToImage\": \"https://www.siliconrepublic.com/wp-content/uploads/2023/06/Colm-Delaney.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:02:34Z\",\n" +
            "      \"content\": \"Trinity College Dublins Colm Delaney works on creating photonic sensors by exploiting a phenomenon known as structural colour often found in birds, insects and chameleons.\\r\\nColm Delaney is an assista… [+5567 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Tech Explorist\"\n" +
            "      },\n" +
            "      \"author\": \"Amit Malewar\",\n" +
            "      \"title\": \"Astronomers identified a new Tatooine-like multi-planetary system - Tech Explorist\",\n" +
            "      \"description\": \"The second-ever discovery of a multiplanetary circumbinary system.\",\n" +
            "      \"url\": \"https://www.techexplorist.com/new-tatooine-multi-planetary-system/62025/\",\n" +
            "      \"urlToImage\": \"https://www.techexplorist.com/wp-content/uploads/2023/06/multi-planetary-system.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:53:36Z\",\n" +
            "      \"content\": \"Circumbinary planets that orbit around both stars of a central binary star system challenge our understanding of planet formation. With only 12 binary systems known to host circumbinary planets, iden… [+3151 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Thehansindia.com\"\n" +
            "      },\n" +
            "      \"author\": \"The Hans India\",\n" +
            "      \"title\": \"First man-made object to cross the central Solar System - The Hans India\",\n" +
            "      \"description\": \"Pioneer 10 became the first man-made object to cross the central Solar System after crossing Neptune which at the time was the farthest planet from the Sun.\",\n" +
            "      \"url\": \"https://www.thehansindia.com/life-style/first-man-made-object-to-cross-the-central-solar-system-802661\",\n" +
            "      \"urlToImage\": \"https://assets.thehansindia.com/h-upload/2023/06/13/1357584-ol.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:31:59Z\",\n" +
            "      \"content\": \"June 13, 1983: Pioneer 10 became the first man-made object to cross the central Solar System after crossing Neptune which at the time was the farthest planet from the Sun. Pioneer 10 (originally desi… [+688 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"EurekAlert\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Unveiling the invisible: A breakthrough in spectroscopy to allow discoveries in materials physics - EurekAlert\",\n" +
            "      \"description\": \"Scientists from the University of Ottawa and the Max Planck Institute for the Science of Light are proposing a breakthrough approach that will facilitate discoveries in materials science by combining terahertz (THz) spectroscopy and real-time monitoring.\",\n" +
            "      \"url\": \"https://www.eurekalert.org/news-releases/992281\",\n" +
            "      \"urlToImage\": \"https://earimediaprodweb.azurewebsites.net/Api/v1/Multimedia/0df2c64b-8251-45ac-a838-64c2071652d8/Rendition/thumbnail/Content/Public\",\n" +
            "      \"publishedAt\": \"2023-06-13T02:00:23Z\",\n" +
            "      \"content\": \"image: In this study, we present a novel photonics system that can measure in real time the low-energy dynamics of complex physical phenomena with a time resolution approaching the microsecond - Jean… [+3882 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val generalNewsArticle:String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 38,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"Deeksha Bhardwaj\",\n" +
            "      \"title\": \"Centre dismisses Jack Dorsey’s claims of Twitter shutdown over farmer protests - Hindustan Times\",\n" +
            "      \"description\": \"Union minister Rajeev Chandrashekhar said that Twitter was in repeated violations of Indian law and started complying with Indian laws only from June 2022 | Latest News India\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/india-news/union-minister-disputes-twitter-co-founder-s-claims-of-government-pressure-and-threats-during-farmers-protest-101686634075229.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/13/1600x900/Twitter-co-founder-Jack-Dorsey-alleged-that-the-co_1686650328671.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:58:57Z\",\n" +
            "      \"content\": \"Terming it as an outright lie, union minister of state for entrepreneurship, skill development, electronics and technology Rajeev Chandrasekhar on Tuesday hit out at the allegations levelled by Twitt… [+2669 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Indian Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Indian Express\",\n" +
            "      \"title\": \"Hubble captures a jellyfish galaxy 700 million light-years away - The Indian Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://indianexpress.com/article/technology/science/hubble-jellyfish-galaxy-8660594/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T09:31:17Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Livemint\",\n" +
            "      \"title\": \"Subhash Chandra, Punit Goenka move SAT against SEBI’s order on the principle of natural justice: Report | Mint - Mint\",\n" +
            "      \"description\": \"The Securities & Exchange Board of India's (SEBI) in its recent order had banned Chandra and Goenka from being directors or holding a Key Managerial Personnel in any listed company or its subsidiaries until further orders.\",\n" +
            "      \"url\": \"https://www.livemint.com/market/stock-market-news/subhash-chandra-punit-goenka-move-sat-against-sebi-s-order-on-the-principle-of-natural-justice-report-11686642499469.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/2-0-1292560_1686642882557_1686642882790.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:23:56Z\",\n" +
            "      \"content\": \"Essel Group Chairman Subhash Chandra and Zee Entertainment Enterprises' (ZEEL) MD &amp; CEO Punit Goenka have moved Securities Appellate Tribunal (SAT) against the Securities &amp; Exchange Board of … [+2250 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": \"NDTV Sports Desk\",\n" +
            "      \"title\": \"\\\"Go And Hammer West Indies 2-0, 3-0\\\": Sunil Gavaskar Launches Scathing Attack At Indian Team - NDTV Sports\",\n" +
            "      \"description\": \"India's forgettable outing at the World Test Championship final against Australia has left the legendary batter Sunil Gavaskar fuming with anger.\",\n" +
            "      \"url\": \"https://sports.ndtv.com/cricket/go-and-hammer-west-indies-2-0-3-0-sunil-gavaskar-launches-scathing-attack-at-indian-team-4113980\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2023-06/h57hocfg_sunil-gavaskar_650x300_12_June_23.jpg?im=FitAndFill,algorithm=dnn,width=1200,height=675\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:16:00Z\",\n" +
            "      \"content\": \"India's forgettable outing at the World Test Championship final against Australia has left the legendary batter Sunil Gavaskar fuming with anger. The former India skipper spoke very critically about … [+2315 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India.com\"\n" +
            "      },\n" +
            "      \"author\": \"Jigyasa Sahay\",\n" +
            "      \"title\": \"Top 10 Indian States With High Diabetes Rate - India.com\",\n" +
            "      \"description\": \"According to the recent ICMR backed research published in Lancet, India has  over 100 million people suffering from diabetes. Here are top worst affected states.\",\n" +
            "      \"url\": \"https://www.india.com/webstories/health/top-10-indian-states-with-high-diabetes-rate-goa-puducherry-kerala-6107601/\",\n" +
            "      \"urlToImage\": \"https://static.india.com/wp-content/uploads/2023/06/diabettes-state3.jpeg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:36:46Z\",\n" +
            "      \"content\": \"According to a recent study backed by ICMR and published in Lancet, over 100 million Indians are diabetic\\r\\n1. Goa has highest percentage of diabetic people -26.4 %\\r\\n2. Puducherry with - 26.3\\r\\n4. Chan… [+273 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"GaadiWaadi.com\"\n" +
            "      },\n" +
            "      \"author\": \"Surendhar M\",\n" +
            "      \"title\": \"Top 10 Hatchbacks May 2023 - Baleno, Swift, Tiago, Glanza, i20 - GaadiWaadi.com\",\n" +
            "      \"description\": \"Maruti Baleno was the most sold hatchback in India in May 2023 as it finished ahead of its siblings, Swift, WagonR and Alto\",\n" +
            "      \"url\": \"https://gaadiwaadi.com/top-10-hatchbacks-may-2023-baleno-swift-tiago-glanza-i20/\",\n" +
            "      \"urlToImage\": \"https://gaadiwaadi.com/wp-content/uploads/2022/03/Tata-Tiago-home-wallpaper.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:33:51Z\",\n" +
            "      \"content\": \"Maruti Suzuki India Limited’s Baleno was the most sold passenger car in the country in the month of May 2023 and naturally, it became the best selling hatchback. The premium hatch posted a total of 1… [+2502 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India Today\"\n" +
            "      },\n" +
            "      \"author\": \"Anindita Mukherjee\",\n" +
            "      \"title\": \"Disha Patani's birthday photo dump includes her parents, Tiger Shroff's sister Krishna and BFF Mouni. See here - India Today\",\n" +
            "      \"description\": \"Disha Patani is celebrating her 31st birthday today, June 13. Her photo dump included precious moments with her mom and dad, Tiger Shroff's sister Krishna Shroff and Mouni Roy.\",\n" +
            "      \"url\": \"https://www.indiatoday.in/movies/celebrities/story/disha-patani-birthday-photo-dump-includes-parents-tiger-shroff-sister-krishna-shroff-and-mouni-roy-2392453-2023-06-13\",\n" +
            "      \"urlToImage\": \"https://akm-img-a-in.tosshub.com/indiatoday/images/story/202306/untitled_design_-_2023-06-13t134636.755-sixteen_nine.png?VersionId=EuSp7rqTkJVgZUls2YPN0Jhy8HAre4yD\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:27:55Z\",\n" +
            "      \"content\": \"By Anindita Mukherjee: The gorgeous Disha Patani is celebrating her 31stbirthday today, June 13, and since morning, social media is flooded with best wishes for the Radhe actress. Thanking her fans o… [+2536 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Entertainment Desk\",\n" +
            "      \"title\": \"Arshad Warsi reveals he got kicked out of films by ‘insecure’ leading men - Hindustan Times\",\n" +
            "      \"description\": \"Arshad Warsi picked Munna Bhai co-star Sanjay Dutt and Salman Khan as the few leading actors who've allowed him to shine in a supporting role in their movies. | Bollywood\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/entertainment/bollywood/arshad-warsi-reveals-hes-often-got-kicked-out-of-films-by-insecure-leading-men-101686639531394.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/13/1600x900/arshad_warsi_as_circuit_1653975956309_1686640233673.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:24:40Z\",\n" +
            "      \"content\": \"Arshad Warsi has revealed that a lot of insecure leading men have kicked him out of their films. He claimed that there are only a couple of actors who are secure enough to let him perform to his opti… [+1794 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT News Desk\",\n" +
            "      \"title\": \"3 dead in 'serious incident' in England's Nottingham. What we know so far - Hindustan Times\",\n" +
            "      \"description\": \"Nottingham is a city of about 350,000 some 120 miles (190 kilometers) north of London. | World News\",\n" +
            "      \"url\": \"https://www.hindustantimes.com/world-news/police-respond-to-serious-incident-in-englands-nottingham-city-101686643827761.html\",\n" +
            "      \"urlToImage\": \"https://www.hindustantimes.com/ht-img/img/2023/06/13/1600x900/police_cordon_Nottingham_britain_1686644178842_1686644179062.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:24:35Z\",\n" +
            "      \"content\": \"A large police cordon has been put up in Britain's Nottingham after three people were found dead, reported Reuters. A man had been arrested on suspicion of murder after a van had also tried to run ov… [+2034 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"5.4 Magnitude Earthquake In Jammu And Kashmir, Tremors Across North India - NDTV\",\n" +
            "      \"description\": \"Tremors were felt in Delhi and parts of north India after a 5.4 magnitude earthquake hit Jammu and Kashmir this afternoon.\",\n" +
            "      \"url\": \"https://www.ndtv.com/india-news/earthquake-tremors-felt-in-delhi-adjoining-areas-4116964\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2019-10/qg39gk78_kashmir-generic-journey-basket_625x300_13_October_19.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:09:20Z\",\n" +
            "      \"content\": \"Earthquake in Delhi-NCR: No damages have been reported yet. (representational)\\r\\nNew Delhi: Tremors were felt in Delhi and parts of north India after a 5.4 magnitude earthquake hit Jammu and Kashmir t… [+1083 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"TIMESOFINDIA.COM\",\n" +
            "      \"title\": \"Redmi Buds Active 4 true wireless earbuds with ENC launched: Price, features and more - Times of India\",\n" +
            "      \"description\": \"Along with its latest Xiaomi Pad 6, the Chinese smartphone maker has also launched its new Redmi branded true wireless earbuds in the country. The com\",\n" +
            "      \"url\": \"https://timesofindia.indiatimes.com/gadgets-news/redmi-buds-active-4-true-wireless-earbuds-with-enc-launched-price-features-and-more/articleshow/100960070.cms\",\n" +
            "      \"urlToImage\": \"https://static.toiimg.com/thumb/msid-100960060,width-1070,height-580,imgsize-568486,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:07:00Z\",\n" +
            "      \"content\": \"5G phones with Android 13, 8GB RAM under Rs 20,000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Business Standard\"\n" +
            "      },\n" +
            "      \"author\": \"Business Standard\",\n" +
            "      \"title\": \"Pfizer and GSK to battle for share of new RSV vaccine market: Report - Business Standard\",\n" +
            "      \"description\": \"US drugmaker Pfizers and British pharma major GSK are likely to face significant competition in the respiratory syncytial virus (RSV) vaccine market, according to a report on Tuesday\",\n" +
            "      \"url\": \"https://www.business-standard.com/companies/news/pfizer-and-gsk-to-battle-for-share-of-new-rsv-vaccine-market-report-123061300331_1.html\",\n" +
            "      \"urlToImage\": \"https://bsmedia.business-standard.com/_media/bs/img/article/2023-03/14/full/1678794082-0665.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:02:29Z\",\n" +
            "      \"content\": \"US drugmaker Pfizers and British pharma major GSK are likely to face significant competition in the respiratory syncytial virus (RSV) vaccine market, according to a report on Tuesday.\\r\\nGSK's novel va… [+2798 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Nikhil Agarwal\",\n" +
            "      \"title\": \"MRF share price@Rs 1 lakh: Why 6-digit record doesn’t make it the most expensive stock - Economic Times\",\n" +
            "      \"description\": \"Indian tyre manufacturer MRF became the first company to see a share price tag exceed INR100,000 (\$1,347) in India. MRF is the priciest stock listed on the Indian stock market and it's followed by multinationals such as Honeywell Automation, but stock prices …\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/mrf-share-pricers-1-lakh-why-6-digit-record-doesnt-make-it-the-most-expensive-stock/articleshow/100959793.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100959925,width-1070,height-580,imgsize-1802887,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:57:00Z\",\n" +
            "      \"content\": \"Chennai-based tyre manufacturer MRF, which became the first stock in the history of Dalal Street to cross the Rs 1 lakh mark on Tuesday, has long been known as the most expensive stock in India. But … [+3571 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"The Indian Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Indian Express\",\n" +
            "      \"title\": \"‘Existence of party under threat’: HAM chief Santosh Kumar Suman resigns as Bihar minister - The Indian Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://indianexpress.com/article/cities/patna/santosh-kumar-suman-resigns-bihar-minister-ham-jitan-manjhi-8660291/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T07:50:57Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Hindustan Times\"\n" +
            "      },\n" +
            "      \"author\": \"HT Tech\",\n" +
            "      \"title\": \"NASA Astronomy Picture of the Day 13 June 2023: Moons crossing Great Red Spot on Jupiter - HT Tech\",\n" +
            "      \"description\": \"Today’s NASA Astronomy Picture of the Day is a snapshot of Jupiter’s two Galilean moons, Europa and Io, crossing the gas giant.\",\n" +
            "      \"url\": \"https://tech.hindustantimes.com/tech/news/nasa-astronomy-picture-of-the-day-13-june-2023-moons-crossing-great-red-spot-on-jupiter-71686640731737.html\",\n" +
            "      \"urlToImage\": \"https://images.hindustantimes.com/tech/img/2023/06/13/1600x900/Untitled_design_1686641342391_1686641362391.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:30:19Z\",\n" +
            "      \"content\": \"Jupiter has been shocking astronomers ever since astronomer Galileo Galilei started recording its mysteries as far back as 1610. Jupiter is also known as the Gas Giant as it has a dense atmosphere of… [+2101 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India.com\"\n" +
            "      },\n" +
            "      \"author\": \"https://www.india.com/author/sportsdesk/\",\n" +
            "      \"title\": \"LIVE Updates | ODI World Cup 2023 Schedule: BIG Announcement Anytime NOW - India.com\",\n" +
            "      \"description\": \"LIVE Updates | ICC World Cup 2023: The Final Schedule is set to be released soon. The much venue for the much anticipated India vs Pakistan clash will be revealed in the ICC Meeting.\",\n" +
            "      \"url\": \"https://www.india.com/sports/live-updates-odi-world-cup-2023-schedule-venues-timing-dates-fixtures-teams-squads-june-13-tuesday-india-vs-pakistan-oct-15-ahmedabad-icc-world-cup-live-streaming-rohit-virat-gill-hardik-cricket-news-6105319/\",\n" +
            "      \"urlToImage\": \"https://static.india.com/wp-content/uploads/2023/06/ODI-WC-2023-Schedule.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:25:18Z\",\n" +
            "      \"content\": \"LIVE Updates | ICC World Cup 2023: The Final Schedule is set to be released soon. The much venue for the much anticipated India vs Pakistan clash will be revealed in the ICC Meeting.\\r\\nODI WC 2023 Sch… [+2338 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"India Today\"\n" +
            "      },\n" +
            "      \"author\": \"India Today News Desk\",\n" +
            "      \"title\": \"Sidhu Moose Wala ka 295 lagao: Rahul Gandhi enjoys truck ride from Washington to New York - India Today\",\n" +
            "      \"description\": \"During his recent trip to the United States, Congress leader Rahul Gandhi opted for a truck ride from Washington DC to New York. He asked the Indian driver of the truck to play Sidhu Moose Wala’s '295'.\",\n" +
            "      \"url\": \"https://www.indiatoday.in/india/story/sidhu-moose-wala-rahul-gandhi-enjoys-truck-ride-washington-new-york-2392408-2023-06-13\",\n" +
            "      \"urlToImage\": \"https://akm-img-a-in.tosshub.com/indiatoday/images/story/202306/rahul_truck_usa-sixteen_nine.jpg?VersionId=7G1.bLgG1YkD60TcOXrgOVtBELK13PKo\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:20:46Z\",\n" +
            "      \"content\": \"By India Today News Desk: Congress leader Rahul Gandhi took a truck ride from Washington DC to New York during his recent trip to the United States. \\r\\nDuring the truck ride, he requested the driver t… [+937 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"YouTube\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Buildings, vehicles in flames after a Russian missile attack in central Ukraine | Russia-Ukraine War - WION\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.youtube.com/watch?v=GMh6QaOCJlA\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T07:13:39Z\",\n" +
            "      \"content\": \"Your browser isnt supported anymore. Update it to get the best YouTube experience and our latest features. Learn more\\r\\nRemind me later\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-hindu\",\n" +
            "        \"name\": \"The Hindu\"\n" +
            "      },\n" +
            "      \"author\": \"The Hindu\",\n" +
            "      \"title\": \"PM Modi distributes 70,000 appointment letters, says 'Rozgar Mela' becoming new identity of BJP govt. - The Hindu\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.thehindu.com/news/national/pm-modi-distributes-70000-appointment-letters-says-rozgar-mela-becoming-new-identity-of-bjp-govt/article66963553.ece\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T06:45:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Abplive.com\"\n" +
            "      },\n" +
            "      \"author\": \"ABP News Bureau\",\n" +
            "      \"title\": \"NEET Result 2023 Live: NEET UG Result, Final Answer Key Likely Today On neet.nta.nic.in - ABP Live\",\n" +
            "      \"description\": \"NEET UG Result 2023 Live Updates: NTA will soon release the NEET UG 2023 result on the official website at neet.nta.nic.in.\",\n" +
            "      \"url\": \"https://news.abplive.com/education/results/neet-ug-2023-result-live-updates-neet-ug-result-final-answer-key-today-on-neet-nta-nic-in-check-direct-link-topper-1608665\",\n" +
            "      \"urlToImage\": \"https://feeds.abplive.com/onecms/images/uploaded-images/2023/06/12/dfe1cdf3bc2b9a58a36f52b0337cdb621686582500790651_original.jpg?impolicy=abp_cdn&imwidth=1200&imheight=628\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:43:27Z\",\n" +
            "      \"content\": null\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val entertainmentNewsArticle:String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Business Standard\"\n" +
            "      },\n" +
            "      \"author\": \"Business Standard\",\n" +
            "      \"title\": \"RIL, ITC lift Sensex 418 pts up, Nifty regains 18,700; MRF tops Rs 1-L mark - Business Standard\",\n" +
            "      \"description\": \"CLOSING BELL ON JUNE 13, 2023: In the broader market, the BSE MidCap index soared 1.2 per cent, while the Smallcap added 0.8 per cent on Tuesday.\",\n" +
            "      \"url\": \"https://www.business-standard.com/markets/news/stock-market-live-sensex-nifty-us-cpi-us-inflation-inox-wind-zee-ent-123061300113_1.html\",\n" +
            "      \"urlToImage\": \"https://bsmedia.business-standard.com/_media/bs/img/article/2023-04/05/full/1680686226-6079.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T10:21:56Z\",\n" +
            "      \"content\": \"Stock Market Highlights: Domestic markets on Tuesday cheered positive macro-data announced a day earlier, wherein the retail inflation cooled to a 25-month low of 4.25 per cent in May, and IIP growth… [+203 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Sanchari Ghosh\",\n" +
            "      \"title\": \"‘Monsoons unlikely to pick up before...,’ IMD, Skymet predict rainfall deficiency, cite THIS as reason | Mint - Mint\",\n" +
            "      \"description\": \"The main reason for the poor June rains is extremely severe cyclone Biparjoy, which has diverted moisture towards the extreme northwest. The monsoon is expected to be late over central India, with the Bay of Bengal branch unlikely to become active before June…\",\n" +
            "      \"url\": \"https://www.livemint.com/news/india/monsoons-unlikely-to-pick-up-before-imd-skymet-predict-dry-months-ahead-11686626671347.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/cyclone_Biparjoy_1686628098807_1686628098987.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:24:26Z\",\n" +
            "      \"content\": \"Extended range forecasts by the India Meteorological Department (IMD) and Skymet Weather suggest that monsoon rains in the Indian hinterland may be patchy until the first week of July.  Skymet Weathe… [+2517 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Livemint\",\n" +
            "      \"title\": \"Subhash Chandra, Punit Goenka move SAT against SEBI’s order on the principle of natural justice: Report | Mint - Mint\",\n" +
            "      \"description\": \"The Securities & Exchange Board of India's (SEBI) in its recent order had banned Chandra and Goenka from being directors or holding a Key Managerial Personnel in any listed company or its subsidiaries until further orders.\",\n" +
            "      \"url\": \"https://www.livemint.com/market/stock-market-news/subhash-chandra-punit-goenka-move-sat-against-sebi-s-order-on-the-principle-of-natural-justice-report-11686642499469.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/2-0-1292560_1686642882557_1686642882790.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:23:56Z\",\n" +
            "      \"content\": \"Essel Group Chairman Subhash Chandra and Zee Entertainment Enterprises' (ZEEL) MD &amp; CEO Punit Goenka have moved Securities Appellate Tribunal (SAT) against the Securities &amp; Exchange Board of … [+2250 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Saurav Anand\",\n" +
            "      \"title\": \"L&T bags ‘significant’ orders for hydrocarbon business | Mint - Mint\",\n" +
            "      \"description\": \"L&T Energy Hydrocarbon is engaged in executing domestic and international offshore projects. The company aims to strengthen its regional presence by investing in local skills and talent, enhancing procurement from local vendors, and collaborating with local c…\",\n" +
            "      \"url\": \"https://www.livemint.com/companies/news/lt-bags-significant-orders-for-hydrocarbon-business-11686647282562.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/L-T--a--23-billion-Indian-multinational--operates-_1686647268453.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:08:02Z\",\n" +
            "      \"content\": \"New Delhi: Engineering and construction behemoth Larsen &amp; Toubro (L&amp;T) on Tuesday said its hydrocarbon business L&amp;T Energy Hydrocarbon (LTEH) has secured significant\\\" orders. L&amp;T clas… [+1431 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Moneycontrol News\",\n" +
            "      \"title\": \"RIL's new energy business will be 10x by 2050, says Bernstein - Moneycontrol\",\n" +
            "      \"description\": \"The Street is confident of Reliance Industries' funding capabilities, given its strong balance sheet and positive outlook for free cash flow, the financial services firm Bernstein has said in a report\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/stocks/rils-new-energy-business-will-be-10x-by-2050-says-bernstein-10788511.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2022/12/6-mukesh-ambani-reliance-industries-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:55:35Z\",\n" +
            "      \"content\": \"India's clean energy sector, which is expected to grow to \$200-billion market and see cumulative spending of \$2 trillion by 2050, is the next key trigger for Reliance Industries' stock, financial ser… [+2100 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"GaadiWaadi.com\"\n" +
            "      },\n" +
            "      \"author\": \"Surendhar M\",\n" +
            "      \"title\": \"Top 10 Hatchbacks May 2023 - Baleno, Swift, Tiago, Glanza, i20 - GaadiWaadi.com\",\n" +
            "      \"description\": \"Maruti Baleno was the most sold hatchback in India in May 2023 as it finished ahead of its siblings, Swift, WagonR and Alto\",\n" +
            "      \"url\": \"https://gaadiwaadi.com/top-10-hatchbacks-may-2023-baleno-swift-tiago-glanza-i20/\",\n" +
            "      \"urlToImage\": \"https://gaadiwaadi.com/wp-content/uploads/2022/03/Tata-Tiago-home-wallpaper.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:33:51Z\",\n" +
            "      \"content\": \"Maruti Suzuki India Limited’s Baleno was the most sold passenger car in the country in the month of May 2023 and naturally, it became the best selling hatchback. The premium hatch posted a total of 1… [+2502 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"CarToq.com\"\n" +
            "      },\n" +
            "      \"author\": \"Utkarsh Deshmukh\",\n" +
            "      \"title\": \"Maruti Invicto (Engage) MPV: Costliest Maruti vehicle’s final look - CarToq.com\",\n" +
            "      \"description\": \"The country’s largest carmaker, Maruti Suzuki, recently announced that their company will be launching its most expensive model yet in the coming months. Now, we all know that this model will be the highly anticipated premium MPV based on the Toyota Innova Hy…\",\n" +
            "      \"url\": \"https://www.cartoq.com/maruti-invicto-engage-mpv-costliest-maruti-vehicles-final-look/\",\n" +
            "      \"urlToImage\": \"https://www.cartoq.com/wp-content/uploads/2023/06/Maruti-Suzuki-Engage-render.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:11:30Z\",\n" +
            "      \"content\": \"The country’s largest carmaker, Maruti Suzuki, recently announced that their company will be launching its most expensive model yet in the coming months. Now, we all know that this model will be the … [+2866 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Nikhil Agarwal\",\n" +
            "      \"title\": \"MRF share price@Rs 1 lakh: Why 6-digit record doesn’t make it the most expensive stock - Economic Times\",\n" +
            "      \"description\": \"Indian tyre manufacturer MRF became the first company to see a share price tag exceed INR100,000 (\$1,347) in India. MRF is the priciest stock listed on the Indian stock market and it's followed by multinationals such as Honeywell Automation, but stock prices …\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/mrf-share-pricers-1-lakh-why-6-digit-record-doesnt-make-it-the-most-expensive-stock/articleshow/100959793.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100959925,width-1070,height-580,imgsize-1802887,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:57:00Z\",\n" +
            "      \"content\": \"Chennai-based tyre manufacturer MRF, which became the first stock in the history of Dalal Street to cross the Rs 1 lakh mark on Tuesday, has long been known as the most expensive stock in India. But … [+3571 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Financial Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Financial Express\",\n" +
            "      \"title\": \"Matter to raise \$70 million, plans multiple variants of Aera electric motorcycle - The Financial Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.financialexpress.com/business/express-mobility-matter-energy-to-raise-70-million-plans-multiple-variants-of-aera-electric-motorcycle-3124034/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T07:30:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Delhi-Mumbai Airfare Goes Sky-High, Among Costliest Globally - NDTV\",\n" +
            "      \"description\": \"A 24-hour advance air ticket from Delhi to Mumbai is currently priced at around Rs 14,000, which is among the costliest domestic airfares globally.\",\n" +
            "      \"url\": \"https://www.ndtv.com/india-news/mumbai-delhi-airfare-goes-sky-high-among-costliest-globally-4116814\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2022-03/07go9fbg_airplane-generic_650x400_21_March_22.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:09:09Z\",\n" +
            "      \"content\": \"Fuel prices and inflation are also responsible for airfare increase (Representational)\\r\\nNew Delhi: A 24-hour advance air ticket from Delhi to Mumbai is currently priced at around Rs 14,000, which is … [+1467 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Business Desk\",\n" +
            "      \"title\": \"How To Get A Job At OpenAI, Developer Of ChatGPT - News18\",\n" +
            "      \"description\": \"Sam Altman and his team were asked about job openings at OpenAI during their recent India visit.\",\n" +
            "      \"url\": \"https://www.news18.com/business/how-to-get-a-job-at-openai-developer-of-chatgpt-8066323.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/untitled-design-2023-06-13t122348.100-168663924016x9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:56:13Z\",\n" +
            "      \"content\": \"Sam Altman, CEO of OpenAI, the company which owns ChatGPT, recently came to India with his team. He also met Prime Minister Narendra Modi. Since the launch of ChatGPT, it has been said that it is the… [+1560 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Team-BHP\"\n" +
            "      },\n" +
            "      \"author\": \"Tushar Kelshikar\",\n" +
            "      \"title\": \"Leaked! First look at the Hyundai Exter's interior - Team-BHP\",\n" +
            "      \"description\": \"The first images revealing the interior of the upcoming Hyundai Exter have leaked online. The sub-4 meter SUV will be launched on July 10 and will compete with the likes of the Tata Punch and Citroen C3.\",\n" +
            "      \"url\": \"https://www.team-bhp.com/news/leaked-first-look-hyundai-exters-interior\",\n" +
            "      \"urlToImage\": \"https://www.team-bhp.com/sites/default/files/styles/large/public/hyundai-exter-dashboard2.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:49:30Z\",\n" +
            "      \"content\": \"The first images revealing the interior of the upcoming Hyundai Exter have leaked online. The sub-4 meter SUV will be launched on July 10 and will compete with the likes of the Tata Punch and Citroen… [+797 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Nikhil Patwardhan\",\n" +
            "      \"title\": \"Byju's braces for crucial week as lender calls loom amid rising tensions - Moneycontrol\",\n" +
            "      \"description\": \"The edtech company plans talks with lenders to arrive at a mutually agreeable resolution.\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/startup/byjus-braces-for-crucial-week-as-lender-calls-loom-amid-rising-tensions-10785291.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2017/05/Byju-Raveendran-Founder-CEO-BYJUS-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:29:53Z\",\n" +
            "      \"content\": \"Byju's, the world's highest-valued edtech company, is gearing up for an important week of discussions with its lenders as it seeks to ease growing tensions, people aware of the matter told Moneycontr… [+4135 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"ETMarkets.com\",\n" +
            "      \"title\": \"5 midcap stocks that have beaten volatile markets can rise up to 45% - Economic Times\",\n" +
            "      \"description\": \"As Nifty comes closer to form a new high, more number of mid-caps stocks are joining the party. Three companies which form part of the healthcare chain, from a hospital to pharma company to diagnostic player have seen an improvement along with price action su…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/5-midcap-stocks-that-have-beaten-volatile-markets-can-rise-up-to-45/articleshow/100957038.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100957147,width-1070,height-580/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:24:00Z\",\n" +
            "      \"content\": \"SynopsisAs Nifty comes closer to form a new high, more number of mid-caps stocks are joining the party. Three companies which form part of the healthcare chain, from a hospital to pharma company to d… [+366 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Business Desk\",\n" +
            "      \"title\": \"Mass Resignation Of Female Employees At TCS As IT Giant Ends Work From Home - News18\",\n" +
            "      \"description\": \"According to TCS head of HR, there have been more resignations from female employees after the company stopped allowing employees to work from home.\",\n" +
            "      \"url\": \"https://www.news18.com/business/mass-resignation-of-female-employees-at-tcs-as-it-giant-ends-work-from-home-8064853.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/untitled-design-2023-06-13t115137.066-168663730716x9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:23:27Z\",\n" +
            "      \"content\": \"Tata Consultancy Services (TCS), one of the largest IT firms in India, is currently dealing with an unexpected issue. TCS no longer allows employees to work remotely, three years after the COVID-19 p… [+1683 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Team-BHP\"\n" +
            "      },\n" +
            "      \"author\": \"Tushar Kelshikar\",\n" +
            "      \"title\": \"Chandigarh to stop registering petrol cars & bikes by end-2023 - Team-BHP\",\n" +
            "      \"description\": \"The Chandigarh administration is set to stop registering petrol bikes from July and petrol-powered cars from December 2023. Last year, the union territory of Chandigarh rolled out its EV policy, which planned to gradually stop registering non-electric vehicle…\",\n" +
            "      \"url\": \"https://www.team-bhp.com/news/chandigarh-stop-registering-petrol-cars-bikes-end-2023\",\n" +
            "      \"urlToImage\": \"https://www.team-bhp.com/sites/default/files/styles/large/public/petrol_diesel_price_hike_1652934083245_1652934083412.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:02:08Z\",\n" +
            "      \"content\": \"The Chandigarh administration is set to stop registering petrol bikes from July and petrol-powered cars from December 2023.\\r\\nLast year, the union territory of Chandigarh rolled out its EV policy, whi… [+796 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Entrackr\"\n" +
            "      },\n" +
            "      \"author\": \"Entrackr\",\n" +
            "      \"title\": \"Indifi Technologies raises \$35 Mn in Series E round - Entrackr\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://entrackr.com/2023/06/indifi-technologies-raises-35-mn-in-series-e-round/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T05:56:36Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"ETMarkets.com\",\n" +
            "      \"title\": \"Hot Stocks: Brokerages on Hero MotoCorp, Mankind Pharma, Coal India, HUL and Tata Motors - Economic Times\",\n" +
            "      \"description\": \"JPMorgan has initiated coverage on Mankind Pharma, with an overweight rating and a target price of Rs 1,730. Goldman Sachs has reiterated its sell rating on Coal India with a target price of Rs 180, while maintaining its neutral rating on HUL with a target pr…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/hot-stocks-brokerages-on-hero-motocorp-mankind-pharma-coal-india-hul-and-tata-motors/articleshow/100956083.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100956074,width-1070,height-580,imgsize-74210,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:47:00Z\",\n" +
            "      \"content\": \"Brokerage firm JPMorgan initiated an overweight rating on Mankind Pharma, Goldman Sachs has a sell rating on Coal India and Goldman Sachs maintained a neutral stance on HUL. CLSA maintained a buy cal… [+2613 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Navdeep Singh\",\n" +
            "      \"title\": \"Multibagger stock skyrockets 19%, hits 52-week high on merger with parent company - Economic Times\",\n" +
            "      \"description\": \"Inox Wind Energy shares surged nearly 19%, hitting a 52-week high, following the approval from its board members for a merger with its parent firm, Inox Wind. Inox Wind will issue 158 equity shares for every 10 shares held by Inox Wind Energy shareholders and…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/multibagger-stock-skyrockets-19-hits-52-week-high-on-merger-with-parent-company/articleshow/100955923.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100956125,width-1070,height-580,imgsize-60218,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:41:00Z\",\n" +
            "      \"content\": \"Inox Wind Energy shares rallied nearly 19% to hit a 52-week high at Rs 2,150 in Tuesday's trade on BSE after its board approved a merger with its parent company Inox Wind.The wind energy solutions pr… [+1802 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Rakesh Patil\",\n" +
            "      \"title\": \"Market LIVE Updates: Indices at day's high, Nifty at 18,700; Zee Entertainment most active - Moneycontrol\",\n" +
            "      \"description\": \"Stock Market LIVE Updates: HDFC Bank, Kotak Mahindra Bank, Axis Bank, HDFC and Reliance Industries are among the most active shares on the NSE.\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/markets/share-market-live-updates-stock-market-today-june-13-latest-news-bse-nse-sensex-nifty-covid-coronavirus-10785901.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2023/06/Sensex-Nifty-Markets-8-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:27:17Z\",\n" +
            "      \"content\": \"<li>Zee shares sharply off lows, but speculation continues over company's merger with Sony\\r\\n</li><li>European market trade higher\\r\\n</li><li>IKIO Lighting IPO share allotment expected today\\r\\n</li><li>… [+4321 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"

    const val businessNewsArticle:String = "{\n" +
            "  \"status\": \"ok\",\n" +
            "  \"totalResults\": 70,\n" +
            "  \"articles\": [\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Business Standard\"\n" +
            "      },\n" +
            "      \"author\": \"Business Standard\",\n" +
            "      \"title\": \"RIL, ITC lift Sensex 418 pts up, Nifty regains 18,700; MRF tops Rs 1-L mark - Business Standard\",\n" +
            "      \"description\": \"CLOSING BELL ON JUNE 13, 2023: In the broader market, the BSE MidCap index soared 1.2 per cent, while the Smallcap added 0.8 per cent on Tuesday.\",\n" +
            "      \"url\": \"https://www.business-standard.com/markets/news/stock-market-live-sensex-nifty-us-cpi-us-inflation-inox-wind-zee-ent-123061300113_1.html\",\n" +
            "      \"urlToImage\": \"https://bsmedia.business-standard.com/_media/bs/img/article/2023-04/05/full/1680686226-6079.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T10:21:56Z\",\n" +
            "      \"content\": \"Stock Market Highlights: Domestic markets on Tuesday cheered positive macro-data announced a day earlier, wherein the retail inflation cooled to a 25-month low of 4.25 per cent in May, and IIP growth… [+203 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Sanchari Ghosh\",\n" +
            "      \"title\": \"‘Monsoons unlikely to pick up before...,’ IMD, Skymet predict rainfall deficiency, cite THIS as reason | Mint - Mint\",\n" +
            "      \"description\": \"The main reason for the poor June rains is extremely severe cyclone Biparjoy, which has diverted moisture towards the extreme northwest. The monsoon is expected to be late over central India, with the Bay of Bengal branch unlikely to become active before June…\",\n" +
            "      \"url\": \"https://www.livemint.com/news/india/monsoons-unlikely-to-pick-up-before-imd-skymet-predict-dry-months-ahead-11686626671347.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/cyclone_Biparjoy_1686628098807_1686628098987.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:24:26Z\",\n" +
            "      \"content\": \"Extended range forecasts by the India Meteorological Department (IMD) and Skymet Weather suggest that monsoon rains in the Indian hinterland may be patchy until the first week of July.  Skymet Weathe… [+2517 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Livemint\",\n" +
            "      \"title\": \"Subhash Chandra, Punit Goenka move SAT against SEBI’s order on the principle of natural justice: Report | Mint - Mint\",\n" +
            "      \"description\": \"The Securities & Exchange Board of India's (SEBI) in its recent order had banned Chandra and Goenka from being directors or holding a Key Managerial Personnel in any listed company or its subsidiaries until further orders.\",\n" +
            "      \"url\": \"https://www.livemint.com/market/stock-market-news/subhash-chandra-punit-goenka-move-sat-against-sebi-s-order-on-the-principle-of-natural-justice-report-11686642499469.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/2-0-1292560_1686642882557_1686642882790.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:23:56Z\",\n" +
            "      \"content\": \"Essel Group Chairman Subhash Chandra and Zee Entertainment Enterprises' (ZEEL) MD &amp; CEO Punit Goenka have moved Securities Appellate Tribunal (SAT) against the Securities &amp; Exchange Board of … [+2250 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Livemint\"\n" +
            "      },\n" +
            "      \"author\": \"Saurav Anand\",\n" +
            "      \"title\": \"L&T bags ‘significant’ orders for hydrocarbon business | Mint - Mint\",\n" +
            "      \"description\": \"L&T Energy Hydrocarbon is engaged in executing domestic and international offshore projects. The company aims to strengthen its regional presence by investing in local skills and talent, enhancing procurement from local vendors, and collaborating with local c…\",\n" +
            "      \"url\": \"https://www.livemint.com/companies/news/lt-bags-significant-orders-for-hydrocarbon-business-11686647282562.html\",\n" +
            "      \"urlToImage\": \"https://www.livemint.com/lm-img/img/2023/06/13/600x338/L-T--a--23-billion-Indian-multinational--operates-_1686647268453.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T09:08:02Z\",\n" +
            "      \"content\": \"New Delhi: Engineering and construction behemoth Larsen &amp; Toubro (L&amp;T) on Tuesday said its hydrocarbon business L&amp;T Energy Hydrocarbon (LTEH) has secured significant\\\" orders. L&amp;T clas… [+1431 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Moneycontrol News\",\n" +
            "      \"title\": \"RIL's new energy business will be 10x by 2050, says Bernstein - Moneycontrol\",\n" +
            "      \"description\": \"The Street is confident of Reliance Industries' funding capabilities, given its strong balance sheet and positive outlook for free cash flow, the financial services firm Bernstein has said in a report\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/stocks/rils-new-energy-business-will-be-10x-by-2050-says-bernstein-10788511.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2022/12/6-mukesh-ambani-reliance-industries-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:55:35Z\",\n" +
            "      \"content\": \"India's clean energy sector, which is expected to grow to \$200-billion market and see cumulative spending of \$2 trillion by 2050, is the next key trigger for Reliance Industries' stock, financial ser… [+2100 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"GaadiWaadi.com\"\n" +
            "      },\n" +
            "      \"author\": \"Surendhar M\",\n" +
            "      \"title\": \"Top 10 Hatchbacks May 2023 - Baleno, Swift, Tiago, Glanza, i20 - GaadiWaadi.com\",\n" +
            "      \"description\": \"Maruti Baleno was the most sold hatchback in India in May 2023 as it finished ahead of its siblings, Swift, WagonR and Alto\",\n" +
            "      \"url\": \"https://gaadiwaadi.com/top-10-hatchbacks-may-2023-baleno-swift-tiago-glanza-i20/\",\n" +
            "      \"urlToImage\": \"https://gaadiwaadi.com/wp-content/uploads/2022/03/Tata-Tiago-home-wallpaper.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:33:51Z\",\n" +
            "      \"content\": \"Maruti Suzuki India Limited’s Baleno was the most sold passenger car in the country in the month of May 2023 and naturally, it became the best selling hatchback. The premium hatch posted a total of 1… [+2502 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"CarToq.com\"\n" +
            "      },\n" +
            "      \"author\": \"Utkarsh Deshmukh\",\n" +
            "      \"title\": \"Maruti Invicto (Engage) MPV: Costliest Maruti vehicle’s final look - CarToq.com\",\n" +
            "      \"description\": \"The country’s largest carmaker, Maruti Suzuki, recently announced that their company will be launching its most expensive model yet in the coming months. Now, we all know that this model will be the highly anticipated premium MPV based on the Toyota Innova Hy…\",\n" +
            "      \"url\": \"https://www.cartoq.com/maruti-invicto-engage-mpv-costliest-maruti-vehicles-final-look/\",\n" +
            "      \"urlToImage\": \"https://www.cartoq.com/wp-content/uploads/2023/06/Maruti-Suzuki-Engage-render.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T08:11:30Z\",\n" +
            "      \"content\": \"The country’s largest carmaker, Maruti Suzuki, recently announced that their company will be launching its most expensive model yet in the coming months. Now, we all know that this model will be the … [+2866 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Nikhil Agarwal\",\n" +
            "      \"title\": \"MRF share price@Rs 1 lakh: Why 6-digit record doesn’t make it the most expensive stock - Economic Times\",\n" +
            "      \"description\": \"Indian tyre manufacturer MRF became the first company to see a share price tag exceed INR100,000 (\$1,347) in India. MRF is the priciest stock listed on the Indian stock market and it's followed by multinationals such as Honeywell Automation, but stock prices …\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/mrf-share-pricers-1-lakh-why-6-digit-record-doesnt-make-it-the-most-expensive-stock/articleshow/100959793.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100959925,width-1070,height-580,imgsize-1802887,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:57:00Z\",\n" +
            "      \"content\": \"Chennai-based tyre manufacturer MRF, which became the first stock in the history of Dalal Street to cross the Rs 1 lakh mark on Tuesday, has long been known as the most expensive stock in India. But … [+3571 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Financial Express\"\n" +
            "      },\n" +
            "      \"author\": \"The Financial Express\",\n" +
            "      \"title\": \"Matter to raise \$70 million, plans multiple variants of Aera electric motorcycle - The Financial Express\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://www.financialexpress.com/business/express-mobility-matter-energy-to-raise-70-million-plans-multiple-variants-of-aera-electric-motorcycle-3124034/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T07:30:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NDTV News\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Delhi-Mumbai Airfare Goes Sky-High, Among Costliest Globally - NDTV\",\n" +
            "      \"description\": \"A 24-hour advance air ticket from Delhi to Mumbai is currently priced at around Rs 14,000, which is among the costliest domestic airfares globally.\",\n" +
            "      \"url\": \"https://www.ndtv.com/india-news/mumbai-delhi-airfare-goes-sky-high-among-costliest-globally-4116814\",\n" +
            "      \"urlToImage\": \"https://c.ndtvimg.com/2022-03/07go9fbg_airplane-generic_650x400_21_March_22.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T07:09:09Z\",\n" +
            "      \"content\": \"Fuel prices and inflation are also responsible for airfare increase (Representational)\\r\\nNew Delhi: A 24-hour advance air ticket from Delhi to Mumbai is currently priced at around Rs 14,000, which is … [+1467 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Business Desk\",\n" +
            "      \"title\": \"How To Get A Job At OpenAI, Developer Of ChatGPT - News18\",\n" +
            "      \"description\": \"Sam Altman and his team were asked about job openings at OpenAI during their recent India visit.\",\n" +
            "      \"url\": \"https://www.news18.com/business/how-to-get-a-job-at-openai-developer-of-chatgpt-8066323.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/untitled-design-2023-06-13t122348.100-168663924016x9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:56:13Z\",\n" +
            "      \"content\": \"Sam Altman, CEO of OpenAI, the company which owns ChatGPT, recently came to India with his team. He also met Prime Minister Narendra Modi. Since the launch of ChatGPT, it has been said that it is the… [+1560 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Team-BHP\"\n" +
            "      },\n" +
            "      \"author\": \"Tushar Kelshikar\",\n" +
            "      \"title\": \"Leaked! First look at the Hyundai Exter's interior - Team-BHP\",\n" +
            "      \"description\": \"The first images revealing the interior of the upcoming Hyundai Exter have leaked online. The sub-4 meter SUV will be launched on July 10 and will compete with the likes of the Tata Punch and Citroen C3.\",\n" +
            "      \"url\": \"https://www.team-bhp.com/news/leaked-first-look-hyundai-exters-interior\",\n" +
            "      \"urlToImage\": \"https://www.team-bhp.com/sites/default/files/styles/large/public/hyundai-exter-dashboard2.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:49:30Z\",\n" +
            "      \"content\": \"The first images revealing the interior of the upcoming Hyundai Exter have leaked online. The sub-4 meter SUV will be launched on July 10 and will compete with the likes of the Tata Punch and Citroen… [+797 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Nikhil Patwardhan\",\n" +
            "      \"title\": \"Byju's braces for crucial week as lender calls loom amid rising tensions - Moneycontrol\",\n" +
            "      \"description\": \"The edtech company plans talks with lenders to arrive at a mutually agreeable resolution.\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/startup/byjus-braces-for-crucial-week-as-lender-calls-loom-amid-rising-tensions-10785291.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2017/05/Byju-Raveendran-Founder-CEO-BYJUS-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:29:53Z\",\n" +
            "      \"content\": \"Byju's, the world's highest-valued edtech company, is gearing up for an important week of discussions with its lenders as it seeks to ease growing tensions, people aware of the matter told Moneycontr… [+4135 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"ETMarkets.com\",\n" +
            "      \"title\": \"5 midcap stocks that have beaten volatile markets can rise up to 45% - Economic Times\",\n" +
            "      \"description\": \"As Nifty comes closer to form a new high, more number of mid-caps stocks are joining the party. Three companies which form part of the healthcare chain, from a hospital to pharma company to diagnostic player have seen an improvement along with price action su…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/5-midcap-stocks-that-have-beaten-volatile-markets-can-rise-up-to-45/articleshow/100957038.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100957147,width-1070,height-580/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:24:00Z\",\n" +
            "      \"content\": \"SynopsisAs Nifty comes closer to form a new high, more number of mid-caps stocks are joining the party. Three companies which form part of the healthcare chain, from a hospital to pharma company to d… [+366 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"News18\"\n" +
            "      },\n" +
            "      \"author\": \"Business Desk\",\n" +
            "      \"title\": \"Mass Resignation Of Female Employees At TCS As IT Giant Ends Work From Home - News18\",\n" +
            "      \"description\": \"According to TCS head of HR, there have been more resignations from female employees after the company stopped allowing employees to work from home.\",\n" +
            "      \"url\": \"https://www.news18.com/business/mass-resignation-of-female-employees-at-tcs-as-it-giant-ends-work-from-home-8064853.html\",\n" +
            "      \"urlToImage\": \"https://images.news18.com/ibnlive/uploads/2023/06/untitled-design-2023-06-13t115137.066-168663730716x9.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:23:27Z\",\n" +
            "      \"content\": \"Tata Consultancy Services (TCS), one of the largest IT firms in India, is currently dealing with an unexpected issue. TCS no longer allows employees to work remotely, three years after the COVID-19 p… [+1683 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Team-BHP\"\n" +
            "      },\n" +
            "      \"author\": \"Tushar Kelshikar\",\n" +
            "      \"title\": \"Chandigarh to stop registering petrol cars & bikes by end-2023 - Team-BHP\",\n" +
            "      \"description\": \"The Chandigarh administration is set to stop registering petrol bikes from July and petrol-powered cars from December 2023. Last year, the union territory of Chandigarh rolled out its EV policy, which planned to gradually stop registering non-electric vehicle…\",\n" +
            "      \"url\": \"https://www.team-bhp.com/news/chandigarh-stop-registering-petrol-cars-bikes-end-2023\",\n" +
            "      \"urlToImage\": \"https://www.team-bhp.com/sites/default/files/styles/large/public/petrol_diesel_price_hike_1652934083245_1652934083412.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T06:02:08Z\",\n" +
            "      \"content\": \"The Chandigarh administration is set to stop registering petrol bikes from July and petrol-powered cars from December 2023.\\r\\nLast year, the union territory of Chandigarh rolled out its EV policy, whi… [+796 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Entrackr\"\n" +
            "      },\n" +
            "      \"author\": \"Entrackr\",\n" +
            "      \"title\": \"Indifi Technologies raises \$35 Mn in Series E round - Entrackr\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://entrackr.com/2023/06/indifi-technologies-raises-35-mn-in-series-e-round/\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2023-06-13T05:56:36Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"ETMarkets.com\",\n" +
            "      \"title\": \"Hot Stocks: Brokerages on Hero MotoCorp, Mankind Pharma, Coal India, HUL and Tata Motors - Economic Times\",\n" +
            "      \"description\": \"JPMorgan has initiated coverage on Mankind Pharma, with an overweight rating and a target price of Rs 1,730. Goldman Sachs has reiterated its sell rating on Coal India with a target price of Rs 180, while maintaining its neutral rating on HUL with a target pr…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/hot-stocks-brokerages-on-hero-motocorp-mankind-pharma-coal-india-hul-and-tata-motors/articleshow/100956083.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100956074,width-1070,height-580,imgsize-74210,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:47:00Z\",\n" +
            "      \"content\": \"Brokerage firm JPMorgan initiated an overweight rating on Mankind Pharma, Goldman Sachs has a sell rating on Coal India and Goldman Sachs maintained a neutral stance on HUL. CLSA maintained a buy cal… [+2613 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-times-of-india\",\n" +
            "        \"name\": \"The Times of India\"\n" +
            "      },\n" +
            "      \"author\": \"Navdeep Singh\",\n" +
            "      \"title\": \"Multibagger stock skyrockets 19%, hits 52-week high on merger with parent company - Economic Times\",\n" +
            "      \"description\": \"Inox Wind Energy shares surged nearly 19%, hitting a 52-week high, following the approval from its board members for a merger with its parent firm, Inox Wind. Inox Wind will issue 158 equity shares for every 10 shares held by Inox Wind Energy shareholders and…\",\n" +
            "      \"url\": \"https://economictimes.indiatimes.com/markets/stocks/news/multibagger-stock-skyrockets-19-hits-52-week-high-on-merger-with-parent-company/articleshow/100955923.cms\",\n" +
            "      \"urlToImage\": \"https://img.etimg.com/thumb/msid-100956125,width-1070,height-580,imgsize-60218,overlay-etmarkets/photo.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:41:00Z\",\n" +
            "      \"content\": \"Inox Wind Energy shares rallied nearly 19% to hit a 52-week high at Rs 2,150 in Tuesday's trade on BSE after its board approved a merger with its parent company Inox Wind.The wind energy solutions pr… [+1802 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Moneycontrol\"\n" +
            "      },\n" +
            "      \"author\": \"Rakesh Patil\",\n" +
            "      \"title\": \"Market LIVE Updates: Indices at day's high, Nifty at 18,700; Zee Entertainment most active - Moneycontrol\",\n" +
            "      \"description\": \"Stock Market LIVE Updates: HDFC Bank, Kotak Mahindra Bank, Axis Bank, HDFC and Reliance Industries are among the most active shares on the NSE.\",\n" +
            "      \"url\": \"https://www.moneycontrol.com/news/business/markets/share-market-live-updates-stock-market-today-june-13-latest-news-bse-nse-sensex-nifty-covid-coronavirus-10785901.html\",\n" +
            "      \"urlToImage\": \"https://images.moneycontrol.com/static-mcnews/2023/06/Sensex-Nifty-Markets-8-770x433.jpg\",\n" +
            "      \"publishedAt\": \"2023-06-13T05:27:17Z\",\n" +
            "      \"content\": \"<li>Zee shares sharply off lows, but speculation continues over company's merger with Sony\\r\\n</li><li>European market trade higher\\r\\n</li><li>IKIO Lighting IPO share allotment expected today\\r\\n</li><li>… [+4321 chars]\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"
}