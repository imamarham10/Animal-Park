package com.example.biologicalpark

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_ticket.view.*

class MainActivity : AppCompatActivity() {
    var listOfAnimal = ArrayList<Animal>()
    var adapter:AnimalAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //load animals
        listOfAnimal.add(Animal("Lion",
            "Panthera leo",R.drawable.lion,"The lion is a species in the family Felidae and a member of the genus Panthera. It is most recognisable for its muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions have a prominent mane.With a typical head-to-body length of 184–208 cm (72–82 in) they are larger than females at 160–184 cm (63–72 in). It is a social species, forming groups called prides. A lion pride consists of a few adult males, related females and cubs. Groups of female lions usually hunt together, preying mostly on large ungulates. The lion is an apex and keystone predator, although some lions scavenge when opportunities occur, and have been known to hunt humans, although the species typically does not. "))
            listOfAnimal.add(Animal("fox",
            "Vulpes vulpes",R.drawable.fox,"Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae. Foxes have a flattened skull, upright triangular ears, a pointed, slightly upturned snout, and a long bushy tail (or brush).\n" +
                        "\n" +
                        "Twelve species belong to the monophyletic \"true foxes\" group of genus Vulpes. Approximately another 25 current or extinct species are always or sometimes called foxes; these foxes are either part of the paraphyletic group of the South American foxes, or of the outlying group, which consists of the bat-eared fox, gray fox, and island fox.Foxes live on every continent except Antarctica. By far the most common and widespread species of fox is the red fox (Vulpes vulpes) with about 47 recognized subspecies.The global distribution of foxes, together with their widespread reputation for cunning, has contributed to their prominence in popular culture and folklore in many societies around the world. The hunting of foxes with packs of hounds was exported by European settlers to various parts of the New World."))
        listOfAnimal.add(Animal("Koala","Phascolarctos cinereus",R.drawable.koala,"The koala or, inaccurately, koala bear(Phascolarctos cinereus) is an arboreal herbivorous marsupial native to Australia. It is the only extant representative of the family Phascolarctidae and its closest living relatives are the wombats, which are members of the family Vombatidae. The koala is found in coastal areas of the mainland's eastern and southern regions, inhabiting Queensland, New South Wales, Victoria, and South Australia. It is easily recognisable by its stout, tailless body and large head with round, fluffy ears and large, spoon-shaped nose. The koala has a body length of 60–85 cm (24–33 in) and weighs 4–15 kg (9–33 lb). Fur colour ranges from silver grey to chocolate brown. Koalas from the northern populations are typically smaller and lighter in colour than their counterparts further south. These populations possibly are separate subspecies, but this is disputed."))
        listOfAnimal.add(Animal("Rabbit","Oryctolagus cuniculus",R.drawable.rabbit,"Rabbits are small mammals in the family Leporidae of the order Lagomorpha (along with the hare and the pika). Oryctolagus cuniculus includes the European rabbit species and its descendants, the world's 305 breeds of domestic rabbit. Sylvilagus includes 13 wild rabbit species, among them the seven types of cottontail. The European rabbit, which has been introduced on every continent except Antarctica, is familiar throughout the world as a wild prey animal and as a domesticated form of livestock and pet. With its widespread effect on ecologies and cultures, the rabbit (or bunny) is, in many areas of the world, a part of daily life—as food, clothing, a companion, and as a source of artistic inspiration."))
        listOfAnimal.add(
            Animal("Bulldog",
            "Canis lupus familiaris",R.drawable.bulldog,"Bulldogs have characteristically wide heads and shoulders along with a pronounced mandibular prognathism. There are generally thick folds of skin on the brow; round, black, wide-set eyes; a short muzzle with characteristic folds called a rope or nose roll above the nose; hanging skin under the neck; drooping lips and pointed teeth, and an underbite with an upturned jaw. The coat is short, flat, and sleek with colours of red, fawn, white, brindle, and piebald.Bulldogs are one of the few breeds whose tail is naturally short and either straight, screwed or thin and thus is not cut or docked as with some other breeds. A straight tail is a more desirable tail according to the breed standard set forth by the BCA if it is facing downward, not upwards"))
        listOfAnimal.add(
            Animal("Panda",
            "Ailuropoda melanoleuca",R.drawable.panda_shilloutte,"The giant panda has luxuriant black-and-white fur. Adults measure around 1.2 to 1.9 metres (3 feet 11 inches to 6 feet 3 inches) long, including a tail of about 10–15 cm (4–6 in), and 60 to 90 cm (24 to 35 in) tall at the shoulder.Males can weigh up to 160 kg (350 lb).Females (generally 10–20% smaller than males)can weigh as little as 70 kg (150 lb), but can also weigh up to 125 kg (276 lb).Average adult weight is 100 to 115 kg (220 to 254 lb).The giant panda has a body shape typical of bears. It has black fur on its ears, eye patches, muzzle, legs, arms and shoulders. The rest of the animal's coat is white. Although scientists do not know why these unusual bears are black and white, speculation suggests that the bold colouring provides effective camouflage in their shade-dappled snowy and rocky habitat.The giant panda's thick, wooly coat keeps it warm in the cool forests of its habitat.The panda's skull shape is typical of durophagous carnivorans."))
        listOfAnimal.add(Animal("Giraffe",
            "Giraffa",R.drawable.g,"Fully grown giraffes stand 4.3–5.7 m (14.1–18.7 ft) tall, with males taller than females.The tallest recorded male was 5.88 m (19.3 ft) and the tallest recorded female was 5.17 m (17.0 ft) tall.The average weight is 1,192 kg (2,628 lb) for an adult male and 828 kg (1,825 lb) for an adult female with maximum weights of 1,930 kg (4,250 lb) and 1,180 kg (2,600 lb) having been recorded for males and females, respectively.Despite its long neck and legs, the giraffe's body is relatively short.Located at both sides of the head, the giraffe's large, bulging eyes give it good all-round vision from its great height.Giraffes see in colour and their senses of hearing and smell are also sharp.The animal can close its muscular nostrils to protect against sandstorms and ants.The giraffe's prehensile tongue is about 45 cm (18 in) long.It is purplish-black in colour, perhaps to protect against sunburn, and is useful for grasping foliage, as well as for grooming and cleaning the animal's nose."))
        listOfAnimal.add(
            Animal("Eagle",
            "Haliaeetus leucocephalus",R.drawable.eagle,"Eagles are large, powerfully built birds of prey, with heavy heads and beaks. Even the smallest eagles, such as the booted eagle (Aquila pennata), which is comparable in size to a common buzzard (Buteo buteo) or red-tailed hawk (B. jamaicensis), have relatively longer and more evenly broad wings, and more direct, faster flight – despite the reduced size of aerodynamic feathers. Most eagles are larger than any other raptors apart from some vultures. The smallest species of eagle is the South Nicobar serpent eagle (Spilornis klossi), at 450 g (1 lb) and 40 cm (16 in). The largest species are discussed below. Like all birds of prey, eagles have very large, hooked beaks for ripping flesh from their prey, strong, muscular legs, and powerful talons. The beak is typically heavier than that of most other birds of prey. Eagles' eyes are extremely powerful. It is estimated that the martial eagle, whose eye is more than twice as long as a human eye, has a visual acuity 3.0 to 3.6 times that of humans. This acuity enables eagles to spot potential prey from a very long distance.")
        )
        listOfAnimal.add(
            Animal("Tiger",
            "Panthera tigris",R.drawable.tiger1_,"The tiger has a muscular body with powerful forelimbs, a large head and a tail that is about half the length of its body. Its pelage is dense and heavy, and colouration varies between shades of orange and brown with white ventral areas and distinctive vertical black stripes that are unique in each individual.Stripes are likely advantageous for camouflage in vegetation such as long grass with strong vertical patterns of light and shade.A tiger's coat pattern is still visible when it is shaved. This is not due to skin pigmentation, but to the stubble and hair follicles embedded in the skin, similar to human beards (colloquially five o'clock shadow), and is in common with other big cats.They have a mane-like heavy growth of fur around the neck and jaws and long whiskers, especially in males. The pupils are circular with yellow irises. The small, rounded ears have a prominent white spot on the back, surrounded by black.The tiger's skull is similar to a lion's skull, with the frontal region usually less depressed or flattened, and a slightly longer postorbital region."))
        listOfAnimal.add(
            Animal("Zebra",
            "Equus quagga",R.drawable.zebra__2_,"Zebra have barrel-chested bodies with tufted tails, elongated faces and long necks with long, erect manes. Their elongated, slender legs end in a single spade-shaped toe covered in a hard hoof. Their dentition is adapted for grazing; they have large incisors that clip grass blades and highly crowned, ridged molars well suited for grinding. Males have spade-shaped canines, which can be used as weapons in fighting. Zebras have fairly good senses. The eyes are at the sides and far up the head, which allows them to see above the tall grass while grazing. Their moderately long, erect ears are movable and can locate the source of a sound.Zebras are easily recognised by their bold black-and-white striping patterns. The belly and legs are white when unstriped, but the muzzle is dark and the skin underneath the coat is uniformly black.The general pattern for zebras is a dorsal line that extends from the forehead to the tail. From there, the stripes stretch downward except on the rump, where they develop species-specific patterns, and near the nose where they curve toward the nostrils. Zebras also have complex patterns around the eyes and the lower jaw."))

