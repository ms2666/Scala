clear

# Compile program
echo Compiling...
scalac $1 -d source
echo DONE

cd source

printf "\n============= Output ===============\n"

# Remove the extension
fullpath=$1
file="${fullpath##*/}"
name="${file%.*}"

scala $name

# navigate out of source
cd ..

printf "====================================\n\n"