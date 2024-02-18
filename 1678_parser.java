https://leetcode.com/problems/goal-parser-interpretation/submissions/1178748565/
// class Solution {
//     public String interpret(String command) {
//         StringBuilder str = new StringBuilder(command.length());
// 	    for (int i = 0 ; i < command.length() ; i++) {
// 		    if (command.charAt(i) == 'G') {
//                 str.append('G');
//             } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
//                 str.append('o');
// 				i++;
//             } else {
//                 str.append("al");
// 				i = i + 3;
//             }
// 		}
// 	return str.toString();
//     }
// }

class Solution {
    public String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}
