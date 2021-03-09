package com.example.doggoapp.Object

import com.example.doggoapp.R

object DogData {
    private val dogNames = arrayOf(
        "American Foxhound",
        "Belgian Malinois",
        "Collie",
        "Dalmation",
        "Golden Retriever",
        "Pembroke Welsh Corgi",
        "Pomeranian",
        "Poodle",
        "Pug",
        "Shiba Inu",
        "Siberian Husky",
        "Tibetan Terrier"
    )

    private val fav = arrayOf(
        false,false,false,false,false,false,
        false,false,false,false,false,false
    )

    private val dogChars = arrayOf(
        arrayOf("Hound Dogs","21 to 25 inches tall at the shoulder","40 to 60 pounds","12 to 13 years"),
        arrayOf("Herding Dogs","22 to 26 inches tall at the shoulder","40 to 80 pounds","12 to 14 years"),
        arrayOf("Herding Dogs","22 to 26 inches all at the shoulder","50 to 70 pounds","10 to 14 years"),
        arrayOf("Companion Dogs","19 to 24 inches tall at the shoulder","48 to 55 pounds","13 to 16 years"),
        arrayOf("Sporting Dogs","21 to 24 inches tall at the shoulder","55 to 75 pounds","10 to 12 years"),
        arrayOf("Herding Dogs","10 to 12 inches tall at the shoulder","Up to 30 pounds","12 to 14 years"),
        arrayOf("Companion Dogs","7 to 12 inches tall at the shoulder","3 to 7 pounds","12 to 16 years"),
        arrayOf("Companion Dogs","From 10 to over 22 inches tall at the shoulder","6 to 70 pounds","12 to 15 years"),
        arrayOf("Companion Dogs","10 to 14 inches tall at the shoulder","14 to 18 pounds","12 to 15 years"),
        arrayOf("Companion Dogs","13 to 17 inches tall at the shoulder","17 to 23 pounds","12 to 16 years"),
        arrayOf("Working Dogs","20 to 23 inches tall at the shoulder","35 to 60 pounds","12 to 15 years"),
        arrayOf("Companion Dogs","14 to 16 inches tall at the shoulder","20 to 24 pounds","12 to 15 years")
    )

    private val dogImage = intArrayOf(
        R.drawable.american_foxhound,
        R.drawable.belgian_malinois,
        R.drawable.collie,
        R.drawable.dalmation,
        R.drawable.golden_retriever,
        R.drawable.pembroke_welsh_corgi,
        R.drawable.pomeranian,
        R.drawable.poodle,
        R.drawable.pug,
        R.drawable.shiba_inu,
        R.drawable.siberian_husky,
        R.drawable.tibetan_terrier
    )

