//        TreeSet<Integer> uniqueRanked = new TreeSet<>(ranked);
//        List<Integer> uniqueRankedList = new ArrayList<>(uniqueRanked);
//        System.out.println(ranked);
//        System.out.println(player);
//        int length = uniqueRankedList.size() + 1;
//        System.out.println(length);
//        int pointerRankedList = 0;
//        int pointerPlayer = 0;
//        int play, rank;
//        boolean flag = true;
//        while (flag) {
//            play = player.get(pointerPlayer);
//            rank = uniqueRankedList.get(pointerRankedList);
//            System.out.printf("\nPlayer %d   Rank %d\n", player.get(pointerPlayer), uniqueRankedList.get(pointerRankedList));
//            if (play == rank) {
//                length--;
//                ranks.add(length);
//                pointerPlayer++;
//                pointerRankedList++;
//            } else if (play < rank) {
//                ranks.add(length);
//                pointerPlayer++;
//            } else {
//                pointerRankedList++;
//                length--;
//            }
//
//            System.out.println(ranks);
//            if (rank == uniqueRankedList.getLast()) {
//                flag = false;
//            }
//        }
//        if (player.getLast() > uniqueRankedList.getLast() || uniqueRankedList.isEmpty()) {
//            ranks.add(1);
//        }
//
//        return ranks;

//        List<Integer> ranks = new ArrayList<>();
//
//        uniqueRanked.addAll(ranked);
//        for (int score : player) {
                                   //            Integer rank = uniqueRanked.floor(score);
//            if (rank == null) {
//                ranks.add(1);
//            } else {
//                ranks.add(uniqueRanked.headSet(rank).size() + 1);
//            }
//        }
//        return ranks;


//        int rankedLength = ranked.size();
//        int playerPointer = 0;
//        while (rankedLength >= 0) {
//            if (ranked.get(rankedLength - 2) >= player.get(playerPointer)) {
//                result.add(rankedLength);
//                playerPointer++;
//            }
//            System.out.println(playerPointer);
//            rankedLength--;
//        }
//        if (ranked.getFirst() < player.getLast()) {
//            result.add(1);
//        }

//int rankPointer, current, value;

//for (Integer play : player) {


                              //            rankPointer = 0;
//            value = ranked.get(rankPointer);
//            llist.clear();
//            current = value + 1;
//            while (rankPointer < ranked.size()) {
//                value = ranked.get(rankPointer);
//                if (play < value && current != value) {
//
//                    llist.add(value);
//                    current = value;
//                } else if (play > value) {
//                    rankPointer = ranked.size();
//                }
//                rankPointer++;
//            }
//            result.add(llist.size() + 1);
//}

// List<Integer> llist = new LinkedList<Integer>();
// List<Integer> result = new LinkedList<Integer>();
// int rankPointer, current, value;

// for (Integer play : player) {
    //     rankPointer  = 0;
//     value = ranked.get(rankPointer);
//     llist.clear();
//     current = value + 1;
//     while(rankPointer < ranked.size()){
//         value = ranked.get(rankPointer);
//         if(play < value && current != value){

//             llist.add(value);
//             current = value;
//         } else if(play > value){
//             rankPointer = ranked.size();
//         }
//         rankPointer++;
//     }
//     result.add(llist.size()+1);
// }
// List<Integer> result = new LinkedList<Integer>();

// int rankedLength = ranked.size() - 1;
// int playerPointer = 0;
// while (rankedLength >= 0) {
//     if (ranked.get(rankedLength) >= player.get(playerPointer)) {
//         result.add(rankedLength);
//         playerPointer++;
//     }
//     System.out.println(playerPointer);
//     rankedLength--;
// }
// if (ranked.get(0) < player.get(player.size()-1)) {
//     result.add(1);
// }
//
//        List<Integer> result = new LinkedList<Integer>();
//        SortedSet<Integer> rankedSet = new TreeSet<Integer>(ranked);
//        List<Integer> rankSet = new LinkedList<Integer>(rankedSet);
//
//        int len = rankedSet.size() + 1;
//        int pointerR = 0;
//        int pointerP = 0;
//
//        while (pointerR < len - 1) {
//
//            if (rankSet.get(pointerR) > player.get(pointerP)) {
//                result.add(len - pointerR);
//                System.out.println(result);
//                pointerP++;
//            } else {
//                pointerR++;
//            }
//        }
//
//        if (rankSet.get(0) < player.get(player.size()-1)) {
//            result.add(1);
//        }
//        // if (rankSet.getFirst() < player.getLast()) {
//        //     result.add(1);
//        // }
//        return result;
//
//    }
//    }
//}
