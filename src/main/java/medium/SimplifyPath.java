package medium;

public class SimplifyPath {
    // https://leetcode.com/problems/simplify-path/
    public String simplifyPath(String path) {
        StringBuilder simplifiedString = new StringBuilder();
        for (String segment: path.split("/")) {
            switch (segment) {
                case "":
                case ".":
                    break;
                case "..":
                    int lastSegmentStartIndex = simplifiedString.lastIndexOf("/");
                    if (lastSegmentStartIndex != -1)
                        simplifiedString.delete(lastSegmentStartIndex, simplifiedString.length());
                    break;
                default:
                    simplifiedString.append('/');
                    simplifiedString.append(segment);

            }
        }
        if (simplifiedString.length() == 0)
            return "/";

        return simplifiedString.toString();
    }
}
