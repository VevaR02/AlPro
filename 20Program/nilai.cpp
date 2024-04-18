#include <stdio.h>
int main()
{
    int nilai;
    int kehadiran;
    printf ("PROGRAM PENGELOMPOKKAN NILAI \n");
    printf ("---------------------------- \n");
    printf ("Masukkan nilai (0-100) : "); scanf ("%i", &nilai);
    if (nilai>=90){
    printf ("Masukkan kehadiran = ");scanf ("%i", &kehadiran);
        if (kehadiran>12)
            printf ("Nilai = A+");
        else
            printf ("Nilai = A");
    }       
    else if (nilai>=80){
    printf ("Masukkan kehadiran = ");scanf ("%i", &kehadiran);
        if (kehadiran>12)
            printf ("Nilai = B+");
        else
            printf ("Nilai = B");
    }       
    else if (nilai>=70){
    printf ("Masukkan kehadiran = ");scanf ("%i", &kehadiran);
        if (kehadiran>12)
            printf ("Nilai = C+");
        else
            printf ("Nilai = C");
    }       
    else if (nilai>=60){
    printf ("Masukkan kehadiran = ");scanf ("%i", &kehadiran);
        if (kehadiran>12)
            printf ("Nilai = D+");
        else
            printf ("Nilai = D");
    }       
    else
        printf ("Nilai = E");
}