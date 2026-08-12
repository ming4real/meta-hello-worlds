#include <stdio.h>

int main(void)
{
#ifdef ENABLE_COLOUR
    printf("\033[32mHello from PACKAGECONFIG!\033[0m\n");
#else
    puts("Hello from PACKAGECONFIG!");
#endif
    return 0;
}