        listOfAnimal.add(Animal("Deer","Cervidae",R.drawable.antler_deer,"Antlers are extensions of an animal's skull found in members of the deer family. Antlers are true bone and are a single structure. They are generally found only on males, with the exception of the reindeer/caribou.Antlers are shed and regrown each year and function primarily as objects of sexual attraction and as weapons in fights between males for control of harems.\n" +
                "\n" +
                "In contrast, horns, found on pronghorns and bovids such as sheep, goats, bison and cattle, are two-part structures. An interior of bone (also an extension of the skull) is covered by an exterior sheath made of keratin, the same material as human fingernails and toenails, grown by specialized hair follicles. Horns are never shed and continue to grow throughout the animal's life. The exception to this rule is the pronghorn which sheds and regrows its horn sheath each year. They usually grow in symmetrical pairs."))
        listOfAnimal.add(Animal("Bear","Ursidae",R.drawable.bear,"Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans. There are eight species in existence: Asiatic black bears (also called moon bears), brown bears (which include grizzly bears), giant pandas, North American black bears, polar bears, sloth bears, spectacled bears (also called Andean bears), and sun bears. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere. Bears are found on the continents of North America, South America, Europe, and Asia. Common characteristics of modern bears include large bodies with stocky legs, long snouts, small rounded ears, shaggy hair, plantigrade paws with five nonretractile claws, and short tails."))
        listOfAnimal.add(Animal("Kangaroo","Macropodidae",R.drawable.kangaroo,"The kangaroo is a marsupial from the family Macropodidae (macropods, meaning large foot). In common use the term is used to describe the largest species from this family, the red kangaroo, as well as the antilopine kangaroo, eastern grey kangaroo, and western grey kangaroo.[1] Kangaroos are indigenous to Australia and New Guinea. The Australian government estimates that 34.3 million kangaroos lived within the commercial harvest areas of Australia in 2011, up from 25.1 million one year earlier.As with the terms \"wallaroo\" and \"wallaby\", \"kangaroo\" refers to a paraphyletic grouping of species. All three refer to members of the same taxonomic family, Macropodidae, and are distinguished according to size. The largest species in the family are called \"kangaroos\" and the smallest are generally called \"wallabies\". The term \"wallaroos\" refers to species of an intermediate size."))
        listOfAnimal.add(Animal("Wolf","Canis lupus",R.drawable.wolf,"The wolf (Canis lupus), also known as the gray wolf or grey wolf, is a large canine native to Eurasia and North America. More than thirty subspecies of Canis lupus have been recognized, and gray wolves, as colloquially understood, comprise non-domestic/feral subspecies. The wolf is the largest extant member of Canidae, males averaging 40 kg (88 lb) and females 37 kg (82 lb). Wolves measure 105–160 cm (41–63 in) in length and 80–85 cm (31–33 in) at shoulder height. The wolf is also distinguished from other Canis species by its less pointed ears and muzzle, as well as a shorter torso and a longer tail. The wolf is nonetheless related closely enough to smaller Canis species, such as the coyote and the golden jackal, to produce fertile hybrids with them. The banded fur of a wolf is usually mottled white, brown, gray, and black, although subspecies in the arctic region may be nearly all white."))
        //adapter
        adapter = AnimalAdapter(this,listOfAnimal)
        tvListAnimal.adapter =adapter


    }

    inner class AnimalAdapter: BaseAdapter
    {
        var context:Context?=null
        var listOfAnimal = ArrayList<Animal>()
        constructor(context: Context, listOfAnimal: ArrayList<Animal>):super() {
            this.listOfAnimal = listOfAnimal
            this.context = context
        }
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View
        {
            val animal:Animal = listOfAnimal[p0]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var myView = inflator.inflate(R.layout.animal_ticket,null)
            myView.tvName.text =animal.name!!
            myView.tvDes.text = animal.des!!
            myView.ivAnimalImage.setImageResource(animal.image!!)
            myView.ivAnimalImage.setOnClickListener{
                val intent = Intent(context,animal_info::class.java)
                intent.putExtra("name",animal.name!!)
                intent.putExtra("infor",animal.infor!!)
                intent.putExtra("image",animal.image!!)
                context!!.startActivity(intent)
            }
            return myView
        }

        override fun getItem(p0: Int): Any {
            return listOfAnimal[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return listOfAnimal.size
        }

    }

}