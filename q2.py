def countMax(upRight):
    n = len(upRight)
    # initialize arrays with zeros
    # size is fixed by constraints
    row = [0] * 1000005
    col = [0] * 1000005
    for i in range(n):
        # get the indices per query
        li = upRight[i].split(" ")
        # update appropriate rows and columns
        # for ranges where operations occur
        row[1] += 1
        row[int(li[0]) + 1] -= 1
        col[1] += 1
        col[int(li[1]) + 1] -= 1
    # calculate prefix sums by row and by column
    # while discovering the global maximum value
    sum1 = 0
    sum2 = 0
    mx = 0
    for i in range(1000005):
        sum1 += row[i]
        row[i] = sum1
        sum2 += col[i]
        col[i] = sum2
        mx = max(mx, row[i])
        mx = max(mx, col[i])
    # count the number of cells matching the global maximum 
    cnt1 = 0
    cnt2 = 0
    for i in range(1000005):
        if(row[i] == mx):
            cnt1 += 1
        if(col[i] == mx):
            cnt2 += 1
    
    return cnt1 * cnt2