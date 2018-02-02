Create authentication console application.

User can get any resources like page photo.
Based on Role access user can get or not resources.

User can:
    login
    logout
    info
    get (resource)
    exit

login admin 1234
success login : [admin, 1234, Role admin]
info
current user : [admin, 1234, Role admin]
get page-home
Page[home, home body page]
get photo-img1
Photo[img1, 1160078423]
logout
logout
login test test
success login : [test, test, Role user]
get photo-img1
Error access : Photo[img1, 1160078423]
logout
logout
exit

Process finished with exit code 0