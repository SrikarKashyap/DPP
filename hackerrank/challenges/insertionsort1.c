#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>

void print_array(int ar_size, int * ar) {
    int j;
    for (j=0;j < ar_size;j++) {
            printf("%d ", ar[j]);
        }
        printf("\n");
}

void insertionSort(int ar_size, int *  ar) {
    int tmp = ar[ar_size-1];
    int i;
    for(i=ar_size - 2;ar[i] > tmp;i--) {
        ar[i+1] = ar[i];
        print_array(ar_size,ar);
    }
    ar[i+1] = tmp;
    print_array(ar_size,ar);
}

int main(void) {

   int _ar_size;
scanf("%d", &_ar_size);
int _ar[_ar_size], _ar_i;
for(_ar_i = 0; _ar_i < _ar_size; _ar_i++) {
   scanf("%d", &_ar[_ar_i]);
}

insertionSort(_ar_size, _ar);

   return 0;
}