    private val dogDetail = arrayOf(
        "Easygoing, sweet, kind, and loyal, the American Foxhound dog breed belongs to a way of life that has continued for more than two centuries, but they have the potential to be a modern-day companion as well.\n" +
                "\nThe American Foxhound’s stamina and love of running make them great jogging partners for athletic pet parents, and their mild nature makes them excellent family dogs, so long as they get the exercise they crave. Although they’re low maintenance and affectionate pets, apartment dwellers and novice owners should beware. This breed’s energy and intensity mean that they need plenty of space to run and a commitment to lots of active play time.\n" +
                "\nWhen you see foxhunters in movies or on television — or out in the field if you live in hunt country — packs of American Foxhounds are leading the chase. Or perhaps you were introduced to the breed through Rita Mae Brown's Mrs. Murphy mystery series, set in Virginia hunt country with a number of American Foxhounds as key characters.\n" +
                "\nThis rare breed still lives and works the way its ancestors did when they came to this country more than 200 years ago. Bred to hunt in large packs, American Foxhounds were developed from hounds brought by English settlers, who adapted them to suit the game and terrain of their new land.\n" +
                "\nAmerican Foxhounds like the company of other dogs but can be a single companion dog if you're committed to giving them the exercise they'd normally get running around with their canine friends, and to spending the time to help them bond with their human family. Despite their size, they're mild-mannered unless they're in pursuit of their quarry. Then they become relentless in the hunt.\n" +
                "\nLike all hounds, the Foxhound is musical. Hounds are described as having bell-like voices, and their baying can carry for miles. It's best not to bring one home unless you're sure your neighbors will appreciate the concert or live far enough away that they won't be disturbed.",

        "Canines of the Belgian Malinois dog breed were originally bred to be herding dogs. Today, they also work as police and military dogs, protection dogs, and loving family members.\n" +
                "\nIn the hands of an experienced dog person, these canines are intense, intelligent, and athletic companions. However, with their high energy and exercise needs, they may not fair as well in apartments or small living spaces. This breed is not likely to suit a first-time dog owner. But with firm, consistent training and plenty of physical and mental activity, these pups will be loving and loyal for life.\n" +
                "\nThe Belgian Malinois (pronounced MAL-in-wah) is a medium-size Belgian shepherd dog that at first glance resembles a German Shepherd Dog. Malinois are shorthaired, fawn-colored dogs with a black mask. They are one of four types of Belgian herding dogs, and have been shown in the U.S. as a separate breed since 1959.\n" +
                "\nOriginally developed in Malines, Belgium, Malinois have a great deal of stamina and truly enjoy working. They are intelligent and very active dogs that excel at many tasks. In addition to herding, they also do well with police work, search and rescue, and in performance events, such as agility.\n" +
                "\nPeople who are not familiar with the Malinois often confuse them with the German Shepherd Dog (GSD), but there are significant differences in the body structure and temperament of the two breeds. Malinois are smaller dogs with lighter bones. They stand with their weight well on their toes, which gives them a square body profile, while today's GSD has a long, sloping back and carries their weight flatter on their feet.\n" +
                "\nMalinois are fawn-colored, red, or brown, and the tips of their hair are black, while the GSD is usually tan with a black saddle. Additionally, the Malinois has a more refined, chiseled head that the GSD and smaller, more triangular ears.\n" +
                "\nMany think that the Malinois is more alert and quicker to respond than the GSD. They're also very sensitive dogs that don't respond well to harsh training methods. Some Malinois are friendly and assertive, but others are reserved and aloof with strangers. They should never have a fearful or aggressive temperament.\n" +
                "\nBecause of their energy level and sensitivity, Malinois are recommended only for people who have previously owned dogs and have experience with dog training. Malinois are very intense dogs who like to be included in all of the family activities. They aren't well suited for people who work long hours or must travel often, leaving their dogs at home.\n" +
                "\nIf you have decided that the Malinois is the breed for you, you should expose yours to many different people, dogs, other animals and situations as early as possible. Puppy kindergarten classes are recommended for your Malinois puppy, followed by obedience training class.\n" +
                "\nMalinois are quick learners and eager to do whatever their people ask of them. They excel are obedience, tracking, agility, flyball, herding, showing, Schutzhund and other protection sports, search and rescue, and police work. Trainers describe them as having a high \"play drive,\" which means that they love to play, and about anything you ask them to do is play to them.\n" +
                "\nBut the Malnois' owner should never forget that this is a breed developed to protect and herd. Poorly socialized dogs may be aggressive out of fear or shyness. Additionally, although well-socialized Malinois are good with children, especially if they are raised with them, they may have a tendency to nip at their heels and try to herd them when playing.",

        "The Collie dog breed is a native of Scotland, mostly of the Highland regions but also bred in the Scottish Lowlands and northern England, where they were used primarily as a herding dog. They’re great family companions and are still capable herding dogs.\n" +
                "\nCollies are sensitive and intelligent dogs, known for undying loyalty and the amazing ability to foresee their owners’ needs. They’re highly affectionate with their families, but that sensitivity means they don’t care much for being left alone for long hours of the day. Give them lots of love and companionship, and they’ll give it back tenfold to all members of their pack, including kids.\n" +
                "\nIn the 1950s television series Lassie, you knew that the Collie would come to the rescue, whether Timmy was trapped in an abandoned mine or had fallen into a well. After all, the star of this long-running show wasn't just any dog. She was Lassie, a Collie dog.\n" +
                "\nTo be sure, the adventures of Timmy and Lassie are fun to watch. But they're fiction — aren't they?\n" +
                "\nWell, according to those who know and love the Collie breed, the fictional accounts of television Lassie aren't too far off the mark. The real-life Collie is an extremely intelligent, sensitive dog who is known for her uncanny ability to know when something is wrong. True stories abound about this breed coming to the rescue of people and animals.\n" +
                "\nHeroics aside, the Collie is a medium-size (50 to 70 pounds) dog, easy to train, devoted to and protective of her family, and friendly with people outside the family circle as well. Known for being playful and gentle, she makes an excellent companion for children.\n" +
                "\nAlthough the Collie is good-natured and friendly, she can be suspicious of strangers, especially if they approach the children in her family. She's a good watchdog — she will bark — but she is not aggressive.\n" +
                "\nThe beautiful Collie has two distinct looks: full coat (known as the Rough variety) and short coat (known as the Smooth variety). The television star was a Rough Collie, as was the star of the 1943 movie Lassie Come Home, which inspired the television series.\n" +
                "\nToday, the Collie is more likely to be a pampered pet than an all-around farm dog. She adapts well to a variety of home environments, as long as she has plenty of daily exercise. She enjoys relaxing around the house with her family, as well as running and playing outside with the kids. Her herding instincts are still strong, so it's not unusual for the Collie to gather children and pets, chase cars, and bark.\n" +
                "\nIn addition to her herding ability, the loyal Collie excels as an assistance or therapy dog. She also does well at such canine sports as herding trials, agility, obedience, and lure coursing.\n" +
                "\nThe movie and the television series made the Collie a popular dog in the United States. Unfortunately, her extreme popularity leaves her open to the bane of all favorite breeds: unscrupulous people who breed with no regard for temperament, health, or conformation.\n" +
                "\nAs a result, some Collies have serious health and temperament problems. If you are considering a Collie, you must be extremely careful from whom you purchase or adopt a puppy. Buy only from a reputable breeder. Never buy a puppy from an irresponsible breeder, puppy mill, or pet store. Reputable breeders breed with temperament in mind and perform various health tests to ensure that their breeding dogs don't pass on a predisposition to genetic diseases.",

        "Best known as the star of Disney’s 101 Dalmatians, this sleek and athletic Dalmatian dog breed has a history that goes back several hundred years. They started out as a coach dog but also served in many other capacities, including hunter, firehouse dog, and circus performer.\n" +
                "\nAs charming in life as in film, Dalmatians go from gallant to goofy to gallant again in the blink of an eye. They love to be a part of everything their family does. That said, they have high energy levels and need plenty of exercise. If you’re looking for a jogging partner and friend who’ll love you unconditionally, this may be the breed for you!\n" +
                "\nWith his regal carriage and unique spots, the Dalmatian is probably one of the most recognized breeds on the planet. Many people are attracted to his dashing good looks, but he's definitely not for everyone. While Dalmatians love to be with their people for any activity that occurs in the course of a day and can make wonderful companion dogs, their high energy level can be exhausting to live with.\n" +
                "\nDalmations were created to run for miles alongside carriages, helping to ward off highwaymen and add a touch of flair to the vehicle with aristocratic passengers. (Now we just have cars with racing stripes.) Not surprisingly, the Dalmatian today has an endless capacity for exercise and is the ideal companion for people who jog, skate, or bicycle. He's also a keen competitor in canine sports such as agility and flyball. A Dalmatian must have adequate daily exercise to prevent behavior problems from developing.\n" +
                "\nIf you are considering a Dalmatian, be aware that the breed is not only highly active but also highly intelligent. They need training early in life to establish rules for behavior, or they will decide it is their job to run things. Dalmatians can be a bit headstrong so training must be firm and consistent.\n" +
                "\nAt the same time Dalmatians are sensitive and do not respond well to harsh training methods. You need a positive approach to training with lots of rewards for proper behavior if you want a well-trained dog. Dalmatians are said to not forget mistreatment or harsh behavior.\n" +
                "\nAnother consideration should be the incidence of deafness in the breed. This condition is prevalent in Dalmatians. It is inherited as a polygenic trait, and all Dalmatian bloodlines can pass along deafness to their offspring. Approximately eight percent of Dalmatians are born completely deaf, and 22 to 24 percent are born with hearing in one ear only.\n" +
                "\nThe Dalmatian Club of America recommends euthanasia for all puppies found to be completely deaf. That's because they are more challenging to train and may bite if startled. Nonetheless, some people believe deaf dogs can make just as wonderful pets as hearing dogs if they are trained with hand signals and vibrations so they are less likely to be startled.\n" +
                "\nIf you are considering adopting a deaf puppy or older adult dog, be sure to research the issue and the special care requirements of living with a deaf dog before you suffer the heartbreak of taking the dog in and not being able to manage his care properly.\n" +
                "\nDalmatians have a urinary system unique in the dog world, and they have a few special requirements because of this to prevent medical complications. Their diet should never be extremely high in protein, and they must be allowed access to plenty of fresh water at all times. Dalmatians also should have the opportunity to relieve themselves frequently to keep the urinary system flushed. With these simple protocols in place, your Dalmatian should live a long, healthy life.\n" +
                "\nDalmatians will get along with other pets and children if socialized as a puppy with all types of pets and people. Dalmatians can make a wonderful active playmate for children (with proper supervision to be sure that both the child and the dog are following acceptable rules for behavior).\n" +
                "\nWith the Dalmatian's energy and enthusiasm for games, the dog and child will have a marvelous time tiring each other out. Children younger than 6 years of age may be easily knocked down by this muscular, active, and strong dog. Take special precautions and supervise interactions between smaller children and Dalmatians.\n" +
                "\nYou can participate in numerous dog sports and activities with your Dalmatian. He'll do well in obedience competition with the proper motivational, positive training. He's also an excellent agility competitor as the sport is tailored to athletic dogs such as the Dalmatian.\n" +
                "\nDalmatians make great hiking companions and backpacking dogs, and the sports of flyball and Frisbee are excellent activities for the well-trained Dalmatian. If your dog has the right combination of looks and personality, you may also enjoy the sport of showing dogs, known as conformation, at AKC shows.\n" +
                "\nThe Dalmatian Club of America sponsors a program that offers titles in keeping with the breed's history as carriage dogs. The Road Dog (RD) title and Road Dog Excellent (RDX) are titles earned by the dog accompanying horses or carriages for a certain number of miles and then performing some basic obedience. These trials are usually held in conjunction with the larger specialty shows and with the national show sponsored by the Dalmatian Club of America.\n" +
                "\nWhatever you do with your Dalmatian, whether he is your best friend, active family companion, or seasoned competitor, be sure that with the right combination of exercise, discipline, and love he will be a great addition to your family.",

        "The Golden Retriever is one of the most popular dog breeds in the United States. The breed’s friendly, tolerant attitude makes them great family pets, and their intelligence makes them highly capable working dogs.\n" +
                "\nGolden Retrievers excel at retrieving game for hunters, tracking, sniffing out contraband for law enforcement, and as therapy and service dogs. They’re also natural athletes and do well in dog sports such as agility and competitive obedience.\n" +
                "\nThese dogs are fairly easy to train and get along in just about any home or family. They’re great with kids and very protective of their humans. If you want a loyal, loving, and smart companion, consider adopting one of these pups into your pack.\n" +
                "\nIt's no surprise that the Golden Retriever is one of the top ten most popular dogs in the U.S. It's all good with the Golden: he's highly intelligent, sociable, beautiful, and loyal.\n" +
                "\nHe's also lively. The Golden is slow to mature and retains the silly, playful personality of a puppy until three to four years of age, which can be both delightful and annoying. Many keep their puppyish traits into old age.\n" +
                "\nOriginally bred for the physically demanding job of retrieving ducks and other fowl for hunters, the Golden needs daily exercise: a walk or jog, free time in the yard, a run at the beach or lake (Goldens love water), or a game of fetch. And like other intelligent breeds who were bred to work, they need to have a job to do, such as retrieving the paper, waking up family members, or competing in dog sports. A tired Golden is a well-behaved Golden.\n" +
                "\nAs well as giving your Golden Retriever physical and mental exercise, you should also be prepared to include him in your family activities. The Golden Retriever is a family dog, and he needs to be with his \"pack.\" Don't consider getting a Golden unless you're willing to have him in the house with you, underfoot, every day.\n" +
                "\nThere's one other potential drawback to the breed: He's definitely not a watchdog. He might bark when strangers come around, but don't count on it. Most likely, he'll wag his tail and flash that characteristic Golden smile.",

        "Originally bred to herd cattle, sheep, and horses, the Pembroke Welsh Corgi is an active and intelligent dog breed. Easy to train and eager to learn, Pembrokes are great with children and other pets, and you can find them in four different coat colors and markings.\n" +
                "\nAdaptable and loving with the whole family, Corgis can fit into just about any household, whether it’s an apartment or large home with a yard. However, they do have quite a bit of energy for a small dog. They’ll need plenty of walks and active play sessions. You might be surprised by how quickly these short-legged pups can move! For humans who can meet the breed’s needs, the Pembroke will make an excellent family companion, even for novice pet parents.\n" +
                "\nWelsh Corgis come in two varieties: the Pembroke and the Cardigan. They were registered as one breed by the Kennel Club in the U.K. until 1934, although many breeders believe the two breeds developed separately. Both have similar heads, bodies, levels of intelligence and herding ability, but the Cardigan is slightly larger and heavier boned than the Pembroke.\n" +
                "\nFor most of us, the easiest way to tell the difference between a Pembroke and a Cardigan is to look at the tails. Pembrokes' are docked and Cardigans' are long. (Remember it this way: the Pembroke has a \"broke\" tail; the Cardigan has a long tail like the sleeves of a cardigan sweater.)\n" +
                "\nPembroke Welsh Corgis (also called Pembrokes, PWCs or Pems) are the smallest of the American Kennel Club's Herding Group, and are also recognized by the United Kennel Club. Their coats can be red, sable, fawn or tri-colored (red, black and tan), usually with white markings on the legs, chest, neck, muzzle and belly. They also may have a narrow blaze on their heads. Pembroke heads are shaped much like the head of a fox. Their eyes are oval-shaped and dark, and their ears are erect.\n" +
                "\nThe official AKC breed standard is maintained by the Pembroke Welsh Corgi Club of America.",

        "Descended from large sled dog breeds, the now-tiny Pomeranian has a long and interesting history. The foxy-faced dog, nicknamed “the little dog who thinks he can,” is compact, active, and capable of competing in agility and obedience or simply being a family friend.\n" +
                "\nPoms may be small, but they don’t always act that way and may even challenge larger dogs. While they make for good apartment pets, they can also bark a lot, which your neighbors may not be too thrilled about. But as long as you give your dog plenty of exercise and playtime, keep them out of hot weather, and give them lots of love and attention, you’ll have a loving, adorable, furry family companion!\n" +
                "\nAlthough the Pomeranian (also called Zwergspitz, Dwarf Spitz, Loulou, or, affectionately Pom) only weighs from three to seven pounds, this lively little dog has a personality the size of Texas!\n" +
                "\nThe Pomeranian is the smallest member of the Spitz family of dogs, which includes the Samoyed, Alaskan Malamute, and Norwegian Elkhound, among others.\n" +
                "\nPoms take their name from the province of Pomerania, in Germany. They became especially popular when Queen Victoria allowed some of her Pomeranians to be shown in a conformation show, the first Pomeranians ever to be shown.\n" +
                "\nCute, feisty and furry, Poms are intelligent and loyal to their families. Don't let their cuteness fool you, however. These independent, bold dogs have minds of their own. They are alert and curious about the world around them. Unfortunately, in their minds, they are much larger than they really are, which can sometimes lead them to harass and even attack much larger dogs.\n" +
                "\nLuckily, if they are properly socialized with other dogs and animals, they generally get along quite well with them.\n" +
                "Pomeranians have a wedge-shaped head with erect ears. Some people describe their faces as fox-like, while others think that \"baby-doll\" or \"pansy\" is a better description.\n" +
                "\nTheir dark, almond-shaped eyes sparkle with intelligence and curiosity. Their noses can be dark or the same color as their coats. Their distinctive plumed tail fans out over their back.\n" +
                "\nPomeranians come in a wide variety of solid colors, with red, orange, white or cream, blue, brown, or black being the most common. Rarely, you might see a white Pom with colored markings (called parti-colored), or a black and tan one, or even an orange and sable one. The Pom's profuse double coat stands out from his body, and he has a luxurious ruff around his neck and chest. The coats looks as though it would be difficult to care for, but in reality, regular brushing is typically all it needs.\n" +
                "\nDespite their small size, Pomeranians have a loud bark and make excellent watchdogs. They sometimes don't know when to stop barking, however, so it's a good idea to train them to stop barking on command.\n" +
                "\nPomeranians make excellent pets for older people and those who are busy, because they aren't an overly dependent breed. They are also good for apartment dwellers or homes that don't have a backyard. Because of their small size, they aren't recommended for families with small children who might injure them accidentally.\n" +
                "\nPoms generally are good at learning tricks, but you must be consistent and firm when training them. If you don't establish yourself as top dog in your household, your Pom will be more than glad to take over and may even become snappish.\n" +
                "\nPoms have a lot of energy and enjoy going for walks. They trot along, proudly holding their head up, meeting new people and exploring new sights and smells.\n" +
                "\nMore and more Poms are being trained in obedience, agility, tracking and flyball. Some also have been trained as hearing assistance dogs. They make excellent therapy dogs and bring delight and comfort to the sick and elderly in hospitals and nursing homes. If you'd like a pint-size companion with personality plus, the Pomeranian may be the choice for you.",

        "Elegant. Proud. Clever. The Poodle is an impressive dog, as the many best-in-show winners from this dog breed can attest. But behind the blue ribbons, impressive hairdos, and regal attitude, you’ll find an affectionate family dog with an ancient history and many talents.\n" +
                "\nPoodles are regarded as one of the most intelligent breeds in the world. They’re highly trainable and well suited for just about any task you put them to — and you will want to give them tasks to do. Bored Poodles can get destructive if they aren’t physically and mentally stimulated. But active owners who can meet their dog’s needs will find a loving, smart, trainable, and loyal family companion.\n" +
                "\nAlthough today's Poodles seem to epitomize a life of leisure and luxury, make no mistake: These are real dogs bred to do real jobs. Although it hardly seems possible when you look at a primped-up Poodle in the show ring, the breed was originally a water retriever, a job that requires jumping in the water to fetch waterfowl for hunters.\n" +
                "\nIn fact, the English name poodle is derived from the German word pudel, or pudelin, which means to splash in the water. And in France, Poodles are called Caniche, a name derived from chien canard, meaning duck dog.\n" +
                "\nEven the elaborate coat styling that the breed's known for once had a practical purpose: trimmed areas lightened the weight of the dog's coat and wouldn't snag on underwater debris, while long hair around the joints and vital organs protected the dog from the cold water.\n" +
                "\nThere are three sizes of Poodle, all considered part of the same breed: going from smallest to largest, these are the Toy, the Miniature, and the Standard. The Standard is probably the oldest of the three varieties, and some still carry on the Poodle tradition of working as a water retriever.\n" +
                "\nNo matter the size, Poodles are renowned for a playful but dignified personality and keen intelligence. When it comes to training, this is an \"A\" student, and the Poodle excels at performance sports such as obedience, agility, and hunt tests.\n" +
                "\nDespite his regal air, the Poodle is no snob. These are people-friendly dogs who want to stay close to their families — they get lonely when left by themselves for long periods — and are always up for a good game.",

        "The Pug is often described as a lot of dog in a small space. These sturdy, compact dogs are a part of the American Kennel Club’s Toy group, and are known as the clowns of the canine world because they have a great sense of humor and like to show off.\n" +
                "\nOriginally bred to be lap dogs, Pugs thrive on human companionship. They’re highly sensitive, and though they can make for great apartment pets, they will not appreciate being left home alone for long hours of the day. Although these pups have a stubborn side, especially when it comes to house training, they’re playful, affectionate dogs who will get along well even with novice pet parents. If you’re looking for a loving, easygoing pal, this may be the breed for you!\n" +
                "\nThe Pug's comical face, with deep wrinkles around big, dark eyes and a flat round face, can't help but make you smile. It is believed that the Pug's name comes from the Latin word for \"fist\" because his face resembles a human fist.\n" +
                "\nPugs are clowns at heart, but they carry themselves with dignity. Pugs are playful dogs, ready and able for games, but they are also lovers, and must be close to their humans. Pugs love to be the center of attention, and are heartsick if ignored.\n" +
                "\nPugs are square and thickset, usually weighing no more than 20 pounds. Their heads are large and round, with large, round eyes. They have deep and distinct wrinkles on their faces. Legend has it that the Chinese, who mastered the breeding of this dog, prized these wrinkles because they resembled good luck symbols in their language. Especially prized were dogs with wrinkles that seemed to form the letters for the word \"prince\" in Chinese.\n" +
                "\nThe moles on a Pug's cheeks are called \"beauty spots.\" His muzzle or mask is black, with a clearly defined \"thumb mark\" on the forehead and a black trace down the center of the back. His ears are smooth, black and velvety. He has a characteristic undershot jaw (the lower teeth extend slightly beyond the upper teeth) and a tightly curled tail.\n" +
                "\nPersonality-wise, Pugs are happy and affectionate, loyal and charming, playful and mischievous. They are very intelligent, however, they can be willful, which makes training challenging.\n" +
                "\nWhile Pugs can be good watchdogs, they aren't inclined to be \"yappy,\" something your neighbors will appreciate. If trained and well-socialized, they get along well with other animals and children. Because they are a small, quiet breed and are relatively inactive when indoors, they are a good choice for apartment dwellers. Due to the flat shape of the Pug's face, he does not do well in extremely hot or cold weather, and should be kept indoors.\n" +
                "\nPugs have a short, double coat, and are known for shedding profusely. If you live with a Pug, it's a good idea to invest in a quality vacuum cleaner!",

        "The Shiba Inu dog breed was originally bred to flush birds and small game, and was occasionally used to hunt wild boar. They’re one of Japan’s six native breeds: Akita (large), Kishu, Hokkaido, Kai, Shikoku (medium), and Shiba (small).\n" +
                "\nShibas are known for their spirited personality, small upright ears, and cat-like agility. Today they serve primarily as companion dogs in Japan and the United States.\n" +
                "\nWith his prick ears, squinty eyes, and curly tail, this breed from the Land of the Rising Sun looks like a fox, or perhaps a stuffed toy. He is neither. He is the Shiba Inu, the smallest — and possibly the most ancient — of six spitz dogs that originate in Japan.\n" +
                "\nThe Shiba Inu is known for a bold, fiery personality. The Japanese have three words to describe the breed's mental traits: kaani-i (spirited boldness), ryosei (good nature), and soboku (alertness). Combined, these traits make up the interesting, intelligent, and strong-willed temperament of this breed.\n" +
                "\nThe Shiba Inu is small (about 20 pounds) and athletic. Like a ninja warrior, the Shiba Inu moves quickly, nimbly, effortlessly. He is keen and alert.\n" +
                "\nAnd superior — or so he thinks, according to those who know and love this breed. The Shiba Inu approaches the world with a calm dignity that is uniquely his own, which is likely why he is also described as stubborn.\n" +
                "\nBecause of his independence, the Shiba Inu is not the easiest breed to train. Socialization — the process by which puppies or adults dogs learn how to be friendly and get along with other dogs and people — and training should begin early to teach the Shiba Inu proper canine manners.\n" +
                "\nIt is important to understand the freethinking nature of the Shiba Inu so you won't be frustrated. The Shiba Inu is highly intelligent, but he doesn't necessarily want to do what you want him to do. You may have to make him think obedience is his idea. For best results, it's important to work with a trainer who understands the breed's independence.\n" +
                "\nAnother tendency of the breed is possessiveness. The Shiba Inu guards his stuff, including toys, food, or territory. Proper socialization helps minimize this characteristic, but it's wise to put away any of his favorite toys and treats when other dogs or children are around so he's not tempted to quarrel over them.\n" +
                "\nDespite all of this, the Shiba Inu is a good family dog — he is loyal and devoted — and does well with children as long as he is properly socialized and trained, and the children treat him kindly and respectfully.\n" +
                "\nThe Shiba Inu has been known to show the fiery side of his personality with other dogs and animals. He can be dog-aggressive, especially intact males with intact males. Most Shibas cannot be trusted off leash because they are natural hunters and love the chase. There's a strong chance he will chase a squirrel, chipmunk, or cat. He is generally suspicious of strangers and is a good watchdog, alerting you to anything unusual.\n" +
                "\nGetting outside for some action is also important to a Shiba. He needs a good daily workout, whether it's a walk in the neighborhood or a jog alongside his bicycling owner. He is best suited to a home with a securely fenced yard (he has escape-artist tendencies) where he can romp. He should always be leashed when he's not at home because of his prey drive and potential for dog-aggression.\n" +
                "\nThe Shiba Inu is a wonderful companion, though his strong-willed personality can be too much for some people. Others are charmed by his pluck and loyalty, which is why enthusiasts say that owning a Shiba isn't just owning a dog — it's a way of life.",

        "The Siberian Husky dog breed has a beautiful, thick coat that comes in a multitude of colors and markings. Their blue or multi-colored eyes and striking facial masks only add to the appeal of this breed, which originated in Siberia.\n" +
                "\nIt is easy to see why many are drawn to the Siberian’s wolf-like looks, but beware because this athletic, intelligent dog can act independently and challenge first-time dog parents. Huskies also put the “H” in Houdini and need a yard with a high fence that goes all the way into the ground to prevent escapes. Giving your Husky enough exercise may prove easier said than done; though, it’ll reduce boredom and unwanted behaviors, like escape attempts.\n" +
                "\nDogTime recommends this dog bed to give a good night’s sleep to your medium-sized Husky. You should also pick up this dog fetch toy to help burn off your pup’s high energy!\n" +
                "\nSiberian Huskies have captured the imagination of the masses, as well as artists, writers, and film producers, with their eye-catching looks and awe-inspiring talents. This medium-size working dog possesses power and athleticism. First developed as sled dogs — some are still used in this capacity — Huskies are remarkable dogs — and their ability to learn is staggering.\n" +
                "\nMany have fallen in love with the wild nature and pride of Huskies, but are unaware just what this breed is truly like. This is not a breed for everyone. Their beauty often drives people to purchase them, unaware of their difficult traits, which makes many Siberian Huskies prime candidates for shelters.\n" +
                "\nThe increasing popularity of the breed has led to puppy mills and backyard breeders who do not properly breed for temperament. This is having an adverse effect on the breed at large and many of the negative traits are becoming common in these ill-bred dogs, including some traits that are not normal for Siberian Huskies.\n" +
                "\nIf you look at all the positive points of their temperaments, you are left without any doubt that this is an amazing breed. They are intelligent and independent. They are affectionate with everyone but do not need to constantly pester you for attention. They are not known to be aggressive and generally do well in multi-dog homes. They do well with children and will welcome everyone into their home — yes, even intruders.\n" +
                "\nHowever, they often use that remarkable mind to learn less savory things and are not overly eager to please their people. They are extremely difficult to train, so first-time dog owners or timid people should consider other breeds. Huskies fit best with confident, experienced dog owners who set rules and deliver consistency. Like all breeds, Huskies need obedience training, but they seem to have an uncanny ability to distinguish the difference between home and class — behaving beautifully in class while disregarding commands when at home.\n" +
                "\nThe biggest caution about Siberian Huskies is their reputation for being escape artists. They will wander away from home whenever they get the chance. Sadly, far too many have become lost or injured as a result. It's vital for Siberian Husky owners to constantly check their yards for any means of escape and to surround their yard with a fence sunk into the ground.\n" +
                "\nAlthough they have many qualities that can make them difficult, Siberian Huskies are still a wonderful breed. Fans of this spirited breed embrace their wonderful natures. When properly trained and cared for, Huskies make wonderful family companions.",

        "The Tibetan Terrier was created to be a companion and friend. Dogs of this breed love being with people and are adaptable to a variety of homes and lifestyles. Their shaggy coat is attractive but requires frequent grooming.\n" +
                "\nAffectionate and adaptable, these pups fit in well with just about any family, even apartment dwellers. They do, however, have a lot of energy and need plenty of exercise. They also don’t like being left alone for long hours of the day. If you can give your dog plenty of attention, affection, and physical activity, you’ll have a loving, furry family member.\n" +
                "\nBorn in Tibet, Tibetan Terriers were bred in lamaseries to be companions not only to the holy men who raised them but also to nomadic herdsmen as they wandered the high plains with their flocks. The shaggy, medium-size dogs were thought to bring good luck, so they were never sold but only given as gifts or thanks for favors. People who live with the breed today understand just what a gift they are.\n" +
                "\nThe breed's name is a bit of a misnomer, as the Tibetan Terrier is not a true terrier at all. He was given the name on account of his size, but he doesn't share the terrier's tendency to go to ground (dig for vermin) or the typically sharp-edged terrier temperament. Lively and fun loving, he is, but those characteristics are tempered with a sweet and kind nature. Beneath a fall of hair, his eyes twinkle with good humor.\n" +
                "\nLike all dogs, Tibetan Terriers thrive on human companionship. It's no wonder they excel as therapy dogs. While they're not demons for activity, they are active enough to compete in agility and do well in obedience and rally. Hearkening back to their history as lamasery alarm dogs, they are alert to anything different and make super watchdogs. Their gentle demeanor doesn't suit them to work as guard dogs, however.\n" +
                "\nIt's not unusual for Tibetan Terriers to be reserved with strangers, but they shower affection on their people. They can adapt to life in many different types of households and are a good choice for families with older children who understand how to treat dogs. With their protective double coat and large, flat, round feet to provide traction — in much the same way as snowshoes — they're well suited to homes in snowy climates.\n" +
                "\nThe Tibetan Terrier is a pleasant dog who enjoys life and loves people. He'll adapt to life with a couch potato or an active family, always approaching every day with an endearing sense of humor and a sparkle in his eye."
    )

    val listData: ArrayList<Dog>
        get() {
            val list = arrayListOf<Dog>()
            for (position in dogNames.indices) {
                val dog = Dog()
                dog.name = dogNames[position]
                dog.photo = dogImage[position]
                dog.breed = dogChars[position][0]
                dog.height = dogChars[position][1]
                dog.weight = dogChars[position][2]
                dog.life = dogChars[position][3]
                dog.detail = dogDetail[position]
                dog.favorite = fav[position]
                list.add(dog)
            }
            return list
        }

    val listFav: ArrayList<Dog>
        get() {
            val list = arrayListOf<Dog>()
            for (position in dogNames.indices) {
                if(fav[position]){
                    val dog = Dog()
                    dog.name = dogNames[position]
                    dog.photo = dogImage[position]
                    dog.breed = dogChars[position][0]
                    dog.height = dogChars[position][1]
                    dog.weight = dogChars[position][2]
                    dog.life = dogChars[position][3]
                    dog.detail = dogDetail[position]
                    dog.favorite = fav[position]
                    list.add(dog)
                }
            }
            return list
        }

    fun setFavorite(position: Int) {
        fav[position] = !fav[position]
    }

    fun getFavorite(position: Int) = fav[position]
}