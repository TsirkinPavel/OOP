// package model.impl;

// import java.util.Comparator;

// import model.User;

// public class UserComparator<T extends User> implements Comparator<T> {

//     @Override
//     public int compare(T o1, T o2) {
//         int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
//         if (resultOfComparing == 0) {
//             return o1.getFirstName().compareTo(o2.getFirstName());            
//         } else {
//             return resultOfComparing;
//         }
//     }
// }
