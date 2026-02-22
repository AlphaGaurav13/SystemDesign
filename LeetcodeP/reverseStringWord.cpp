/**
 *    author:  WhiteLion
 *    created: 2026-02-21
 **/
#include <bits/stdc++.h>
using namespace std;
pair<int, int> lekeaya(pair<int,int>&tmkc, string s) {
        int i = 0, j = s.size() - 1;
        while(s[i] != ' ' || s[j] != ' ') {
            if(s[i] ==  ' ') {
                i++;
            }

            if(s[j] == ' ') {
                j--;
            }

            if(s[i] != ' ' and s[j] != ' '){
                break;
            }
        }

        tmkc.first = i;
        tmkc.second = j;

        return tmkc;

    }
    string reverseWords(string s) {
        vector<string> temp;
        string hero = "";
        for(int i = 0; i < s.size(); i++) {
            
            if(s[i] == ' ') {
                temp.push_back(hero);
                hero = "";
                continue;
            }
            hero += s[i];
        }

        if(!hero.empty()) {
            temp.push_back(hero);
        }


        reverse(temp.begin(), temp.end());

        hero = "";
        for(int i = 0; i < temp.size(); i++) {
            hero += temp[i];
            hero += ' ';
        }    
        string ans = "";
        for(int i = 0; i < hero.size() - 1; i++) {
            ans += hero[i];
            if(i != words.size() - 1)
            ans += " ";
        }

        // pair<int, int> tmkc;
        // lekeaya(tmkc, ans);

        // string teenbar = "";
        // for(int i = tmkc.first; i <= tmkc.second; i++) {
        //     teenbar += ans[i];
        // }
        // return tmkc;

        return ans;
    }

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

    string s;
    getline(cin, s);
    string ans = reverseWords(s);
    // cout << hi.first << " " << hi.second << endl;
    // cout <<  s.size() << " " << ans.size() << endl;
    cout << ans << endl;
  return 0;
}