print("=====PROGRAM MENGHITUNG BULK DENSITY TANAH=====")
print("Rumus dari Bulk Density : (MTK - (R+T))/Volume Ring")
print(52*"-")
mtk = float(input("Masukkan nilai Massa Tanah Kering (MTK) : "))
r = float(input("Masukkan nilai Massa Ring (R) : "))
t = float(input("Masukkan nilai Massa Tatakan (T) : "))
vr = float(input("Masukkan nilai Volume Ring : "))

bulkDensity = (mtk - (r+t))/vr
print("\nNilai Bulk Density : ",bulkDensity)