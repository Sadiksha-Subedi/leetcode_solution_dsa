bool isValid(char* s) {
    int n = strlen(s);
    if (n%2 != 0) return false;

    char stack[n+1];
    int top = -1;

    for (int i = 0; i < n ; i++){
        char ch = s[i];
        
        if (ch == '(' || ch == '{' || ch == '['){
            stack[++top] = ch;
            
        }

        else {
            if (top == -1 ) return false;
            char stackTop = stack[top];
            if (ch == ')' && stackTop != '(') return false;
            if (ch == '}'  && stackTop != '{') return false;
            if ((ch == ']') && (stackTop != '[')) return false;
            top--;
        }
    }

    if (top != -1) return false;

    return true;

}
/* open bracket -> go to the stack
   closed bracket ->check open bracket from the top, reduce top
*/