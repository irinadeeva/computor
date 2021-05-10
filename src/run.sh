GREEN='\033[0;32m'
NC='\033[0m'

javac -sourcepath . ./com/bhugo/computor/Computor.java

echo -e "${GREEN}java com.bhugo.computor.Computor${NC}"
java com.bhugo.computor.Computor
echo ""

echo  -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 - 9.3 * X^2 = 1 * X^0\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 - 9.3 * X^2 = 1 * X^0"
echo ""

echo  -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 6 * X^1 - 9.3 * X^2 = 1 * X^0 + 2 * X^1\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 6 * X^1 - 9.3 * X^2 = 1 * X^0 + 2 * X^1"
echo ""

echo  -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 + 9.3 * X^2 = 1 * X^0\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 + 9.3 * X^2 = 1 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 = 4 * X^0\"${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 = 4 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor\"8 * X^0 - 6 * X^1 + 0 * X^2  - 5.6 * X^3 = 3 * X^0\"${NC} "
java com.bhugo.computor.Computor "8 * X^0 - 6 * X^1 + 0 * X^2  - 5.6 * X^3 = 3 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 = 5 * X^0\"${NC}"
java com.bhugo.computor.Computor "5 * X^0 = 5 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"0 * X^0 = 0 * X^0\"${NC}"
java com.bhugo.computor.Computor "0 * X^0 = 0 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"4 * X^0 = 8 * X^0\"${NC}"
java com.bhugo.computor.Computor "4 * X^0 = 8 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 - 9.3 * X^2 + 0 * X^100 = 1 * X^0\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 - 9.3 * X^2 + 0 * X^100 = 1 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 - 0 * X^2 = 1 * X^0\" ${NC} "
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 - 0 * X^2 = 1 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"0 * X^0 + 0 * X^1 - 0 * X^2 = 0 * X^0\" ${NC} "
java com.bhugo.computor.Computor "0 * X^0 + 0 * X^1 - 0 * X^2 = 0 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"1 * X^0 + 0 * X^1 - 0 * X^2 = 0 * X^0\" ${NC} "
java com.bhugo.computor.Computor "1 * X^0 + 0 * X^1 - 0 * X^2 = 0 * X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X^1 - 9.3 * X^2 = 1 * X^0 + 0 * X^100\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X^1 - 9.3 * X^2 = 1 * X^0 + 0 * X^100"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 = 4 * X^0 + 7 * X^1\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 = 4 * X^0 + 7 * X^1"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 13 * X^1 + 3 * X^2 = 1 * X^0 + 1 * X^1\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 13 * X^1 + 3 * X^2 = 1 * X^0 + 1 * X^1"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"6 * X^0 + 11 * X^1 + 5 * X^2 = 1 * X^0 + 1 * X^1\" ${NC}"
java com.bhugo.computor.Computor "6 * X^0 + 11 * X^1 + 5 * X^2 = 1 * X^0 + 1 * X^1"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 3 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 3 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 0 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 0 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"0 * X^0 + 0 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1\" ${NC}"
java com.bhugo.computor.Computor "0 * X^0 + 0 * X^1 + 3 * X^2 = 1 * X^0 + 0 * X^1"
echo ""

echo "BONUS"
echo -e "${GREEN}java com.bhugo.computor.Computor \"5*X^0 + 4*X^1 - 9.3*X^2 = 1*X^0\" ${NC}"
java com.bhugo.computor.Computor "5*X^0 + 4*X^1 - 9.3*X^2 = 1*X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor 5*X^0 + 4*X^1 - 9.3*X^2 = 1*X^0 ${NC}"
java com.bhugo.computor.Computor 5*X^2 + 4*X^0 - 9.3*X^1 = 1*X^0
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor 5*X^0 + 4*X^1 - 9.3*X^2 = X^0 ${NC}"
java com.bhugo.computor.Computor 5*X^0 + 4*X^1 - 9.3*X^2 = X^0
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"5 * X^0 + 4 * X - 9.3 * X^2 = X^0\" ${NC}"
java com.bhugo.computor.Computor "5 * X^0 + 4 * X - 9.3 * X^2 = X^0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X = X\" ${NC}"
java com.bhugo.computor.Computor "X = X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X - X = X\" ${NC}"
java com.bhugo.computor.Computor "X - X = X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X + X = X\" ${NC}"
java com.bhugo.computor.Computor "X + X = X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"-X + X^2 = 0\" ${NC}"
java com.bhugo.computor.Computor "-X + X^2 = 0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X + X^2 = -X\" ${NC}"
java com.bhugo.computor.Computor "X + X^2 = -X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X + X^2 = - X\" ${NC}"
java com.bhugo.computor.Computor "X + X^2 = - X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"X + X^2 = - X\" ${NC}"
java com.bhugo.computor.Computor "X + X^2 = - X"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"-X - X^2 = 0\" ${NC}"
java com.bhugo.computor.Computor "-X - X^2 = 0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"-1 * X - X^2 = 0\" ${NC}"
java com.bhugo.computor.Computor "-X - X^2 = 0"
echo ""

echo -e "${GREEN}java com.bhugo.computor.Computor \"-5*X + 10*X^2 = 0\" ${NC}"
java com.bhugo.computor.Computor "-5*X + 10*X^2 = 0"
echo ""